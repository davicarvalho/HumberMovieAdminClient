/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.episode;

import servlets.episode.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.Season;
import services.SeasonWebService;
import services.SeasonWebService_Service;
import services.Episode;
import services.EpisodeWebService;
import services.EpisodeWebService_Service;

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "AddEpisode", urlPatterns = {"/AddEpisode"})
public class AddEpisiode extends HttpServlet {
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SeasonWebService_Service service = new SeasonWebService_Service();
        SeasonWebService port = service.getSeasonWebServicePort();
        request.setAttribute("seasons", port.listSeasons());
        RequestDispatcher rd = request.getRequestDispatcher("episode/addEpisode.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String title = request.getParameter("title");
       Integer number = Integer.parseInt(request.getParameter("number"));
       Integer season = Integer.parseInt(request.getParameter("season"));
       
       Episode m = new Episode();
       Season g = new Season();
       g.setId(season);
       m.setTitle(title);
       m.setEpisodeNumber(number);
       m.setSeasonid(g);
       
       EpisodeWebService_Service service = new EpisodeWebService_Service();
       EpisodeWebService port = service.getEpisodeWebServicePort();
       port.addEpisode(m);
       
       RequestDispatcher rd = request.getRequestDispatcher("/EpisodeServlet");
       rd.forward(request, response);
    }
}
