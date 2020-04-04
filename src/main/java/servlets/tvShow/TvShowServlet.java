/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.tvShow;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import services.TvShow;
import services.TvShowWebService;
import services.TvShowWebService_Service;

/**
 *
 * @author davicarvalho
 */
@WebServlet(name = "TvShowServlet", urlPatterns = {"/TvShowServlet"})
public class TvShowServlet extends HttpServlet {
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        TvShowWebService_Service service = new TvShowWebService_Service();
        TvShowWebService port = service.getTvShowWebServicePort();
        List<TvShow> shows = port.listTvShows();
        request.setAttribute("shows", shows);
        RequestDispatcher rd = request.getRequestDispatcher("tvShow/tvShows.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}
