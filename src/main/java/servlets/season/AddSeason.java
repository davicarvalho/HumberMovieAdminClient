/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.season;

import java.io.IOException;
import java.io.PrintWriter;
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
import services.TvShow;

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "AddSeason", urlPatterns = {"/AddSeason"})
public class AddSeason extends HttpServlet {

     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TvShowWebService_Service service = new TvShowWebService_Service();
        TvShowWebService port = service.getTvShowWebServicePort();
        request.setAttribute("shows", port.listTvShows());
        RequestDispatcher rd = request.getRequestDispatcher("season/addSeason.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       String title = request.getParameter("title");
       Integer year = Integer.parseInt(request.getParameter("year"));
       Integer show = Integer.parseInt(request.getParameter("show"));
       
       Season m = new Season();
       TvShow g = new TvShow();
       g.setId(show);
       m.setTitle(title);
       m.setYear(year);
       m.setShowid(g);
       
       SeasonWebService_Service service = new SeasonWebService_Service();
       SeasonWebService port = service.getSeasonWebServicePort();
       port.addSeason(m);
       
       RequestDispatcher rd = request.getRequestDispatcher("/SeasonServlet");
       rd.forward(request, response);
    }
}
