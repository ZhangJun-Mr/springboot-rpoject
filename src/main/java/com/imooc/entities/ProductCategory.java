package com.imooc.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * 类目
 * Created by SqMax on 2018/3/17.
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class ProductCategory extends BaseEntity{
    /**
     * 类目id.
     **/
    private Integer categoryId;
    /**
     * 类目名字
     **/
    private String categoryName;
    /**
     * 类目编号
     **/
    private Integer categoryType;


}
