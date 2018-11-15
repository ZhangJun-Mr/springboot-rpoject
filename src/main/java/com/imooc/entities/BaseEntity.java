package com.imooc.entities;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class BaseEntity<T> implements Serializable {
    private Date createTime;

    private Date updateTime;

/*    @TableField(exist = false)
    private Page<T> page;*/
}
