/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.movie;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.Movie;
import services.MovieWebService;
import services.MovieWebService_Service;

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "MovieServlet", urlPatterns = {"/MovieServlet"})
public class MovieServlet extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        MovieWebService_Service service = new MovieWebService_Service();
        MovieWebService port = service.getMovieWebServicePort();
        List<Movie> movies = port.listMovies();
        request.setAttribute("movies", movies);
        RequestDispatcher rd = request.getRequestDispatcher("movie/movies.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
