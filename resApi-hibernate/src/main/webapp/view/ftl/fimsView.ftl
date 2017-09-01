<div id="content">
    <table class="Users">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Age</th>
        </tr>
    <#list model["filmsModel"] as film>
        <tr>
            <td>${film.id}</td>
            <td>${film.name}</td>

        </tr>
    </#list>
    </table>
</div>