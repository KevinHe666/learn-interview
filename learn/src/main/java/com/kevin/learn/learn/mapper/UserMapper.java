package com.kevin.learn.learn.mapper;

import com.kevin.learn.learn.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @Description:访问数据库的接口
 * @Author: Kevin
 * @Create 2019-07-19 16:22
 */
public interface UserMapper {
    //    推荐使用#{} 不要用${}会有注入的风险
    @Insert("INSERT INTO user(name,phone,create_time,age)" +
            " VALUES(#{name},#{phone},#{createTime},#{age})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
//keyProperty java对象 keyColumn 数据库属性
    int insert(User user);

    @Select("SELECT * FROM user")
    @Results({
            @Result(column = "create_time", property = "createTime")  //javaType = java.util.Date.class
    })
    List<User> getAll();

    @Select("SELECT * FROM user WHERE id = #{id}")
    @Results({
            @Result(column = "create_time", property = "createTime")
    })
    User findById(Long id);

    @Update("UPDATE user SET name=#{name} WHERE id =#{id}")
    void update(User user);

    @Delete("DELETE FROM user WHERE id =#{userId}")
    void delete(Long userId);
}
