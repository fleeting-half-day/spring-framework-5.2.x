package io.holcyr.howay.beans;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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

	@Autowired
	First first;

	public LifeCycle() {
		System.out.println("=========================");
		System.out.println("new LifeCycle()");
		System.out.println(this.first);
	}

	/**
	 * afterPropertiesSet
	 */
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean.afterPropertiesSet()");
		System.out.println(this.first);
	}
}
