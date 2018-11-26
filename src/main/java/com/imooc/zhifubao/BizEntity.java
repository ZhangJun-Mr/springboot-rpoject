package com.imooc.zhifubao;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import lombok.experimental.Accessors;
import sun.plugin2.message.Serializer;

import java.io.Serializable;
import java.util.Map;

/**
 * @author zhangjun
 */
@Data
@Accessors(chain = true)
public class BizEntity implements Serializable {

    @JSONField(name = "out_trade_no")
    private String outTradeNo;

    @JSONField(name = "product_code")
    private String productCode;

    @JSONField(name = "total_amount")
    private String totalAmount;

    private String subject;

    private String body;

    @JSONField(name = "passback_params")
    private String passbackParams;

    /**
     * 填充业务参数
     */
    @JSONField(name = "extend_params")
    private Map<String, String> extendParams;

}
