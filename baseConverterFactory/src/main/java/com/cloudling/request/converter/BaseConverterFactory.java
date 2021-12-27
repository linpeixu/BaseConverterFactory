package com.cloudling.request.converter;

/**
 * 描述: 转换工厂基类
 * 联系: 1966353889@qq.com
 * 日期: 2021/12/24
 */
public abstract class BaseConverterFactory<S, F> {

    /**
     * 解析转换成功后的回调参数
     */
    public abstract S converterSuccess(String json);

    /**
     * 解析转换失败后的回调参数
     */
    public abstract F converterFail(String json);
}
