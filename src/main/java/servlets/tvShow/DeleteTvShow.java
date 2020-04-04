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
import services.TvShowWebService;
import services.TvShowWebService_Service;

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "DeleteTvShow", urlPatterns = {"/DeleteTvShow"})
public class DeleteTvShow extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TvShowWebService_Service service = new TvShowWebService_Service();
        TvShowWebService port = service.getTvShowWebServicePort();
        
        Integer id = Integer.parseInt(request.getParameter("id"));
        port.deleteTvShow(id);
        
        RequestDispatcher rd = request.getRequestDispatcher("movie/movies.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
