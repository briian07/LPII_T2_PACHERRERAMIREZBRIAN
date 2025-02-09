<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*" %>
<%@page import="model.TblProveedorcl2" %>
<%@page import="java.text.SimpleDateFormat" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Gestión de Proveedores</title>
    <style>
        body {
            background-color: #d9ead3;
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
            background-color: #b6d7a8;
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
    <h1>Gestión de Proveedores</h1>
    
    <!-- Formulario para registrar o actualizar proveedores -->
    <form action="ControladorProveedor" method="post">
        <h2>REGISTRAR / ACTUALIZAR PROVEEDOR</h2>
        
        <!-- Ocultar el código para actualizar -->
        <input type="hidden" id="codigo" name="codigo" value="<%= request.getAttribute("codigo") != null ? request.getAttribute("codigo") : "" %>">
        
        <label for="nombre">Nombre:</label>
        <input type="text" id="nombre" name="nombre" value="<%= request.getAttribute("nombre") != null ? request.getAttribute("nombre") : "" %>" required>
        
        <label for="razon_social">Razón Social:</label>
        <input type="text" id="razon_social" name="razon_social" value="<%= request.getAttribute("razon_social") != null ? request.getAttribute("razon_social") : "" %>" required>
        
        <label for="ruc">RUC:</label>
        <input type="text" id="ruc" name="ruc" value="<%= request.getAttribute("ruc") != null ? request.getAttribute("ruc") : "" %>" required>
        
        <label for="email">Email:</label>
        <input type="email" id="email" name="email" value="<%= request.getAttribute("email") != null ? request.getAttribute("email") : "" %>" required>
        
        <label for="fecha_ingreso">Fecha de Ingreso:</label>
        <input type="date" id="fecha_ingreso" name="fecha_ingreso" value="<%= request.getAttribute("fecha") != null ? request.getAttribute("fecha") : "" %>" required>
        
        <input type="submit" value="Registrar">
    </form>


 <h2 class="highlight" >Datos Registrados en la BDs</h2>

    <!-- Sección para listar proveedores -->
    <h2 class="black">Listado de Proveedores</h2>
    <table>
        <tr>
            <th>Código</th>
            <th>Nombre</th>
            <th>Razón Social</th>
            <th>RUC</th>
            <th>Email</th>
            <th>Fecha de Ingreso</th>
            <th colspan="2" align="center">Acciones</th>
        </tr>
        <%
        // Obtener la lista de proveedores del atributo "listadoProveedores"
        List<TblProveedorcl2> listadoProveedores = (List<TblProveedorcl2>) request.getAttribute("listadoProveedores");
        if (listadoProveedores != null && !listadoProveedores.isEmpty()) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            for (TblProveedorcl2 proveedor : listadoProveedores) {
        %>
        <tr>
            <td><%= proveedor.getIdproveedorcl2() %></td>
            <td><%= proveedor.getNomproveedorcl2() %></td>
            <td><%= proveedor.getRsocialproveedorcl2() %></td>
            <td><%= proveedor.getRucproveedorcl2() %></td>
            <td><%= proveedor.getEmailproveedorcl2() %></td>
            <td><%= dateFormat.format(proveedor.getFeingproveedorcl2()) %></td>
            <td>
                <a href="ControladorProveedor?accion=Modificar&cod=<%= proveedor.getIdproveedorcl2() %>" style="text-decoration: none">ACTUALIZAR</a>
            </td>
            <td>
                <a href="ControladorProveedor?accion=Eliminar&cod=<%= proveedor.getIdproveedorcl2() %>" style="text-decoration: none">ELIMINAR</a>
            </td>
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="8">No hay proveedores registrados.</td>
        </tr>
        <%
        }
        %>
    </table>
</body>
</html>
