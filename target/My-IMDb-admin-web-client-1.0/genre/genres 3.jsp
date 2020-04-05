<%-- 
    Document   : genres
    Created on : 4-Mar-2020, 5:54:57 PM
    Author     : davicarvalho
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Genres</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
        <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" ></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" ></script>
    </head>
    <body class="text-center">
        <header>
            <ul class="nav nav-tabs" id="myTab" role="tablist">
               <li class="nav-item">
                    <a class="nav-link" href="/My-IMDb-admin-web-client/MovieServlet">Movies</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/My-IMDb-admin-web-client/TvShowServlet">TV Shows</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/My-IMDb-admin-web-client/SeasonServlet">Seasons</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/My-IMDb-admin-web-client/EpisodeServlet">Episodes</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="/My-IMDb-admin-web-client/GenreServlet">Genres</a>
                </li>
            </ul>
        </header>
        <div class="jumbotron jumbotron-fluid">
            <div class="container">
                
                <table class="table table-striped">
                    <thead class="thead-dark">
                      <tr>
                        <th scope="col">Id</th>
                        <th scope="col">Name</th>
                        <th scope="col" style="width: 30px"></th>
                        <th scope="col" style="width: 30px"><button onclick="addItem()" type="button" class="btn btn-primary">+</button></th>
                      </tr>
                    </thead>
                    <tbody>
                      <c:forEach items="${genres}" var="item">
                        <tr>
                          <td scope="row"> ${item.id}</td>
                          <td> ${item.name}</td>
                          <td><button onclick="updateItem('${item.id}')" type="button" class="btn btn-primary">Update</button></td>
                          <td><button onclick="deleteItem('${item.id}')" type="button" class="btn btn-danger">Delete</button></td>
                        </tr>
                      </c:forEach>
                    </tbody>
                  </table>
            </div>
        </div>
        <script>
            const addItem = () => {
                location = "/My-IMDb-admin-web-client/AddGenre"
            }
            const updateItem = (id) => {
                location = "/My-IMDb-admin-web-client/UpdateGenre?id="+id
            }
             const deleteItem = (id) => {
                location = "/My-IMDb-admin-web-client/DeleteGenre?id="+id
            }
        </script>
    </body>
</html>
