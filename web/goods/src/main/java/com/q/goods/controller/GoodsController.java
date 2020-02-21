package com.q.goods.controller;

import Com.q.entity.Goods;
import Com.q.entity.ResultEntity;
import com.github.pagehelper.PageInfo;
import com.q.goods.service.IGoodsService;
import com.q.utils.Constan;
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

    long total = page.getTotal();
    if (total == 0) {
      //获取总数
      total = goodsService.getTotal();
      page.setTotal(total);
      //设置显示数
      page.setPageSize(Constan.PAGE_SHOW_NUMBER);

      //设置总页数
      long pages;
      if (total % Constan.PAGE_SHOW_NUMBER!=0) {
        pages = total / Constan.PAGE_SHOW_NUMBER + 1;
      }else {
        pages = total / Constan.PAGE_SHOW_NUMBER;
      }
      page.setPages((int) pages);
    }
    //设置分页起点
    page.setStartRow(page.getPageNum()*Constan.PAGE_SHOW_NUMBER);
    page.setEndRow(page.getPageNum()*Constan.PAGE_SHOW_NUMBER + Constan.PAGE_SHOW_NUMBER);
    List<Goods> goods = goodsService.getUserLikeGoods(page.getStartRow(),page.getEndRow(),userId);
    page.setList(goods);
    if (goods.size()==0) {
      return ResultEntity.fail("服务器异常", null);
    }
    return ResultEntity.success("messageID-1", page);
  }

  /**
   * 点击喜欢（等同收藏）同时收藏商品id 种类id作为下次打开首页时的推荐数据来源
   * @param goods 商品
   * @param userId 用户id
   * @return
   */
  @PostMapping(value = "/consumerLikeGoodsType")
  public ResultEntity consumerLikeGoodsType(Goods goods, Integer userId) {
    System.out.println("信息");
    Integer result = goodsService.consumerLikeGoodsType(goods.getId(), goods.getGoodsType(), userId);
    if (result > 0) {
      return ResultEntity.success("添加成功", null);
    }
    return ResultEntity.fail("操作失败", null);
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
