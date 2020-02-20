package Com.q.entity;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create by Administrator on 2020/2/19 0019
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Goods {

  private Integer id;

  //商品类型 关联类型表
  private Integer goodsType;

  //商品名
  private String goodsName;

  //价格
  private BigDecimal price;

  //详细描述
  private String desc;

  //评价数
  private Integer evaluateNumber;

  //图片
  private String images;

  //库存对象
  private Integer stock;

  //创建时间时间
  private Integer createTime;

  //是否上架
  private Integer status;

}
