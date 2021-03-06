package pri.growup.persistence.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.growup.persistence.dto.GrowUpVlogMain;
import pri.growup.persistence.dto.GrowUpVlogMainExample;

public interface GrowUpVlogMainMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog_main
     *
     * @mbggenerated
     */
    int countByExample(GrowUpVlogMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog_main
     *
     * @mbggenerated
     */
    int deleteByExample(GrowUpVlogMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog_main
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String vlogMainId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog_main
     *
     * @mbggenerated
     */
    int insert(GrowUpVlogMain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog_main
     *
     * @mbggenerated
     */
    int insertSelective(GrowUpVlogMain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog_main
     *
     * @mbggenerated
     */
    List<GrowUpVlogMain> selectByExample(GrowUpVlogMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog_main
     *
     * @mbggenerated
     */
    GrowUpVlogMain selectByPrimaryKey(String vlogMainId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog_main
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GrowUpVlogMain record, @Param("example") GrowUpVlogMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog_main
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GrowUpVlogMain record, @Param("example") GrowUpVlogMainExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog_main
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GrowUpVlogMain record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_vlog_main
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GrowUpVlogMain record);
}