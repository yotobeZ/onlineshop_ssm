package com.hfut.pojo;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.*;

/**
 * @ClassName com.hfut.controller
 * @Description
 * @Author Liuying[albertliuy@foxmail.com]
 * @Date 2018/3/6 15:56
 */
public @Data class Goods {
    @NotNull
    private Integer id;
    @NotNull(message = "商品名称不能为空")
    @NotEmpty(message = "商品名称不能为空")
    private String goodsName;
    @NotNull
    private Integer billStatus;
    @NotNull
    private Integer goodsDistrict;
    @NotNull
    @Min(value =0,message = "商品价格必须是大于0")
    private Integer goodsPrice;
    @NotNull
    private Integer goodsCount;

    private Date creationTime;

}
