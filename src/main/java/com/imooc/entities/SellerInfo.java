package com.imooc.entities;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * Created by SqMax on 2018/3/31.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class SellerInfo extends BaseEntity {
    @TableId
    private String sellerId;

    private String username;

    private String password;

    private String openid;

}
