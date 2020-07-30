package com.holcyr.howhy.aspect;

import java.lang.annotation.*;

/**
 * @author wangxinlei
 * @project spring
 * @Description
 * @encoding UTF-8
 * @datetime 2020/7/29 18:46
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.TYPE})
@Documented
public @interface AopAnno {
}
