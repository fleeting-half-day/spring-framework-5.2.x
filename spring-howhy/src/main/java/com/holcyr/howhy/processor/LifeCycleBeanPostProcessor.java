package com.holcyr.howhy.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author wangxinlei
 * @project spring
 * @Description
 * @encoding UTF-8
 * @datetime 2020/5/19 18:24
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@Component
public class LifeCycleBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {

		if ("lifeCycle".equals(beanName)) {
			System.out.println();
			System.out.println("BeanPostProcessor.postProcessBeforeInitialization()");
			System.out.println("=============");
		}

		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {

		if ("lifeCycle".equals(beanName)) {
			System.out.println();
			System.out.println("BeanPostProcessor.postProcessAfterInitialization()");
			System.out.println("=============");
		}

		return bean;
	}
}
