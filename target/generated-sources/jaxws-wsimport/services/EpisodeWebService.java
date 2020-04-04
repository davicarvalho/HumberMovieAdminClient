
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
@WebService(name = "EpisodeWebService", targetNamespace = "http://services/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface EpisodeWebService {


    /**
     * 
     * @param id
     * @return
     *     returns services.Episode
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "findEpisode", targetNamespace = "http://services/", className = "services.FindEpisode")
    @ResponseWrapper(localName = "findEpisodeResponse", targetNamespace = "http://services/", className = "services.FindEpisodeResponse")
    @Action(input = "http://services/EpisodeWebService/findEpisodeRequest", output = "http://services/EpisodeWebService/findEpisodeResponse")
    public Episode findEpisode(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

    /**
     * 
     * @param episode
     * @return
     *     returns services.Episode
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addEpisode", targetNamespace = "http://services/", className = "services.AddEpisode")
    @ResponseWrapper(localName = "addEpisodeResponse", targetNamespace = "http://services/", className = "services.AddEpisodeResponse")
    @Action(input = "http://services/EpisodeWebService/addEpisodeRequest", output = "http://services/EpisodeWebService/addEpisodeResponse")
    public Episode addEpisode(
        @WebParam(name = "episode", targetNamespace = "")
        Episode episode);

    /**
     * 
     * @return
     *     returns java.util.List<services.Episode>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listEpisodes", targetNamespace = "http://services/", className = "services.ListEpisodes")
    @ResponseWrapper(localName = "listEpisodesResponse", targetNamespace = "http://services/", className = "services.ListEpisodesResponse")
    @Action(input = "http://services/EpisodeWebService/listEpisodesRequest", output = "http://services/EpisodeWebService/listEpisodesResponse")
    public List<Episode> listEpisodes();

    /**
     * 
     * @param name
     * @return
     *     returns services.Episode
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "updateEpisode", targetNamespace = "http://services/", className = "services.UpdateEpisode")
    @ResponseWrapper(localName = "updateEpisodeResponse", targetNamespace = "http://services/", className = "services.UpdateEpisodeResponse")
    @Action(input = "http://services/EpisodeWebService/updateEpisodeRequest", output = "http://services/EpisodeWebService/updateEpisodeResponse")
    public Episode updateEpisode(
        @WebParam(name = "name", targetNamespace = "")
        Episode name);

    /**
     * 
     * @param id
     * @return
     *     returns services.Episode
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "deleteEpisode", targetNamespace = "http://services/", className = "services.DeleteEpisode")
    @ResponseWrapper(localName = "deleteEpisodeResponse", targetNamespace = "http://services/", className = "services.DeleteEpisodeResponse")
    @Action(input = "http://services/EpisodeWebService/deleteEpisodeRequest", output = "http://services/EpisodeWebService/deleteEpisodeResponse")
    public Episode deleteEpisode(
        @WebParam(name = "id", targetNamespace = "")
        Integer id);

}
