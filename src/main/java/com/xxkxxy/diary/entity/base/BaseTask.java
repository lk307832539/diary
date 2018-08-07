package com.xxkxxy.diary.entity.base;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LK on 2018/8/7.
 */
@MappedSuperclass
public abstract class BaseTask {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date createTime;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private Integer status;
    private Integer type;
    private Date completeTime;
    private Date lastModifiedTime;
    private Integer parentId;
    private Date planCompleteTime;
    private String modifiedRecord;
    private Integer modifiedNum;
    private Integer taskPlanId;

    private String tag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Date getPlanCompleteTime() {
        return planCompleteTime;
    }

    public void setPlanCompleteTime(Date planCompleteTime) {
        this.planCompleteTime = planCompleteTime;
    }

    public String getModifiedRecord() {
        return modifiedRecord;
    }

    public void setModifiedRecord(String modifiedRecord) {
        this.modifiedRecord = modifiedRecord;
    }

    public Integer getModifiedNum() {
        return modifiedNum;
    }

    public void setModifiedNum(Integer modifiedNum) {
        this.modifiedNum = modifiedNum;
    }

    public Integer getTaskPlanId() {
        return taskPlanId;
    }

    public void setTaskPlanId(Integer taskPlanId) {
        this.taskPlanId = taskPlanId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
