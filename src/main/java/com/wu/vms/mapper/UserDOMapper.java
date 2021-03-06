package com.wu.vms.mapper;

import com.wu.vms.dataobject.UserDO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    int insert(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    int insertSelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    UserDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    int updateByPrimaryKeySelective(UserDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    int updateByPrimaryKey(UserDO record);

    /**
    * @Description 根据用户名(学号，工号)查找用户
    * @param userId
    * @Return com.wu.vms.dataobject.UserDO
    */
    UserDO selectByUserId(Integer userId);

    int updatePassword(Integer userId,String password);
}