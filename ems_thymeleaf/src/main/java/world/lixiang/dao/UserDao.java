package world.lixiang.dao;


import org.apache.ibatis.annotations.Param;
import world.lixiang.entity.User;

public interface UserDao {
    void save(User user);

    User login(@Param("username") String username , @Param("password") String password);
}
