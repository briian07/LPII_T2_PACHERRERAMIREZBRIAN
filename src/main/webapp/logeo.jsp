<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Ingresar al sistemab</title>
</head>
<body bgcolor="#c5dec9">
    <h2 align="center">Ingresar al sistema</h2>
    

    <form method="post" action="ControladorLogueo">
        <table border="2" align="center">
            <tr>
                <td>Usuario</td>
                <td><input type="text" name="usuario"></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Registrar">
                </td>
            </tr>
        </table>
    </form>
</body>
</html>

