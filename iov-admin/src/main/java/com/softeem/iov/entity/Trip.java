package com.softeem.iov.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 行程记录表
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
public class Trip implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 行程id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 行程开始地点(经纬度)
     */
    private String startplace;

    /**
     * 行程结束地点(经纬度)
     */
    private String endplace;

    /**
     * 行程开始时间
     */
    private LocalDateTime starttime;

    /**
     * 行程结束时间
     */
    private LocalDateTime endtime;

    /**
     * 持续时长(毫秒)
     */
    private Long duration;

    /**
     * 里程数(公里)
     */
    private Double mileage;

    /**
     * 行程能耗(油-nL/100km ,电-nkwh/100km)
     */
    private Double consume;

    /**
     * 用户汽车id
     */
    private Integer cid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getStartplace() {
        return startplace;
    }

    public void setStartplace(String startplace) {
        this.startplace = startplace;
    }
    public String getEndplace() {
        return endplace;
    }

    public void setEndplace(String endplace) {
        this.endplace = endplace;
    }
    public LocalDateTime getStarttime() {
        return starttime;
    }

    public void setStarttime(LocalDateTime starttime) {
        this.starttime = starttime;
    }
    public LocalDateTime getEndtime() {
        return endtime;
    }

    public void setEndtime(LocalDateTime endtime) {
        this.endtime = endtime;
    }
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }
    public Double getConsume() {
        return consume;
    }

    public void setConsume(Double consume) {
        this.consume = consume;
    }
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Trip{" +
            "id=" + id +
            ", startplace=" + startplace +
            ", endplace=" + endplace +
            ", starttime=" + starttime +
            ", endtime=" + endtime +
            ", duration=" + duration +
            ", mileage=" + mileage +
            ", consume=" + consume +
            ", cid=" + cid +
        "}";
    }
}
