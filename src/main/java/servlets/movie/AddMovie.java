/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.movie;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.Genre;
import services.GenreWebService;
import services.GenreWebService_Service;
import services.Movie;
import services.MovieWebService;
import services.MovieWebService_Service;

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "AddMovie", urlPatterns = {"/AddMovie"})
public class AddMovie extends HttpServlet {

    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenreWebService_Service service = new GenreWebService_Service();
        GenreWebService port = service.getGenreWebServicePort();
        request.setAttribute("genres", port.listGenres());
        RequestDispatcher rd = request.getRequestDispatcher("movie/addMovie.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String title = request.getParameter("title");
       Integer year = Integer.parseInt(request.getParameter("year"));
       Integer genre = Integer.parseInt(request.getParameter("genre"));
       
       Movie m = new Movie();
       Genre g = new Genre();
       g.setId(genre);
       m.setTitle(title);
       m.setYear(year);
       m.setGenreid(g);
       
       MovieWebService_Service service = new MovieWebService_Service();
       MovieWebService port = service.getMovieWebServicePort();
       port.addMovie(m);
       
       RequestDispatcher rd = request.getRequestDispatcher("/MovieServlet");
       rd.forward(request, response);
    }
}
