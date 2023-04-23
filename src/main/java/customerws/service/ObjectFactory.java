
package customerws.service;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the customerws.service package. 
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

    private final static QName _UserList_QNAME = new QName("http://service.sms.acedwdev.com.co/", "userList");
    private final static QName _UserListResponse_QNAME = new QName("http://service.sms.acedwdev.com.co/", "userListResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: customerws.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UserList }
     * 
     */
    public UserList createUserList() {
        return new UserList();
    }

    /**
     * Create an instance of {@link UserListResponse }
     * 
     */
    public UserListResponse createUserListResponse() {
        return new UserListResponse();
    }

    /**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserList }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sms.acedwdev.com.co/", name = "userList")
    public JAXBElement<UserList> createUserList(UserList value) {
        return new JAXBElement<UserList>(_UserList_QNAME, UserList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserListResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UserListResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://service.sms.acedwdev.com.co/", name = "userListResponse")
    public JAXBElement<UserListResponse> createUserListResponse(UserListResponse value) {
        return new JAXBElement<UserListResponse>(_UserListResponse_QNAME, UserListResponse.class, null, value);
    }

}
