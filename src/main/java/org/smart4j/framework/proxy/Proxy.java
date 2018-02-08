package org.smart4j.framework.proxy;

/**
 * 代理接口
 *
 * @author liukl
 * @date 2018/2/7
 */
public interface Proxy {
    /**
     * 执行链式代理
     * @param proxyChain
     * @return
     * @throws Throwable
     */
    Object doProxy(ProxyChain proxyChain) throws Throwable;

}
