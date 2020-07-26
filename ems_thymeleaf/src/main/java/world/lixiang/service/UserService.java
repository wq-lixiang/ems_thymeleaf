package world.lixiang.service;

import org.springframework.stereotype.Service;
import world.lixiang.entity.User;


public interface UserService {
    void regirest(User user);

    User login(String username , String password);
}
