<!DOCTYPE html>
<html>
    <head>
        <title>Strona banku</title>
         <meta charset="UTF-8">
         <style>
            table {
             border-collapse: collapse;
             border: 1px solid #0f0;
            }
            td, th {
             border: 1px solid #0f0;
            }
         </style>
    </head>
    <body>
        <h1>Witamy na stronie banku</h1>
        <p>zażółć gęślą jaźń</p>
        <p>Dane klienta</p>
        <table>
            <thead>
                <tr>
                    <th>Imie</th>
                    <th>Nazwisko</th>
                    <th>Rok urodzenia</th>
                    <th>Płeć</th>
                </tr>
            </thead>
            <tbody>
                <td>${requestScope.user.name}</td>
                <td></td>
                <td></td>
                <td></td>
            </tbody>
    </body>
</html>
