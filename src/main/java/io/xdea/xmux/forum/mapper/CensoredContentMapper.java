package io.xdea.xmux.forum.mapper;

import io.xdea.xmux.forum.model.CensoredContent;
import io.xdea.xmux.forum.model.CensoredContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface CensoredContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    long countByExample(CensoredContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int deleteByExample(CensoredContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int insert(CensoredContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int insertSelective(CensoredContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    List<CensoredContent> selectByExampleWithRowbounds(CensoredContentExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    List<CensoredContent> selectByExample(CensoredContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    CensoredContent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int updateByExampleSelective(@Param("record") CensoredContent record, @Param("example") CensoredContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int updateByExample(@Param("record") CensoredContent record, @Param("example") CensoredContentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int updateByPrimaryKeySelective(CensoredContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.censored_content
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int updateByPrimaryKey(CensoredContent record);
}