package world.lixiang.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import world.lixiang.dao.UserDao;
import world.lixiang.entity.User;
import world.lixiang.service.UserService;

import javax.annotation.Resource;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserDao userDao;

    @Override
    public void regirest(User user) {
        user.setId(UUID.randomUUID().toString());
        userDao.save(user);
    }

    @Override
    public User login(String username, String password) {
        return userDao.login(username,password);
    }
}
