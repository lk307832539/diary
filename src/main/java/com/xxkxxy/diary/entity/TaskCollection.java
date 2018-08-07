package com.xxkxxy.diary.entity;

import com.xxkxxy.diary.entity.base.BaseTaskCollection;

import javax.persistence.Entity;

/**
 * Created by LK on 2018/8/7.
 */
@Entity
public class TaskCollection extends BaseTaskCollection {

    public final static Integer COLLECTION_STATUS_PENDING = 1;
    public final static Integer COLLECTION_STATUS_ASSIGNED = 2;
    public final static Integer COLLECTION_STATUS_COMPLETED = 3;
    public final static Integer COLLECTION_STATUS_CANCELLED = 4;

    public TaskCollection() {
        super();
    }
}
