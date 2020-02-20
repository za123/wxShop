package com.q.goods.mapper;

import Com.q.entity.Goods;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * Create by Administrator on 2020/2/19 0019
 */
public interface IGoodsMapper {

  List<String> getUserLikeGoodsId(@Param("userId") Integer userId);
}
