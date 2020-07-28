package com.holcyr.howhy.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author wangxinlei
 * @project spring
 * @Description
 * @encoding UTF-8
 * @datetime 2020/3/26 20:46
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@Component
public class LifeCycle implements InitializingBean {

	@Resource
	private Test test;

	public LifeCycle() {

		System.out.println();
		System.out.println(test);
		System.out.println("LifeCycle()");
		System.out.println("=============");
	}

	/**
	 * afterPropertiesSet
	 */
	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println();
		System.out.println("InitializingBean.afterPropertiesSet()");
		System.out.println("=============");
	}

	@PostConstruct
	public void postConstruct() {

		System.out.println();
		System.out.println("@PostConstruct");
		System.out.println("=============");
	}
}
