<#ftl encoding='UTF-8'>
<#import "spring.ftl" as spring />
<@spring.bind "model" />
<head>
    <meta  charset="UTF-8"/>
    <title>Работает сука</title>
</head>
<body>
<div id="container">

    <table class="Films">
        <tr>
            <th>id</th>
            <th>film name</th>
            <th>release date</th>
            <th>country</th>
            <th>producer</th>
            <th>lasting</th>
            <th>description</th>

        </tr>
<#list filmsModel as film>
    <tr>
        <td>${film.id}</td>
        <td>${film.name}</td>
        <td>${film.releaseDate}</td>
        <td>${film.country}</td>
        <td>${film.producer}</td>
        <td>${film.lasting}</td>
        <td>${film.description}</td>
       </tr>

</#list>


    </table>
</div>


</body>