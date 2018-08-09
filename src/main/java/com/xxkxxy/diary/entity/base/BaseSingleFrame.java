package com.xxkxxy.diary.entity.base;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by LK on 2018/8/9.
 */
@MappedSuperclass
public abstract class BaseSingleFrame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Date createTime;

    @Column(columnDefinition = "TEXT")
    private String content;

//    private
}
