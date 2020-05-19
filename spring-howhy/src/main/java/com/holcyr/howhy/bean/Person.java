package com.holcyr.howhy.bean;

import org.springframework.beans.factory.*;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author wangxinlei
 * @project spring
 * @Description
 * @encoding UTF-8
 * @datetime 2020/5/19 18:20
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@Component
public class Person implements BeanFactoryAware, BeanNameAware,
		InitializingBean, DisposableBean {

	private String name;
	private String address;
	private int phone;

	private BeanFactory beanFactory;

	private String beanName;

	public Person() {
		System.out.println("【构造器】调用Person的构造器实例化");
	}

	public void setName(String name) {
		System.out.println("【注入属性】注入属性name");
		this.name = name;
	}

	public void setAddress(String address) {
		System.out.println("【注入属性】注入属性address");
		this.address = address;
	}

	public void setPhone(int phone) {
		System.out.println("【注入属性】注入属性phone");
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Person [address=" + address + ","
				+ phone + "]";
	}

	@PostConstruct
	public void postC() {
		System.out.println("【@PostConstruct注解方法】调用");
	}
	@PreDestroy
	public void preD() {
		System.out.println("【@PreDestroy注解方法】调用");
	}

	/**
	 * 这是BeanFactoryAware接口方法
	 *
	 * @param arg0
	 */
	@Override
	public void setBeanFactory(BeanFactory arg0) {
		System.out.println("【BeanFactoryAware接口】调用");
		this.beanFactory = arg0;
	}

	/**
	 * 这是BeanNameAware接口方法
	 *
	 * @param arg0
	 */
	@Override
	public void setBeanName(String arg0) {
		System.out.println("【BeanNameAware接口】调用B");
		this.beanName = arg0;
	}

	/**
	 * 这是InitializingBean接口方法
	 *
	 * @throws Exception
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("【InitializingBean接口】调用");
	}


	/**
	 * Invoked by the containing {@code BeanFactory} on destruction of a bean.
	 *
	 * @throws Exception in case of shutdown errors. Exceptions will get logged
	 *                   but not rethrown to allow other beans to release their resources as well.
	 */
	@Override
	public void destroy() throws Exception {
		System.out.println("【DisposableBean接口】调用");
	}
}
