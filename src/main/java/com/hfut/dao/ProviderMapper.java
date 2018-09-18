package com.hfut.dao;

import com.hfut.pojo.Provider;
import com.hfut.pojo.ProviderExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProviderMapper {
    /**
     *
     * @mbg.generated Sat Sep 15 21:02:27 CST 2018
     */
    long countByExample(ProviderExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:27 CST 2018
     */
    int deleteByExample(ProviderExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:27 CST 2018
     */
    int deleteByPrimaryKey(Integer provideId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:27 CST 2018
     */
    int insert(Provider record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:27 CST 2018
     */
    int insertSelective(Provider record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:27 CST 2018
     */
    List<Provider> selectByExample(ProviderExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:27 CST 2018
     */
    Provider selectByPrimaryKey(Integer provideId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:27 CST 2018
     */
    int updateByExampleSelective(@Param("record") Provider record, @Param("example") ProviderExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:27 CST 2018
     */
    int updateByExample(@Param("record") Provider record, @Param("example") ProviderExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:27 CST 2018
     */
    int updateByPrimaryKeySelective(Provider record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:27 CST 2018
     */
    int updateByPrimaryKey(Provider record);
}