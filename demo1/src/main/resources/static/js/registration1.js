/**
 * Created by Артур on 16.09.2017.
 */
function registration(name, surname, otech, email) {
    // объявили переменную, которая хранит введенные данные пользователя
    var json = {};
    // засунули данные в JSON
    json["name"] = name;
    json["surname"] = surname;
    json["otech"] = otech;
    json["email"] = email;

    // создали запрос
    var xhr = new XMLHttpRequest();
    // открыли сессию для запроса
    // true - говорит, что запрос асинхронный
    xhr.open("POST", "/users", true);
    // положили заголовки
    xhr.setRequestHeader('Content-Type', 'application/json; charset=UTF-8');
    // отправили JSON преобразовав его в строку
    xhr.send(JSON.stringify(json));
    // перенаправляем страничку
    window.location = "http://localhost:8080/page2.html";}
