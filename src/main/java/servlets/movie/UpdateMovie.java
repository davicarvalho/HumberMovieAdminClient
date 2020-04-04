/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.movie;

import java.io.IOException;
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
@WebServlet(name = "UpdateMovie", urlPatterns = {"/UpdateMovie"})
public class UpdateMovie extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        
        MovieWebService_Service service = new MovieWebService_Service();
        MovieWebService port = service.getMovieWebServicePort();
        
        GenreWebService_Service genreService = new GenreWebService_Service();
        GenreWebService genrePort = genreService.getGenreWebServicePort();
        
        request.setAttribute("movie", port.findMovie(id));
        request.setAttribute("genres", genrePort.listGenres());

        RequestDispatcher rd = request.getRequestDispatcher("movie/updateMovie.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Integer id = Integer.parseInt(request.getParameter("id"));
       String title = request.getParameter("title");
       Integer year = Integer.parseInt(request.getParameter("year"));
       Integer genre = Integer.parseInt(request.getParameter("genre"));
       
       Movie m = new Movie();
       Genre g = new Genre();
       g.setId(genre);
       m.setId(id);
       m.setTitle(title);
       m.setYear(year);
       m.setGenreid(g);
       
       MovieWebService_Service service = new MovieWebService_Service();
       MovieWebService port = service.getMovieWebServicePort();
       port.updateMovie(m);
       
       RequestDispatcher rd = request.getRequestDispatcher("/MovieServlet");
       rd.forward(request, response);
    }
}
