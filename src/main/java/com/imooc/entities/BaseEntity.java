package com.imooc.entities;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity<T> implements Serializable {

    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    public Date createTime;

    @JSONField(format = "yyyy-MM-dd hh:mm:ss")
    public Date updateTime;

}
