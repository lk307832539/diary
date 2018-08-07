package com.xxkxxy.diary.entity;

import com.xxkxxy.diary.entity.base.BaseTask;

import javax.persistence.Entity;

/**
 * Created by LK on 2018/8/7.
 */
@Entity
public class Task extends BaseTask {

    public final static Integer PLAN_STATUS_PENDING = 1;
    public final static Integer PLAN_STATUS_UNDONE = 2;
    public final static Integer PLAN_STATUS_ASSIGNED = 3;
    public final static Integer PLAN_STATUS_COMPLETED = 4;
    public final static Integer PLAN_STATUS_CANCELLED = 5;

    public Task() {
        super();
    }
}
