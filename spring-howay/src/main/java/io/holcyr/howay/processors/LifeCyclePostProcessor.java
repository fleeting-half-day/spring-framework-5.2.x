package io.holcyr.howay.processors;

import io.holcyr.howay.beans.LifeCycle;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author wangxinlei
 * @project spring
 * @Description
 * @encoding UTF-8
 * @datetime 2020/3/30 16:55
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@Component
public class LifeCyclePostProcessor implements InstantiationAwareBeanPostProcessor, BeanDefinitionRegistryPostProcessor {
	/**
	 * postProcessBeforeInstantiation
	 */
	@Override
	public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {
		if ("lifeCycle".equals(beanName)) {
			System.out.println(beanName);
			System.out.println("InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation()");
		}
		return null;
	}

	/**
	 * postProcessAfterInstantiation
	 */
	@Override
	public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
		if ("lifeCycle".equals(beanName)) {
			System.out.println(beanName);
			System.out.println("InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation()");
		}
		return false;
	}

	/**
	 * postProcessProperties
	 */
	@Override
	public PropertyValues postProcessProperties(PropertyValues pvs, Object bean, String beanName) throws BeansException {
		System.out.println("InstantiationAwareBeanPostProcessor.postProcessProperties()");
		return pvs;
	}

	/**
	 * postProcessBeforeInitialization
	 */
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if ("lifeCycle".equals(beanName)) {
			System.out.println(beanName);
			System.out.println("BeanPostProcessor.postProcessBeforeInitialization()");
		}
		return bean;
	}

	/**
	 * postProcessAfterInitialization
	 */
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if ("lifeCycle".equals(beanName)) {
			System.out.println(beanName);
			System.out.println("BeanPostProcessor.postProcessAfterInitialization()");
		}
		return bean;
	}

	/**
	 * postProcessBeanFactory
	 */
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("BeanFactoryPostProcessor.postProcessBeanFactory()");
	}

	/**
	 * postProcessBeanDefinitionRegistry
	 */
	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		System.out.println("BeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry()");
	}
}
