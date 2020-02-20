package com.q.goods.controller;

import Com.q.entity.Goods;
import Com.q.entity.ResultEntity;
import com.github.pagehelper.PageInfo;
import com.q.goods.service.IGoodsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Administrator on 2020/2/19 0019
 * 商品服务
 */
@RestController
@RequestMapping(value = "/goods")
public class GoodsController {

  @Autowired
  private IGoodsService goodsService;


  /**
   * 获取商品列表
   * @param page 分页对象
   * @param userId 用户id
   * @return
   */
  @PostMapping(value = "/getGoodsList")
  public ResultEntity getGoodsList(PageInfo<Goods> page,Integer userId) {
    System.out.println("userId");
    if (userId != null) {
      List<Goods> goods = goodsService.getUserLikeGoods(userId);
      return ResultEntity.success("messageID-1", goods);
    }
    return ResultEntity.fail("服务器异常", null);
  }

  /**
   * 点击喜欢（等同收藏）同时收藏商品id 种类id作为下次打开首页时的推荐数据来源
   * @param goods 商品
   * @param userId 用户id
   * @return
   */
  @PostMapping(value = "/consumerLikeGoodsType")
  public ResultEntity consumerLikeGoodsType(Goods goods, Integer userId) {
    return ResultEntity.success("", null);
  }

  /**
   * 关键词搜索商品
   * @param key 关键词
   * @return
   */
  @PostMapping(value = "/searchGoods")
  public ResultEntity searchGoods(String key) {
    return ResultEntity.success("", null);
  }
}
