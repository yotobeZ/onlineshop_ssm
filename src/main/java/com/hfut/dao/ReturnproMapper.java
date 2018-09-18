package com.hfut.dao;

import com.hfut.pojo.Returnpro;
import com.hfut.pojo.ReturnproExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReturnproMapper {
    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    long countByExample(ReturnproExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    int deleteByExample(ReturnproExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    int deleteByPrimaryKey(Integer returnId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    int insert(Returnpro record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    int insertSelective(Returnpro record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    List<Returnpro> selectByExample(ReturnproExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    Returnpro selectByPrimaryKey(Integer returnId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    int updateByExampleSelective(@Param("record") Returnpro record, @Param("example") ReturnproExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    int updateByExample(@Param("record") Returnpro record, @Param("example") ReturnproExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    int updateByPrimaryKeySelective(Returnpro record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:30 CST 2018
     */
    int updateByPrimaryKey(Returnpro record);
}