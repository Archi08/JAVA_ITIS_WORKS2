<div id="content">
    <table class="Books">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Author</th>
        </tr>
    <#list model["booksModel"] as book>
        <tr>
            <td>${book.id}</td>
            <td>${book.name}</td>
            <td>${book.author}</td>
        </tr>
    </#list>
    </table>
</div>