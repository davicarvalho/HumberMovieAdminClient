/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.genre;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.GenreWebService;
import services.GenreWebService_Service;

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "DeleteGenre", urlPatterns = {"/DeleteGenre"})
public class DeleteGenre extends HttpServlet {
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        GenreWebService_Service service = new GenreWebService_Service();
        GenreWebService port = service.getGenreWebServicePort();
        
        Integer id = Integer.parseInt(request.getParameter("id"));
        port.deleteGenre(id);
        
        RequestDispatcher rd = request.getRequestDispatcher("genre/genres.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
