package com.holcyr.howhy.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author wangxinlei
 * @project spring
 * @Description
 * @encoding UTF-8
 * @datetime 2020/7/29 11:59
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@Aspect
public class AspectTest {

	@Pointcut("@annotation(com.holcyr.howhy.aspect.AopAnno)")
	public void pointcut() {
	}

	@Around("pointcut()")
	public Object invoke(final ProceedingJoinPoint point) throws Throwable {
		System.out.println("Pointcut Before ...");
		try {
			return point.proceed();
		} finally {
			System.out.println("Pointcut After ...");
		}
	}

}
