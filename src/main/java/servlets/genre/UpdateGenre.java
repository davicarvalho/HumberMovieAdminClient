/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.genre;

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

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "UpdateGenre", urlPatterns = {"/UpdateGenre"})
public class UpdateGenre extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        GenreWebService_Service service = new GenreWebService_Service();
        GenreWebService port = service.getGenreWebServicePort();
        Genre genre = port.findGenre(id);
        
        request.setAttribute("genre", genre);
        RequestDispatcher rd = request.getRequestDispatcher("genre/updateGenre.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Integer id = Integer.parseInt(request.getParameter("id"));
       String name = request.getParameter("name");
       Genre g = new Genre();
       g.setId(id);
       g.setName(name);
       
       GenreWebService_Service service = new GenreWebService_Service();
       GenreWebService port = service.getGenreWebServicePort();
       port.updateGenre(g);
       RequestDispatcher rd = request.getRequestDispatcher("/GenreServlet");
        rd.forward(request, response);
    }

}
