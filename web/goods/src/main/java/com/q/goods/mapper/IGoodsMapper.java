package com.q.goods.mapper;

import Com.q.entity.Goods;
import java.util.List;

/**
 * Create by Administrator on 2020/2/19 0019
 */
public interface IGoodsMapper {

  List<Integer> getUserLikeGoodsId(Integer userId);
}
