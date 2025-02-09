<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
    <style>
        body {
            background-color: #d9ead3; /* Fondo similar al de la imagen */
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        h1, h2 {
            margin: 10px 0;
        }
        form {
            margin: 20px auto;
            width: 50%;
            text-align: left;
        }
        table {
            margin: 20px auto;
            border-collapse: collapse;
            width: 80%;
        }
        td, th {
            border: 1px solid black;
            padding: 8px;
            text-align: center;
        }
        th {
            background-color: #b6d7a8; /* Fondo para encabezados */
        }
        input[type="text"], input[type="email"], input[type="date"] {
            width: 100%;
            padding: 5px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }
        input[type="submit"] {
            padding: 5px 20px;
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        input[type="submit"]:hover {
            background-color: #45a049;
        }
        .highlight {
            color: blue;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <h1>REGISTRAR PROVEEDOR</h1>
    <form action="#" method="post">
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre">
        
        <label for="razon_social">Razón Social:</label>
        <input type="text" id="razon_social" name="razon_social">
        
        <label for="ruc">Ruc:</label>
        <input type="text" id="ruc" name="ruc">
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email">
        
        <label for="fecha_ingreso">Fech.Ing.:</label>
        <input type="date" id="fecha_ingreso" name="fecha_ingreso">
        
        <input type="submit" value="Registrar">
    </form>

    <h2 class="highlight">Dato Registrado en la BD</h2>
    <h3>Listado de Proveedores</h3>
    <table>
        <tr>
            <th>Código</th>
            <th>Nom</th>
            <th>R.S.</th>
            <th>Ruc</th>
            <th>Email</th>
            <th>Fech</th>
        </tr>
        <tr>
            <td>6</td>
            <td>farse</td>
            <td>far s.a</td>
            <td>201120</td>
            <td>far@</td>
            <td>08/04</td>
        </tr>
        <tr>
            <td>8</td>
            <td>paner</td>
            <td>pan s.a</td>
            <td>201478</td>
            <td>pa@</td>
            <td>05/04</td>
        </tr>
    </table>
</body>
</html>