package com.wry.patterns.type1;

import java.util.List;

/**
 * 创建条件（Criteria）接口。
 */
public interface Criteria {
    //满足条件的人
    List<Person> meetCriteria(List<Person> persons);
}