package com.xxkxxy.diary.entity.base;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LK on 2018/8/7.
 */
@MappedSuperclass
public abstract class BaseTaskCollection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date createTime;
    private String title;

    @Column(columnDefinition = "TEXT")
    private String content;

    private Integer status;
    private Date statusModifiedTime;

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

    public Date getStatusModifiedTime() {
        return statusModifiedTime;
    }

    public void setStatusModifiedTime(Date statusModifiedTime) {
        this.statusModifiedTime = statusModifiedTime;
    }
}
