package com.jk.dao;

import com.jk.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {

    @Query(value = " select count(*) t_user ",nativeQuery = true)
    int findUserCount();

    @Query(value = " select id,user_name,user_sex,user_age,birth,user_number,user_password from t_user ",nativeQuery = true)
    List<User> findUserList();

    @Transactional
    @Modifying
    @Query(value = " delete from t_user where id =:id",nativeQuery = true)
    void delUser(@Param("id") Integer id);

    /*@Query(value = " select id,user_name,user_sex,user_age,user_number,user_password from t_user where id=:id ",nativeQuery = true)
    User findUserById(@Param("id") Integer id);*/

}
