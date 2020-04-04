/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.season;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.TvShow;
import services.TvShowWebService;
import services.TvShowWebService_Service;
import services.Season;
import services.SeasonWebService;
import services.SeasonWebService_Service;

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "UpdateSeason", urlPatterns = {"/UpdateSeason"})
public class UpdateSeason extends HttpServlet {

  @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        
        SeasonWebService_Service service = new SeasonWebService_Service();
        SeasonWebService port = service.getSeasonWebServicePort();
        
        TvShowWebService_Service showService = new TvShowWebService_Service();
        TvShowWebService showPort = showService.getTvShowWebServicePort();
        
        request.setAttribute("season", port.findSeason(id));
        request.setAttribute("shows", showPort.listTvShows());

        RequestDispatcher rd = request.getRequestDispatcher("season/updateSeason.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       Integer id = Integer.parseInt(request.getParameter("id"));
       String title = request.getParameter("title");
       Integer year = Integer.parseInt(request.getParameter("year"));
       Integer show = Integer.parseInt(request.getParameter("show"));
       
       Season m = new Season();
       TvShow g = new TvShow();
       g.setId(show);
       m.setId(id);
       m.setTitle(title);
       m.setYear(year);
       m.setShowid(g);
       
       SeasonWebService_Service service = new SeasonWebService_Service();
       SeasonWebService port = service.getSeasonWebServicePort();
       port.updateSeason(m);
       
       RequestDispatcher rd = request.getRequestDispatcher("/SeasonServlet");
       rd.forward(request, response);
    }
}
