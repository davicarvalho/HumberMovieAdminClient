/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.episode;

import servlets.movie.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.EpisodeWebService;
import services.EpisodeWebService_Service;

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "DeleteEpisode", urlPatterns = {"/DeleteEpisode"})
public class DeleteEpisode extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EpisodeWebService_Service service = new EpisodeWebService_Service();
        EpisodeWebService port = service.getEpisodeWebServicePort();
        
        Integer id = Integer.parseInt(request.getParameter("id"));
        port.deleteEpisode(id);
        
        RequestDispatcher rd = request.getRequestDispatcher("movie/movies.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
