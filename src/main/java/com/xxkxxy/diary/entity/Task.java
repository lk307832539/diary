package com.xxkxxy.diary.entity;

import com.xxkxxy.diary.entity.base.BaseTask;

import javax.persistence.Entity;

/**
 * Created by LK on 2018/8/7.
 */
@Entity
public class Task extends BaseTask {

    public final static Integer STATUS_PENDING = 1;
    public final static Integer STATUS_UNDONE = 2;
    public final static Integer STATUS_ASSIGNED = 3;
    public final static Integer STATUS_COMPLETED = 4;
    public final static Integer STATUS_CANCELLED = 5;

    public Task() {
        super();
    }
}
