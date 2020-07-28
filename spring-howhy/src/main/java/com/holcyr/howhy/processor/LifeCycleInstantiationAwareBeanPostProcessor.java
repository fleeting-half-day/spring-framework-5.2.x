package com.holcyr.howhy.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author wangxinlei
 * @project spring
 * @Description
 * @encoding UTF-8
 * @datetime 2020/7/28 11:59
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@Component
public class LifeCycleInstantiationAwareBeanPostProcessor implements InstantiationAwareBeanPostProcessor {

	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

		if ("lifeCycle".equals(beanName)) {
			System.out.println();
			System.out.println("InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation()");
			System.out.println("=============");
		}

		return null;
	}

	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {

		if ("lifeCycle".equals(beanName)) {
			System.out.println();
			System.out.println("InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation()");
			System.out.println("=============");
		}

		return false;
	}

	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {

		System.out.println();
		System.out.println("InstantiationAwareBeanPostProcessor.postProcessProperties()");
		System.out.println("=============");

		return null;
	}
}
