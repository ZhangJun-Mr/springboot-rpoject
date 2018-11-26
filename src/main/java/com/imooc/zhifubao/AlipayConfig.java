package com.imooc.zhifubao;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangjun
 */

@Data
@Configuration
@ConfigurationProperties(prefix = "alipay")
public class AlipayConfig {

    private String serveUrl;

    private String appId;

    private String returnUrl;

    private String notifyUrl;

    /**
     * 商户应用私钥cecret
     */
    private String privateKey;

    private String format;

    private String charset;

    private String alipayPublicKey;

    private String signType;








}
