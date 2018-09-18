package com.hfut.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.hfut.pojo.Goods;

/**
*  @author author
*/
public interface GoodsMapper {
    List<Goods> selectByDistrict(@Param("goodsDistrict")int goodsDistrict);
    int fixGoodsById(@Param("goods") Goods goods);
    Goods selectById(int id);
    List<Goods> selectAll();
}