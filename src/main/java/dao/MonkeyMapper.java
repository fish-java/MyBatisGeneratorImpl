package dao;

import entity.Monkey;
import entity.MonkeyExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MonkeyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monkey
     *
     * @mbggenerated Sat Apr 20 11:13:45 CST 2019
     */
    int countByExample(MonkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monkey
     *
     * @mbggenerated Sat Apr 20 11:13:45 CST 2019
     */
    int deleteByExample(MonkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monkey
     *
     * @mbggenerated Sat Apr 20 11:13:45 CST 2019
     */
    @Delete({
        "delete from monkey",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monkey
     *
     * @mbggenerated Sat Apr 20 11:13:45 CST 2019
     */
    @Insert({
        "insert into monkey (id, name, phone_number, ",
        "birthday)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=CHAR}, #{phoneNumber,jdbcType=INTEGER}, ",
        "#{birthday,jdbcType=DATE})"
    })
    int insert(Monkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monkey
     *
     * @mbggenerated Sat Apr 20 11:13:45 CST 2019
     */
    int insertSelective(Monkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monkey
     *
     * @mbggenerated Sat Apr 20 11:13:45 CST 2019
     */
    List<Monkey> selectByExample(MonkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monkey
     *
     * @mbggenerated Sat Apr 20 11:13:45 CST 2019
     */
    @Select({
        "select",
        "id, name, phone_number, birthday",
        "from monkey",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Monkey selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monkey
     *
     * @mbggenerated Sat Apr 20 11:13:45 CST 2019
     */
    int updateByExampleSelective(@Param("record") Monkey record, @Param("example") MonkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monkey
     *
     * @mbggenerated Sat Apr 20 11:13:45 CST 2019
     */
    int updateByExample(@Param("record") Monkey record, @Param("example") MonkeyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monkey
     *
     * @mbggenerated Sat Apr 20 11:13:45 CST 2019
     */
    int updateByPrimaryKeySelective(Monkey record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table monkey
     *
     * @mbggenerated Sat Apr 20 11:13:45 CST 2019
     */
    @Update({
        "update monkey",
        "set name = #{name,jdbcType=CHAR},",
          "phone_number = #{phoneNumber,jdbcType=INTEGER},",
          "birthday = #{birthday,jdbcType=DATE}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Monkey record);
}