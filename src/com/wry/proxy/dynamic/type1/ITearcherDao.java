package com.wry.proxy.dynamic.type1;

import java.util.List;

/**
 * 老师接口
 */
public interface ITearcherDao {
    /**
     * 抽象的教书发放
     */
    void tearch();

    /**
     * 计算学生数量
     *
     * @return
     */
    int studentNumber();

    /**
     * 获取学生
     *
     * @return
     */
    List<String> getStudent();
}
