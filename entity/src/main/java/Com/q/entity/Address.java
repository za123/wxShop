package Com.q.entity;

import java.lang.annotation.Documented;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create by Administrator on 2020/2/19 0019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {

  private Integer id;

  private String province;
  private String city;
  private String town;

  //详细地址 可以为省市区+街道门牌号 也可以为门牌号
  private String descAddress;
}
