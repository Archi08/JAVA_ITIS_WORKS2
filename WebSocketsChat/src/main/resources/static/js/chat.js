var token;
function sendMessage(chatId, message) {
    var json = {}
    json["message"] = message.value;
    $.ajax({
        url: 'http://localhost:8080/chats/' + chatId + '/messages',
        type: 'post',
        contentType: "application/json; charset=utf-8",
        dataType: "json",
        headers: {
            'Auth-Token': getCookie("Auth-Token")
        },
        data: JSON.stringify(json)
    })

}

function doConnect() {
    // создается объект websocket
    websocket = new WebSocket("ws://localhost:8080/authHandler");
    // при подключении написать CONNECTED
    websocket.onopen = function (evt) {
          token = getCookie("Auth-Token");
        if (typeof websocket !== 'undefined') {
            websocket.send(token + " " + "1" + " " + $('#message').val());
        } else {
            alert("Not connected.");
        }
        writeStatus("CONNECTED");
    };

    websocket.onclose = function (evt) {
        writeStatus("DISCONNECTED");
    };

    websocket.onmessage = function (evt) {
        writeMessage(evt.data);
    };

    websocket.onerror = function (evt) {
        onError(writeStatus('ERROR:' + evt.data))
    }
}

function getCookie(name) {
    var matches = document.cookie.match(new RegExp(
        "(?:^|; )" + name.replace(/([\.$?*|{}\(\)\[\]\\\/\+^])/g, '\\$1') + "=([^;]*)"
    ));
    return matches ? decodeURIComponent(matches[1]) : undefined;
}

// описываем функцию работы с вебсокетами


    // функция вывода статуса
    function writeStatus(message) {
        $("#statusOutput").val($("#statusOutput").val() + message + '\n');
    }

    // запись сообщения
    function writeMessage(chatId, message) {
        $('#messageOutput').append(chatId + message + '\n');
    }

     function disconnect() {

            if (typeof websocket != 'undefined') {
                websocket.close();
                websocket = undefined;
            } else {
                alert("Not connected.");
            }

}



