package io.xdea.xmux.forum.mapper;

import io.xdea.xmux.forum.model.Thread;
import io.xdea.xmux.forum.model.ThreadExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ThreadMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    long countByExample(ThreadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int deleteByExample(ThreadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int insert(Thread record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int insertSelective(Thread record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    List<Thread> selectByExampleWithRowbounds(ThreadExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    List<Thread> selectByExample(ThreadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    Thread selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int updateByExampleSelective(@Param("record") Thread record, @Param("example") ThreadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int updateByExample(@Param("record") Thread record, @Param("example") ThreadExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int updateByPrimaryKeySelective(Thread record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.thread
     *
     * @mbg.generated Thu Nov 07 10:00:12 CST 2024
     */
    int updateByPrimaryKey(Thread record);
}