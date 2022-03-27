package io.xdea.xmux.forum.mapper;

import io.xdea.xmux.forum.model.Notif;
import io.xdea.xmux.forum.model.NotifExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface NotifMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    long countByExample(NotifExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int deleteByExample(NotifExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int insert(Notif record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int insertSelective(Notif record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    List<Notif> selectByExampleWithRowbounds(NotifExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    List<Notif> selectByExample(NotifExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    Notif selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int updateByExampleSelective(@Param("record") Notif record, @Param("example") NotifExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int updateByExample(@Param("record") Notif record, @Param("example") NotifExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int updateByPrimaryKeySelective(Notif record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.notif
     *
     * @mbg.generated Sun Mar 27 20:25:58 CST 2022
     */
    int updateByPrimaryKey(Notif record);
}