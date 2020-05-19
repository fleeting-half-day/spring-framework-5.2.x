package io.holcyr.howay;

import io.holcyr.howay.beans.First;
import io.holcyr.howay.beans.LifeCycle;
import io.holcyr.howay.beans.Person;
import io.holcyr.howay.config.HowayConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author wangxinlei
 * @project spring
 * @Description
 * @encoding UTF-8
 * @datetime 2020/3/25 13:21
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
public class HowayMain {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(HowayConfiguration.class);

//		LifeCycle lifeCycle = context.getBean(LifeCycle.class);
//		First first = context.getBean(First.class);
//		first.countOff();
//
//		Map<String, Object> map = new ConcurrentHashMap<>(32);
//
////		BeanDefinitionRegistryPostProcessor.postProcessBeanDefinitionRegistry()
////		BeanFactoryPostProcessor.postProcessBeanFactory()
////		InstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation()
////		new LifeCycle()
////		InstantiationAwareBeanPostProcessor.postProcessAfterInstantiation()
////		BeanPostProcessor.postProcessBeforeInitialization()
////		BeanPostProcessor.postProcessAfterInitialization()
//
//		System.out.println("=========================");
//		System.out.println(lifeCycle.toString());

		context.getBean(Person.class);

	}

}
