/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.episode;

import servlets.episode.*;
import java.io.IOException;
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
@WebServlet(name = "UpdateEpisode", urlPatterns = {"/UpdateEpisode"})
public class UpdateEpisode extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        
        EpisodeWebService_Service service = new EpisodeWebService_Service();
        EpisodeWebService port = service.getEpisodeWebServicePort();
        
        SeasonWebService_Service seasonService = new SeasonWebService_Service();
        SeasonWebService seasonPort = seasonService.getSeasonWebServicePort();
        
        request.setAttribute("episode", port.findEpisode(id));
        request.setAttribute("seasons", seasonPort.listSeasons());

        RequestDispatcher rd = request.getRequestDispatcher("episode/updateEpisode.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Integer id = Integer.parseInt(request.getParameter("id"));
       String title = request.getParameter("title");
       Integer number = Integer.parseInt(request.getParameter("number"));
       Integer season = Integer.parseInt(request.getParameter("season"));
       
       Episode m = new Episode();
       Season g = new Season();
       g.setId(season);
       m.setId(id);
       m.setTitle(title);
       m.setEpisodeNumber(number);
       m.setSeasonid(g);
       
       EpisodeWebService_Service service = new EpisodeWebService_Service();
       EpisodeWebService port = service.getEpisodeWebServicePort();
       port.updateEpisode(m);
       
       RequestDispatcher rd = request.getRequestDispatcher("/EpisodeServlet");
       rd.forward(request, response);
    }
}
