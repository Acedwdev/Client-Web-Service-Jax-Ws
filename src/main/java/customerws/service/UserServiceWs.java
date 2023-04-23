
package customerws.service;

import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 3.0.0
 * Generated source version: 3.0
 * 
 */
@WebService(name = "UserServiceWs", targetNamespace = "http://service.sms.acedwdev.com.co/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface UserServiceWs {


    /**
     * 
     * @return
     *     returns java.util.List<customerws.service.User>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "userList", targetNamespace = "http://service.sms.acedwdev.com.co/", className = "customerws.service.UserList")
    @ResponseWrapper(localName = "userListResponse", targetNamespace = "http://service.sms.acedwdev.com.co/", className = "customerws.service.UserListResponse")
    @Action(input = "http://service.sms.acedwdev.com.co/UserServiceWs/userListRequest", output = "http://service.sms.acedwdev.com.co/UserServiceWs/userListResponse")
    public List<User> userList();

}