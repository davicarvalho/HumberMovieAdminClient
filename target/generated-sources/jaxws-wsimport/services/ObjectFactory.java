
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FindEpisodeBySeasonResponse_QNAME = new QName("http://services/", "findEpisodeBySeasonResponse");
    private final static QName _Genre_QNAME = new QName("http://services/", "genre");
    private final static QName _Season_QNAME = new QName("http://services/", "season");
    private final static QName _DeleteEpisodeResponse_QNAME = new QName("http://services/", "deleteEpisodeResponse");
    private final static QName _FindEpisodeResponse_QNAME = new QName("http://services/", "findEpisodeResponse");
    private final static QName _AddEpisode_QNAME = new QName("http://services/", "addEpisode");
    private final static QName _UpdateEpisode_QNAME = new QName("http://services/", "updateEpisode");
    private final static QName _Episode_QNAME = new QName("http://services/", "episode");
    private final static QName _ListEpisodes_QNAME = new QName("http://services/", "listEpisodes");
    private final static QName _DeleteEpisode_QNAME = new QName("http://services/", "deleteEpisode");
    private final static QName _UpdateEpisodeResponse_QNAME = new QName("http://services/", "updateEpisodeResponse");
    private final static QName _FindEpisodeBySeason_QNAME = new QName("http://services/", "findEpisodeBySeason");
    private final static QName _AddEpisodeResponse_QNAME = new QName("http://services/", "addEpisodeResponse");
    private final static QName _TvShow_QNAME = new QName("http://services/", "tvShow");
    private final static QName _FindEpisode_QNAME = new QName("http://services/", "findEpisode");
    private final static QName _ListEpisodesResponse_QNAME = new QName("http://services/", "listEpisodesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateEpisodeResponse }
     * 
     */
    public UpdateEpisodeResponse createUpdateEpisodeResponse() {
        return new UpdateEpisodeResponse();
    }

    /**
     * Create an instance of {@link FindEpisodeBySeason }
     * 
     */
    public FindEpisodeBySeason createFindEpisodeBySeason() {
        return new FindEpisodeBySeason();
    }

    /**
     * Create an instance of {@link FindEpisode }
     * 
     */
    public FindEpisode createFindEpisode() {
        return new FindEpisode();
    }

    /**
     * Create an instance of {@link ListEpisodesResponse }
     * 
     */
    public ListEpisodesResponse createListEpisodesResponse() {
        return new ListEpisodesResponse();
    }

    /**
     * Create an instance of {@link AddEpisodeResponse }
     * 
     */
    public AddEpisodeResponse createAddEpisodeResponse() {
        return new AddEpisodeResponse();
    }

    /**
     * Create an instance of {@link TvShow }
     * 
     */
    public TvShow createTvShow() {
        return new TvShow();
    }

    /**
     * Create an instance of {@link ListEpisodes }
     * 
     */
    public ListEpisodes createListEpisodes() {
        return new ListEpisodes();
    }

    /**
     * Create an instance of {@link Episode }
     * 
     */
    public Episode createEpisode() {
        return new Episode();
    }

    /**
     * Create an instance of {@link DeleteEpisode }
     * 
     */
    public DeleteEpisode createDeleteEpisode() {
        return new DeleteEpisode();
    }

    /**
     * Create an instance of {@link FindEpisodeResponse }
     * 
     */
    public FindEpisodeResponse createFindEpisodeResponse() {
        return new FindEpisodeResponse();
    }

    /**
     * Create an instance of {@link AddEpisode }
     * 
     */
    public AddEpisode createAddEpisode() {
        return new AddEpisode();
    }

    /**
     * Create an instance of {@link UpdateEpisode }
     * 
     */
    public UpdateEpisode createUpdateEpisode() {
        return new UpdateEpisode();
    }

    /**
     * Create an instance of {@link FindEpisodeBySeasonResponse }
     * 
     */
    public FindEpisodeBySeasonResponse createFindEpisodeBySeasonResponse() {
        return new FindEpisodeBySeasonResponse();
    }

    /**
     * Create an instance of {@link Genre }
     * 
     */
    public Genre createGenre() {
        return new Genre();
    }

    /**
     * Create an instance of {@link Season }
     * 
     */
    public Season createSeason() {
        return new Season();
    }

    /**
     * Create an instance of {@link DeleteEpisodeResponse }
     * 
     */
    public DeleteEpisodeResponse createDeleteEpisodeResponse() {
        return new DeleteEpisodeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEpisodeBySeasonResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findEpisodeBySeasonResponse")
    public JAXBElement<FindEpisodeBySeasonResponse> createFindEpisodeBySeasonResponse(FindEpisodeBySeasonResponse value) {
        return new JAXBElement<FindEpisodeBySeasonResponse>(_FindEpisodeBySeasonResponse_QNAME, FindEpisodeBySeasonResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Genre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "genre")
    public JAXBElement<Genre> createGenre(Genre value) {
        return new JAXBElement<Genre>(_Genre_QNAME, Genre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Season }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "season")
    public JAXBElement<Season> createSeason(Season value) {
        return new JAXBElement<Season>(_Season_QNAME, Season.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEpisodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteEpisodeResponse")
    public JAXBElement<DeleteEpisodeResponse> createDeleteEpisodeResponse(DeleteEpisodeResponse value) {
        return new JAXBElement<DeleteEpisodeResponse>(_DeleteEpisodeResponse_QNAME, DeleteEpisodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEpisodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findEpisodeResponse")
    public JAXBElement<FindEpisodeResponse> createFindEpisodeResponse(FindEpisodeResponse value) {
        return new JAXBElement<FindEpisodeResponse>(_FindEpisodeResponse_QNAME, FindEpisodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEpisode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "addEpisode")
    public JAXBElement<AddEpisode> createAddEpisode(AddEpisode value) {
        return new JAXBElement<AddEpisode>(_AddEpisode_QNAME, AddEpisode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEpisode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateEpisode")
    public JAXBElement<UpdateEpisode> createUpdateEpisode(UpdateEpisode value) {
        return new JAXBElement<UpdateEpisode>(_UpdateEpisode_QNAME, UpdateEpisode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Episode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "episode")
    public JAXBElement<Episode> createEpisode(Episode value) {
        return new JAXBElement<Episode>(_Episode_QNAME, Episode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEpisodes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listEpisodes")
    public JAXBElement<ListEpisodes> createListEpisodes(ListEpisodes value) {
        return new JAXBElement<ListEpisodes>(_ListEpisodes_QNAME, ListEpisodes.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteEpisode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "deleteEpisode")
    public JAXBElement<DeleteEpisode> createDeleteEpisode(DeleteEpisode value) {
        return new JAXBElement<DeleteEpisode>(_DeleteEpisode_QNAME, DeleteEpisode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateEpisodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "updateEpisodeResponse")
    public JAXBElement<UpdateEpisodeResponse> createUpdateEpisodeResponse(UpdateEpisodeResponse value) {
        return new JAXBElement<UpdateEpisodeResponse>(_UpdateEpisodeResponse_QNAME, UpdateEpisodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEpisodeBySeason }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findEpisodeBySeason")
    public JAXBElement<FindEpisodeBySeason> createFindEpisodeBySeason(FindEpisodeBySeason value) {
        return new JAXBElement<FindEpisodeBySeason>(_FindEpisodeBySeason_QNAME, FindEpisodeBySeason.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddEpisodeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "addEpisodeResponse")
    public JAXBElement<AddEpisodeResponse> createAddEpisodeResponse(AddEpisodeResponse value) {
        return new JAXBElement<AddEpisodeResponse>(_AddEpisodeResponse_QNAME, AddEpisodeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TvShow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "tvShow")
    public JAXBElement<TvShow> createTvShow(TvShow value) {
        return new JAXBElement<TvShow>(_TvShow_QNAME, TvShow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindEpisode }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "findEpisode")
    public JAXBElement<FindEpisode> createFindEpisode(FindEpisode value) {
        return new JAXBElement<FindEpisode>(_FindEpisode_QNAME, FindEpisode.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListEpisodesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services/", name = "listEpisodesResponse")
    public JAXBElement<ListEpisodesResponse> createListEpisodesResponse(ListEpisodesResponse value) {
        return new JAXBElement<ListEpisodesResponse>(_ListEpisodesResponse_QNAME, ListEpisodesResponse.class, null, value);
    }

}
