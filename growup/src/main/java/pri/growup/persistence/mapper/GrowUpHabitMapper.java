package pri.growup.persistence.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import pri.growup.persistence.dto.GrowUpHabit;
import pri.growup.persistence.dto.GrowUpHabitExample;

public interface GrowUpHabitMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_habit
     *
     * @mbggenerated
     */
    int countByExample(GrowUpHabitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_habit
     *
     * @mbggenerated
     */
    int deleteByExample(GrowUpHabitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_habit
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String habitId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_habit
     *
     * @mbggenerated
     */
    int insert(GrowUpHabit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_habit
     *
     * @mbggenerated
     */
    int insertSelective(GrowUpHabit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_habit
     *
     * @mbggenerated
     */
    List<GrowUpHabit> selectByExample(GrowUpHabitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_habit
     *
     * @mbggenerated
     */
    GrowUpHabit selectByPrimaryKey(String habitId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_habit
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") GrowUpHabit record, @Param("example") GrowUpHabitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_habit
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") GrowUpHabit record, @Param("example") GrowUpHabitExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_habit
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(GrowUpHabit record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table grow_up_habit
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(GrowUpHabit record);
}