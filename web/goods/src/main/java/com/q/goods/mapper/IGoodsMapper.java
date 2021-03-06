package com.q.goods.mapper;

import Com.q.entity.Goods;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Create by Administrator on 2020/2/19 0019
 */
@Mapper
public interface IGoodsMapper {

  List<String> getUserLikeGoodsId(@Param("userId") Integer userId);

  List<Goods> getGoodsList(@Param("index") Integer index,@Param("end") Integer end);

  long getTotal();

  Integer consumerLikeGoodsType(@Param("gid") Integer gid,@Param("goodsType") Integer goodsType,@Param("userId") Integer userId);
}
