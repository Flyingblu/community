package io.xdea.xmux.forum.mapper;

import io.xdea.xmux.forum.model.Moderate;
import io.xdea.xmux.forum.model.ModerateExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

@Mapper
public interface ModerateMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    long countByExample(ModerateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    int deleteByExample(ModerateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    int insert(Moderate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    int insertSelective(Moderate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    List<Moderate> selectByExampleWithRowbounds(ModerateExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    List<Moderate> selectByExample(ModerateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    Moderate selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    int updateByExampleSelective(@Param("record") Moderate record, @Param("example") ModerateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    int updateByExample(@Param("record") Moderate record, @Param("example") ModerateExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    int updateByPrimaryKeySelective(Moderate record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table forum.moderate
     *
     * @mbg.generated Sat Jan 22 21:57:46 CST 2022
     */
    int updateByPrimaryKey(Moderate record);
}