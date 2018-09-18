package com.hfut.service.impl;

import com.hfut.dao.GoodsMapper;
import com.hfut.pojo.Goods;
import com.hfut.service.GoodsMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName com.hfut.service
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/7 21:18
 */
@Service
public class GoodsMapperServiceImpl implements GoodsMapperService {
    @Autowired
    GoodsMapper goodsMapper;

    @Override
    public List<Goods> selectByDistrict(int goodsDistrict) {
        return goodsMapper.selectByDistrict(goodsDistrict);
    }

    @Override
    public int fixGoodsById(Goods goods) {

        return goodsMapper.fixGoodsById(goods);
    }

    @Override
    public Goods selectById(int id) {
        return goodsMapper.selectById(id);
    }

    @Override
    public List<Goods> selectAll() {
        return goodsMapper.selectAll();
    }
}
