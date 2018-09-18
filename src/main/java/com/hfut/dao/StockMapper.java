package com.hfut.dao;

import com.hfut.pojo.Stock;
import com.hfut.pojo.StockExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StockMapper {
    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    long countByExample(StockExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    int deleteByExample(StockExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    int deleteByPrimaryKey(Integer proId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    int insert(Stock record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    int insertSelective(Stock record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    List<Stock> selectByExample(StockExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    Stock selectByPrimaryKey(Integer proId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    int updateByExampleSelective(@Param("record") Stock record, @Param("example") StockExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    int updateByExample(@Param("record") Stock record, @Param("example") StockExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    int updateByPrimaryKeySelective(Stock record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:36 CST 2018
     */
    int updateByPrimaryKey(Stock record);
}