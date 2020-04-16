package com.darryl.rpc.registry;

/**
 * @Auther: Darryl
 * @Description: 注册中心的接口，方便我们以后扩展多种注册中心的选择
 * 这里是要将class对应的接口注册到注册中心
 * @Date: 2020/04/15
 */
public interface Registry {
	/**
	 * 将生产者接口注册到注册中心
	 * @param clazz        类
	 * @param registryInfo 本机的注册信息
	 */
	void register(Class clazz, RegistryInfo registryInfo) throws Exception;
}
