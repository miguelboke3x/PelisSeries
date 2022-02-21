<%@ page import="es.miguelboke.Ejercicio1_spring.Persona"%>
<!DOCTYPE html>
<html lang="es">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=devicewidth, initial-scale=1.0">
	<title>Hola Mundo</title>
</head>

<body>
	<h1>Hola ${persona.nombre}</h1>
	<!-- EL -->
	<%=((Persona) request.getAttribute("persona")).getNombre()%>
	<!-- SCRIPTLET JSP -->
</body>

</html>
