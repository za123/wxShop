package com.q.goods.service;

import Com.q.entity.Goods;
import java.util.List;

/**
 * Create by Administrator on 2020/2/19 0019
 */
public interface IGoodsService {

  List<Goods> getGoodsList(String userName);

  List<Goods> getUserLikeGoods(Integer userId);
}
