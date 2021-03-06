package com.wu.vms.mapper;

import com.wu.vms.dataobject.StudentDO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentDOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    int insert(StudentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    int insertSelective(StudentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    StudentDO selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    int updateByPrimaryKeySelective(StudentDO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun Nov 17 16:59:46 CST 2019
     */
    int updateByPrimaryKey(StudentDO record);

    int updateMyTeacher(Integer id,Integer teacherId);

    List<StudentDO> selectStudentsByTeacherId(Integer teacherId);

    int updateStatus(Integer id,Integer status);

    List<StudentDO> selectMyStudents(Integer teacherId);

    List<StudentDO> selectNonMatchedStudents();

    List<StudentDO> selectSuccessStudents();

}