package com.q.goods.service.impl;

import Com.q.entity.Goods;
import com.q.goods.mapper.IGoodsMapper;
import com.q.goods.service.IGoodsService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Create by Administrator on 2020/2/19 0019
 */
@Service
public class GoodsServiceImpl implements IGoodsService {

  @Autowired
  private IGoodsMapper goodsMapper;



  @Override
  public List<Goods> getGoodsList(String userName) {

    return null;
  }

  /**
   * 获取用户喜欢过的商品类型，从solr中提取5个同类型商品推荐
   * @param userId
   * @return
   */
  @Override
  public List<Goods> getUserLikeGoods(Integer userId) {
    List<Goods> goodsList = goodsMapper.getGoodsList();
    return goodsList;
  }
}
