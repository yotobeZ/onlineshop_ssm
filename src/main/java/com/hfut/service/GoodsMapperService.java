package com.hfut.service;

import com.hfut.pojo.Goods;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName com.hfut.service
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/7 21:15
 */

public interface GoodsMapperService {
    List<Goods> selectByDistrict(@Param("goodsDistrict")int goodsDistrict);
    int fixGoodsById(@Param("goods") Goods goods);
    Goods selectById(int id);
    List<Goods> selectAll();
}
