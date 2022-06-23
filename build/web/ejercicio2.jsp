<%-- 
    Document   : ejercicio2
    Created on : 10/06/2022, 06:08:36 PM
    Author     : Hp_Corei7
--%>

<%@page import="Alumnos.alumnos"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    alumnos informacion[] = new alumnos[10];
%>
<%
    informacion[0] = new alumnos("57211000117", "Yosef", "Flores Martinez", 8, 9, 10);
    informacion[1] = new alumnos("57211000135", "Roberto Leonel", "Salgado De La Sancha", 8, 8, 9);
    informacion[2] = new alumnos("57211000112", "Amado", "Perez Cochine", 9, 10, 10);
    informacion[3] = new alumnos("57211000123", "Yonathan Uriel", "Pastrana Tepectzin", 10, 10, 9);
    informacion[4] = new alumnos("57211000118", "Daniel", "Chino Bello", 8, 8, 9);
    informacion[5] = new alumnos("57211000145", "Luis Gustavo", "Tacuba Bonifacio", 9, 8, 9);
    informacion[6] = new alumnos("57211000160", "Victor Manuel", "Bautista Nievez", 9, 8, 8);
    informacion[7] = new alumnos("57211000139", "Susano Eduardo", "Moras Gatica", 9, 10, 8);
    informacion[8] = new alumnos("57211000110", "Veronica", "Marin Jorge", 9, 8, 9);
    informacion[9] = new alumnos("57211000109", "Kevin Ulises", "Garcia Camacho", 9, 9, 9);
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla De Calificaciones Alumnos UT</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    </head>
    <body>
        <div id="content">
            <nav class="navbar navbar-dark bg-dark">
                <a class="navbar-brand" href="#">Unidad Academica De la Region Norte de Guerrero</a>
            </nav>

            <table class="table table-striped" id="tabla">
                <tbody>
                <table class="table table-hover table-dark">
                    <thead>
                        
                            <th scope="col">Matricula</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">DDI</th>
                            <th scope="col">DWI</th>
                            <th scope="col">ECBD</th>
                            <th scope="col">PROMEDIO</th>
                       
                    </thead>
                    <tbody>
                        <%
                            for (int i = 0; i < informacion.length; i++) {
                                out.println(""
                                        + "<tbody>"
                                        + "<tr>"
                                        + "<td class= 'text-center'>" + informacion[i].getMatricula() + "</td>"
                                        + "<td>" + informacion[i].getNombre() + " " + informacion[i].getApellidos() + "</td>"
                                        + "<td class= 'text-center'>" + informacion[i].getDDI() + "</td>"
                                        + "<td class= 'text-center'>" + informacion[i].getDWI() + "</td>"
                                        + "<td class= 'text-center'>" + informacion[i].getECBD() + "</td>"
                                        + "<td class= 'text-center'>" + informacion[i].Promedio(informacion[i].getDDI(), informacion[i].getDWI(), informacion[i].getECBD()) + "</td>"
                                        + "</tr>"
                                        + "</tbody>"
                                );
                            }
                        %>
                    </tbody>
                </table>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.min.js" integrity="sha384-VHvPCCyXqtD5DqJeNxl2dtTyhF78xXNXdkwX1CZeRusQfRKp+tA7hAShOK/B/fQ2" crossorigin="anonymous"></script>


    </body>
</html>
