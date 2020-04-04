/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.season;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.Season;
import services.SeasonWebService;
import services.SeasonWebService_Service;

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "SeasonServlet", urlPatterns = {"/SeasonServlet"})
public class SeasonServlet extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SeasonWebService_Service service = new SeasonWebService_Service();
        SeasonWebService port = service.getSeasonWebServicePort();
        List<Season> seasons = port.listSeasons();
        request.setAttribute("seasons", seasons);
        RequestDispatcher rd = request.getRequestDispatcher("season/seasons.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
