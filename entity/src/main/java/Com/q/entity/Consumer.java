package Com.q.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create by Administrator on 2020/2/19 0019
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Consumer {

  private String id;
  private String userName;
  private String passWord;
  //微信回传的解密秘钥
  private String sk;
  //头像 大-小
  private String maxHeadImage;
  private String minHeadImage;
  //年龄
  private Integer age;
  //性别
  private Integer sex;
  //地址 本地址记录用户设为默认的收获地址
  private String address;
}
