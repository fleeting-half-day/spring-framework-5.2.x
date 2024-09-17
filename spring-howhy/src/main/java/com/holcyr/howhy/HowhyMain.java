package com.holcyr.howhy;

import com.holcyr.howhy.bean.AopTest;
import com.holcyr.howhy.bean.LifeCycle;
import com.holcyr.howhy.config.HowhyConfiguration;
import org.springframework.aop.aspectj.annotation.AnnotationAwareAspectJAutoProxyCreator;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author wangxinlei
 * @project spring
 * @Description
 * @encoding UTF-8
 * @datetime 2020/5/19 18:18
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
public class HowhyMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context
				= new AnnotationConfigApplicationContext(HowhyConfiguration.class);

//		LifeCycle lifeCycle = context.getBean(LifeCycle.class);
		AopTest aopTest = context.getBean(AopTest.class);

		System.out.println(aopTest);

		aopTest.aopT2();
//		AbstractAutowireCapableBeanFactory
//		AnnotationAwareAspectJAutoProxyCreator
	}

}
