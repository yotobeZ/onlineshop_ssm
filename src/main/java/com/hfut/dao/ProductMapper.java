package com.hfut.dao;

import com.hfut.pojo.Product;
import com.hfut.pojo.ProductExample;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ProductMapper {
    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    long countByExample(ProductExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    int deleteByExample(ProductExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    int deleteByPrimaryKey(Integer proId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    int insert(Product record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    int insertSelective(Product record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    List<Product> selectByExample(ProductExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    Product selectByPrimaryKey(Integer proId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    int updateByPrimaryKeySelective(Product record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:19 CST 2018
     */
    int updateByPrimaryKey(Product record);
}