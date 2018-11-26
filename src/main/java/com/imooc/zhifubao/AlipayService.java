package com.imooc.zhifubao;

import com.alibaba.fastjson.JSON;
import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhangjun
 */
@Service
public class AlipayService {

    @Autowired
    AlipayConfig alipayConfig;

    @Autowired
    AlipayClient alipayClient;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    public String pcPay() {

        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        String notifyUrl = alipayConfig.getNotifyUrl() + "/sell/alipay/alipayNotify";
        alipayRequest.setNotifyUrl(notifyUrl);

        Map<String, String> map = new HashMap<>(3);
        map.put("sys_service_provider_id", "2088511833207846");
        BizEntity bizEntity = new BizEntity()
                .setOutTradeNo("20150320010101004")
                .setProductCode("FAST_INSTANT_TRADE_PAY")
                .setTotalAmount("88.88")
                .setSubject("Iphone6 16G")
                .setBody("Iphone6 16G")
//                .setPassbackParams("merchantBizType%3d3C%26merchantBizNo%3d2016010101111")
                .setExtendParams(map);
        alipayRequest.setBizContent(JSON.toJSONString(bizEntity));

        System.out.println(JSON.toJSONString(bizEntity));
        String form;
        try {
            form = alipayClient.pageExecute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
            return e.getErrMsg();
        }
        return form;
    }
}
