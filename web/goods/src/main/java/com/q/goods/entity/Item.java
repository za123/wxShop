package com.q.goods.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create by Administrator on 2020/2/19 0019
 * goods类对应es中的实体
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {

  private String id;

  //商品类型 关联类型表
  private Integer goodsType;

  //商品名
  private String goodsName;

  //价格
  private BigDecimal price;

  //详细描述
  private String desc;


}
