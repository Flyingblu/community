package io.xdea.xmux.forum.mapper;

import io.xdea.xmux.forum.model.Reply;
import io.xdea.xmux.forum.model.ReplyExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ReplyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    long countByExample(ReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    int deleteByExample(ReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    int insert(Reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    int insertSelective(Reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    List<Reply> selectByExampleWithRowbounds(ReplyExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    List<Reply> selectByExample(ReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    Reply selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    int updateByExampleSelective(@Param("record") Reply record, @Param("example") ReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    int updateByExample(@Param("record") Reply record, @Param("example") ReplyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    int updateByPrimaryKeySelective(Reply record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.reply
     *
     * @mbg.generated Wed Jan 05 21:28:21 CST 2022
     */
    int updateByPrimaryKey(Reply record);
}