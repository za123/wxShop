package com.q.goods.controller;

import Com.q.entity.Goods;
import Com.q.entity.Page;
import Com.q.entity.ResultEntity;
import com.q.goods.service.IGoodsService;
import java.util.ArrayList;
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
  public ResultEntity getGoodsList(Page page,Integer userId) {
    //根据用户名返回用户喜欢过的5个商品 时间倒序
    List<Goods> goodsList = new ArrayList<>();
    if (userId != null) {
      List<Goods> goods = goodsService.getUserLikeGoods(userId);
      if (goods.size() > 0) {

      }
    }

    return ResultEntity.success("messageID-", goodsList);
  }
}
