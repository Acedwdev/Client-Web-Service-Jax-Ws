

package testcustomerws;

import customerws.service.ImplServiceUserService;
import customerws.service.User;
import customerws.service.UserServiceWs;
import java.util.List;


public class TestUserServiceWs {
    public static void main(String[] args) {
        UserServiceWs serviceUser = new ImplServiceUserService().getImplServiceUserPort();
        
        System.out.println("Run service user list");
        List<User> users = serviceUser.userList();
        for(User user: users){
            System.out.println("User idUser: " + user.getIdUser() + ", name: " + user.getName() + 
                    ", lastName: " + user.getLastName() + ", email: " + user.getEmail() + 
                    ", phone: " + user.getPhone());
        }
        System.out.println("End service user list");
    }
}
