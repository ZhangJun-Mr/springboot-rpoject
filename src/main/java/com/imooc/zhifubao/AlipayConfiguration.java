package com.imooc.zhifubao;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AlipayConfiguration {

    @Autowired
    AlipayConfig alipayCg;

    @Bean
    AlipayClient alipayClient() {
        AlipayClient alipayClient = new DefaultAlipayClient(alipayCg.getServeUrl(), alipayCg.getAppId(), alipayCg.getPrivateKey(), alipayCg.getFormat(), alipayCg.getCharset(), alipayCg.getAlipayPublicKey(), alipayCg.getSignType());
        return alipayClient;
    }

}
