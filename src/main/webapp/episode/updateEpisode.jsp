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
                <form method="POST" action="/My-IMDb-admin-web-client/UpdateEpisode">
                    <input type="hidden" class="form-control" id="id" name="id" value="${episode.id}">
                    <div class="form-group row">
                        <label for="name" class="col-sm-2 col-form-label">Title</label>
                        <div class="col-sm-10">
                           <input type="text" class="form-control" id="title" name="title" placeholder="Title" value="${episode.title}">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="name" class="col-sm-2 col-form-label">Number</label>
                        <div class="col-sm-10">
                           <input type="text" class="form-control" id="year" name="number" placeholder="Number" value="${episode.episodeNumber}">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="name" class="col-sm-2 col-form-label">Season</label>
                        <div class="col-sm-10">
                            <select class="form-control" name="season">
                                <c:forEach items="${seasons}" var="item">
                                    <c:if test = "${episode.seasonid.id == item.id}">
                                        <option selected value="${item.id}">${item.showid.title} - ${item.title}</option>
                                    </c:if>
                                    <c:if test = "${episode.seasonid.id != item.id}">
                                         <option value="${item.id}">${item.showid.title} - ${item.title}</option>
                                    </c:if>
                                 </c:forEach>
                            </select>
                        </div>
                    </div>
                    <button type="submit" class="btn btn-primary">Update</button>
                </form>
            </div>
        </div>
    </body>
</html>