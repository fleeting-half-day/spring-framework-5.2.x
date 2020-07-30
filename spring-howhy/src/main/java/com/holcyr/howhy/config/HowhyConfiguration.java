package com.holcyr.howhy.config;

import com.holcyr.howhy.aspect.AspectTest;
import com.holcyr.howhy.bean.AopTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

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
@Configuration
@ComponentScan(value = "com.holcyr.howhy")
@EnableAspectJAutoProxy
public class HowhyConfiguration {

	@Bean
	public AopTest aopTest() {
		return new AopTest();
	}

	@Bean
	public AspectTest aspectTest() {
		return new AspectTest();
	}

}
