package io.xdea.xmux.forum.mapper;

import io.xdea.xmux.forum.model.Member;
import io.xdea.xmux.forum.model.MemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface MemberMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    long countByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int deleteByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int insert(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int insertSelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    List<Member> selectByExampleWithRowbounds(MemberExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    List<Member> selectByExample(MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    Member selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int updateByExampleSelective(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int updateByExample(@Param("record") Member record, @Param("example") MemberExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int updateByPrimaryKeySelective(Member record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.member
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int updateByPrimaryKey(Member record);
}