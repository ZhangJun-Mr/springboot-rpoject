package com.imooc.zhifubao;

import org.apache.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

public class RequestParamsUtil {
    /**
     * 从HttpServletRequest中获取所有的参数
     * @param request
     * @param <T>
     * @return
     */
    public static <T extends HttpServletRequest> Map<String, String> getParams(T request) {
        Map<String, String> resutMap = new HashMap<>(16);
        Enumeration enumeration = request.getParameterNames();
        while (enumeration.hasMoreElements()){
            String paramName = (String) enumeration.nextElement();
            resutMap.put(paramName, request.getParameter(paramName));
        }
        return resutMap;

    }
}
