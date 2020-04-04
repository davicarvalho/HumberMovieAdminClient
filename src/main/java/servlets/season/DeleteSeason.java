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
import services.SeasonWebService;
import services.SeasonWebService_Service;

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "DeleteSeason", urlPatterns = {"/DeleteSeason"})
public class DeleteSeason extends HttpServlet {

@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        SeasonWebService_Service service = new SeasonWebService_Service();
        SeasonWebService port = service.getSeasonWebServicePort();
        
        Integer id = Integer.parseInt(request.getParameter("id"));
        port.deleteSeason(id);
        
        RequestDispatcher rd = request.getRequestDispatcher("season/seasons.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
