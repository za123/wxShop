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

  /**
   * 获取用户喜欢过的商品类型，从solr中提取5个同类型商品推荐
   * @param userName
   * @return
   */
  @Override
  public List<Goods> getGoodsList(String userName) {

    return null;
  }

  @Override
  public List<Goods> getUserLikeGoods(Integer userId) {
    ArrayList<Goods> goodsList = new ArrayList<>();
    List<String> userLikeGoodsTypeNames = goodsMapper.getUserLikeGoodsId(userId);
    if (userLikeGoodsTypeNames.size() > 0) {
      //根据种类 去索引库获取5个用户喜欢商品

    }

    return null;
  }
}
