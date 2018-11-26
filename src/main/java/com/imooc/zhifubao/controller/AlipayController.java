package com.imooc.zhifubao.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.imooc.zhifubao.AlipayConfig;
import com.imooc.zhifubao.AlipayService;
import com.imooc.zhifubao.RequestParamsUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
@RequestMapping("/alipay")
public class AlipayController {

    @Autowired
    AlipayService alipayService;

    @Autowired
    AlipayConfig alipayConfig;

    @PostMapping("pcPay")
    String pcPay(HttpServletRequest request, HttpServletResponse response) {
        return alipayService.pcPay();
    }

    @PostMapping("alipayNotify")
    void alipayNotify(HttpServletRequest request) throws AlipayApiException {
        Map<String, String> paramsMap = RequestParamsUtil.getParams(request);
        boolean signVerified;
        try {
            signVerified = AlipaySignature.rsaCheckV2(paramsMap, alipayConfig.getAlipayPublicKey(), alipayConfig.getCharset(), alipayConfig.getSignType());
        } catch (AlipayApiException e) {
            throw e;
        }

    }

    @PostMapping("mobilePay")
    String mobilePay(HttpServletRequest request, HttpServletResponse response) {
        return alipayService.mobilePay();
    }
}
