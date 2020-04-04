/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.tvShow;

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
import services.TvShow;
import services.TvShowWebService;
import services.TvShowWebService_Service;


/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "AddTvShow", urlPatterns = {"/AddTvShow"})
public class AddTvShow extends HttpServlet {

    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenreWebService_Service service = new GenreWebService_Service();
        GenreWebService port = service.getGenreWebServicePort();
        request.setAttribute("genres", port.listGenres());
        RequestDispatcher rd = request.getRequestDispatcher("tvShow/addTvShow.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String title = request.getParameter("title");
       Integer yearStart = Integer.parseInt(request.getParameter("yearStart"));
       Integer yearEnd = Integer.parseInt(request.getParameter("yearEnd"));
       Integer genre = Integer.parseInt(request.getParameter("genre"));
       
       TvShow m = new TvShow();
       Genre g = new Genre();
       g.setId(genre);
       m.setTitle(title);
       m.setYearEnd(yearEnd);
       m.setYearStart(yearStart);
       m.setGenreid(g);
       
       TvShowWebService_Service service = new TvShowWebService_Service();
       TvShowWebService port = service.getTvShowWebServicePort();
       port.addTvShow(m);
       
       RequestDispatcher rd = request.getRequestDispatcher("/TvShowServlet");
       rd.forward(request, response);
    }
}
