package com.xxkxxy.diary.entity.base;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;
import java.util.Date;

/**
 * Created by LK on 2018/8/7.
 */
@MappedSuperclass
public abstract class BaseDiary {
    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer diaryId;

    private Date createDate;
    private Date lastModifiedTime;
    private String lunarCalendar;
    private Integer livingTime;
    private String weather;
    private Date getUpTime;
    private Date sleepTime;
    private Integer moodScore;

    public Integer getDiaryId() {
        return diaryId;
    }

    public void setDiaryId(Integer diaryId) {
        this.diaryId = diaryId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastModifiedTime() {
        return lastModifiedTime;
    }

    public void setLastModifiedTime(Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    public String getLunarCalendar() {
        return lunarCalendar;
    }

    public void setLunarCalendar(String lunarCalendar) {
        this.lunarCalendar = lunarCalendar;
    }

    public Integer getLivingTime() {
        return livingTime;
    }

    public void setLivingTime(Integer livingTime) {
        this.livingTime = livingTime;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public Date getGetUpTime() {
        return getUpTime;
    }

    public void setGetUpTime(Date getUpTime) {
        this.getUpTime = getUpTime;
    }

    public Date getSleepTime() {
        return sleepTime;
    }

    public void setSleepTime(Date sleepTime) {
        this.sleepTime = sleepTime;
    }

    public Integer getMoodScore() {
        return moodScore;
    }

    public void setMoodScore(Integer moodScore) {
        this.moodScore = moodScore;
    }
}
