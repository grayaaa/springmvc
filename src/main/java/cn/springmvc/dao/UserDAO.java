package cn.springmvc.dao;

import cn.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

public interface UserDAO {

    /**
     * 添加新用户
     *
     * @param user
     * @return
     */

    public int insertUser(User user);


}
