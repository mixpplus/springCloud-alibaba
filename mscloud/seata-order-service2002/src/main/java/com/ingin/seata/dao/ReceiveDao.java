package com.ingin.seata.dao;


import com.ingin.seata.pojo.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

/**
 * @author ingin
 * @version 1.0
 * @date 2020-05-14 15:14
 */
@Mapper
@Repository
public interface ReceiveDao extends tk.mybatis.mapper.common.Mapper<Account> {
    @Update("UPDATE `account` SET `money` = `money` + #{money} WHERE `id` = #{id};")
    void receive(@Param("id") Long id, @Param("money") Double money);
}
