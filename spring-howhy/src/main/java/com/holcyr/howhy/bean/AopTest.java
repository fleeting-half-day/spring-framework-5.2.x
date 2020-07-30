package com.holcyr.howhy.bean;

import com.holcyr.howhy.aspect.AopAnno;
import org.springframework.stereotype.Component;

/**
 * @author wangxinlei
 * @project spring
 * @Description
 * @encoding UTF-8
 * @datetime 2020/7/28 15:16
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@Component
public class AopTest {

	public void aopT1() {
		System.out.println();
		System.out.println("aopT1");
		this.aopT2();
	}

	@AopAnno
	public void aopT2() {

		System.out.println();
		System.out.println("aopT2");

	}

}
