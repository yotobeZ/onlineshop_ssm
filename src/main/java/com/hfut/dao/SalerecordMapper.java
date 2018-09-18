package com.hfut.dao;

import com.hfut.pojo.Salerecord;
import com.hfut.pojo.SalerecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SalerecordMapper {
    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    long countByExample(SalerecordExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    int deleteByExample(SalerecordExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    int deleteByPrimaryKey(Integer saleId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    int insert(Salerecord record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    int insertSelective(Salerecord record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    List<Salerecord> selectByExample(SalerecordExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    Salerecord selectByPrimaryKey(Integer saleId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    int updateByExampleSelective(@Param("record") Salerecord record, @Param("example") SalerecordExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    int updateByExample(@Param("record") Salerecord record, @Param("example") SalerecordExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    int updateByPrimaryKeySelective(Salerecord record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:33 CST 2018
     */
    int updateByPrimaryKey(Salerecord record);
}