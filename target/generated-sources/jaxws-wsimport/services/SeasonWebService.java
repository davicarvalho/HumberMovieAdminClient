
package services;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.8
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SeasonWebService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SeasonWebService {


    /**
     * 
     * @param season
     * @return
     *     returns services.Season
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addSeason", targetNamespace = "http://services/", className = "services.AddSeason")
    @ResponseWrapper(localName = "addSeasonResponse", targetNamespace = "http://services/", className = "services.AddSeasonResponse")
    @Action(input = "http://services/SeasonWebService/addSeasonRequest", output = "http://services/SeasonWebService/addSeasonResponse")
    public Season addSeason(
        @WebParam(name = "season", targetNamespace = "")
        Season season);

    /**
     * 
     * @param id
     * @return
     *     returns services.Season
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findSeason", targetNamespace = "http://services/", className = "services.FindSeason")
    @ResponseWrapper(localName = "findSeasonResponse", targetNamespace = "http://services/", className = "services.FindSeasonResponse")
    @Action(input = "http://services/SeasonWebService/findSeasonRequest", output = "http://services/SeasonWebService/findSeasonResponse")
    public Season findSeason(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

    /**
     * 
     * @return
     *     returns java.util.List<services.Season>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listSeasons", targetNamespace = "http://services/", className = "services.ListSeasons")
    @ResponseWrapper(localName = "listSeasonsResponse", targetNamespace = "http://services/", className = "services.ListSeasonsResponse")
    @Action(input = "http://services/SeasonWebService/listSeasonsRequest", output = "http://services/SeasonWebService/listSeasonsResponse")
    public List<Season> listSeasons();

    /**
     * 
     * @param name
     * @return
     *     returns services.Season
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateSeason", targetNamespace = "http://services/", className = "services.UpdateSeason")
    @ResponseWrapper(localName = "updateSeasonResponse", targetNamespace = "http://services/", className = "services.UpdateSeasonResponse")
    @Action(input = "http://services/SeasonWebService/updateSeasonRequest", output = "http://services/SeasonWebService/updateSeasonResponse")
    public Season updateSeason(
        @WebParam(name = "name", targetNamespace = "")
        Season name);

    /**
     * 
     * @param id
     * @return
     *     returns services.Season
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteSeason", targetNamespace = "http://services/", className = "services.DeleteSeason")
    @ResponseWrapper(localName = "deleteSeasonResponse", targetNamespace = "http://services/", className = "services.DeleteSeasonResponse")
    @Action(input = "http://services/SeasonWebService/deleteSeasonRequest", output = "http://services/SeasonWebService/deleteSeasonResponse")
    public Season deleteSeason(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

}