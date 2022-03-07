package io.xdea.xmux.forum.mapper;

import io.xdea.xmux.forum.model.LikedThread;
import io.xdea.xmux.forum.model.LikedThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface LikedThreadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    long countByExample(LikedThreadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    int deleteByExample(LikedThreadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    int insert(LikedThread record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    int insertSelective(LikedThread record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    List<LikedThread> selectByExampleWithRowbounds(LikedThreadExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    List<LikedThread> selectByExample(LikedThreadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    LikedThread selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    int updateByExampleSelective(@Param("record") LikedThread record, @Param("example") LikedThreadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    int updateByExample(@Param("record") LikedThread record, @Param("example") LikedThreadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    int updateByPrimaryKeySelective(LikedThread record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.liked_thread
     *
     * @mbg.generated Mon Mar 07 13:48:24 CST 2022
     */
    int updateByPrimaryKey(LikedThread record);
}