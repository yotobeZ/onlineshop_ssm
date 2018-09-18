package com.hfut.dao;

import com.hfut.pojo.Userlog;
import com.hfut.pojo.UserlogExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserlogMapper {
    /**
     *
     * @mbg.generated Sat Sep 15 21:02:39 CST 2018
     */
    long countByExample(UserlogExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:39 CST 2018
     */
    int deleteByExample(UserlogExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:39 CST 2018
     */
    int deleteByPrimaryKey(Integer logId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:39 CST 2018
     */
    int insert(Userlog record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:39 CST 2018
     */
    int insertSelective(Userlog record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:39 CST 2018
     */
    List<Userlog> selectByExample(UserlogExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:39 CST 2018
     */
    Userlog selectByPrimaryKey(Integer logId);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:39 CST 2018
     */
    int updateByExampleSelective(@Param("record") Userlog record, @Param("example") UserlogExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:39 CST 2018
     */
    int updateByExample(@Param("record") Userlog record, @Param("example") UserlogExample example);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:39 CST 2018
     */
    int updateByPrimaryKeySelective(Userlog record);

    /**
     *
     * @mbg.generated Sat Sep 15 21:02:39 CST 2018
     */
    int updateByPrimaryKey(Userlog record);
}