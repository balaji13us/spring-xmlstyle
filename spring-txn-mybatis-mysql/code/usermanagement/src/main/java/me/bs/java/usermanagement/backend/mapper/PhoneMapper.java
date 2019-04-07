package me.bs.java.usermanagement.backend.mapper;

import java.util.List;
import me.bs.java.usermanagement.backend.model.Phone;
import me.bs.java.usermanagement.backend.model.PhoneCriteria;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.annotations.SelectKey;

public interface PhoneMapper {

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@SelectProvider(type = PhoneSqlProvider.class, method = "countByExample")
	long countByExample(PhoneCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@DeleteProvider(type = PhoneSqlProvider.class, method = "deleteByExample")
	int deleteByExample(PhoneCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@Delete({ "delete from PHONE", "where ID = #{id,jdbcType=BIGINT}" })
	int deleteByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@Insert({ "insert into PHONE (NUMBER, IS_PRIMARY, ", "PROXY, PHONE_TYPE, ", "PERSON_ID)",
			"values (#{number,jdbcType=VARCHAR}, #{isPrimary,jdbcType=VARCHAR}, ",
			"#{proxy,jdbcType=VARCHAR}, #{phoneType,jdbcType=VARCHAR}, ", "#{personId,jdbcType=BIGINT})" })
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insert(Phone record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@InsertProvider(type = PhoneSqlProvider.class, method = "insertSelective")
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = Long.class)
	int insertSelective(Phone record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@SelectProvider(type = PhoneSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "NUMBER", property = "number", jdbcType = JdbcType.VARCHAR),
			@Result(column = "IS_PRIMARY", property = "isPrimary", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PROXY", property = "proxy", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PHONE_TYPE", property = "phoneType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PERSON_ID", property = "personId", jdbcType = JdbcType.BIGINT) })
	List<Phone> selectByExampleWithRowbounds(PhoneCriteria example, RowBounds rowBounds);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@SelectProvider(type = PhoneSqlProvider.class, method = "selectByExample")
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "NUMBER", property = "number", jdbcType = JdbcType.VARCHAR),
			@Result(column = "IS_PRIMARY", property = "isPrimary", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PROXY", property = "proxy", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PHONE_TYPE", property = "phoneType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PERSON_ID", property = "personId", jdbcType = JdbcType.BIGINT) })
	List<Phone> selectByExample(PhoneCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@Select({ "select", "ID, NUMBER, IS_PRIMARY, PROXY, PHONE_TYPE, PERSON_ID", "from PHONE",
			"where ID = #{id,jdbcType=BIGINT}" })
	@Results({ @Result(column = "ID", property = "id", jdbcType = JdbcType.BIGINT, id = true),
			@Result(column = "NUMBER", property = "number", jdbcType = JdbcType.VARCHAR),
			@Result(column = "IS_PRIMARY", property = "isPrimary", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PROXY", property = "proxy", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PHONE_TYPE", property = "phoneType", jdbcType = JdbcType.VARCHAR),
			@Result(column = "PERSON_ID", property = "personId", jdbcType = JdbcType.BIGINT) })
	Phone selectByPrimaryKey(Long id);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@UpdateProvider(type = PhoneSqlProvider.class, method = "updateByExampleSelective")
	int updateByExampleSelective(@Param("record") Phone record, @Param("example") PhoneCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@UpdateProvider(type = PhoneSqlProvider.class, method = "updateByExample")
	int updateByExample(@Param("record") Phone record, @Param("example") PhoneCriteria example);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@UpdateProvider(type = PhoneSqlProvider.class, method = "updateByPrimaryKeySelective")
	int updateByPrimaryKeySelective(Phone record);

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PHONE
	 * @mbg.generated  Sat Apr 06 20:22:22 IST 2019
	 */
	@Update({ "update PHONE", "set NUMBER = #{number,jdbcType=VARCHAR},", "IS_PRIMARY = #{isPrimary,jdbcType=VARCHAR},",
			"PROXY = #{proxy,jdbcType=VARCHAR},", "PHONE_TYPE = #{phoneType,jdbcType=VARCHAR},",
			"PERSON_ID = #{personId,jdbcType=BIGINT}", "where ID = #{id,jdbcType=BIGINT}" })
	int updateByPrimaryKey(Phone record);
}