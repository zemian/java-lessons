<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Servlet WebApp</title>
</head>
<body>

<h1>System Information</h1>
<table>
    <tr>
        <td>Name</td>
        <td>Value</td>
    </tr>
    <% for (String name : System.getProperties().stringPropertyNames()) {
        out.println("<tr>");
        out.println("<td>" + name + "</td>");
        out.println("<td>" + System.getProperty(name) + "</td>");
        out.println("</tr>");
    }
    %>
</table>

</body>
</html>