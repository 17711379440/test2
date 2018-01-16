package com.accp.dao;

import com.accp.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @Description:
 * @Author: liyong
 * @CreateDate: 2018/1/13 15:43
 * @Version: 1.0
 */
public interface UserDao {

    //        @Insert("insert into t_user values(null,#{user.username},#{user.password})")
    int add(@Param("user") User user);

    //        @Select("select * from t_user where id = #{id}")
    User findById(int id);
}
