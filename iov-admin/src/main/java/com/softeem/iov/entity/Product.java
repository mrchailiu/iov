package com.softeem.iov.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 汽车型号表
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
public class Product implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 汽车型号id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 型号名
     */
    private String name;

    /**
     * 排量/电池容量
     */
    private String power;

    /**
     * 汽车油箱容量(L)/电池能量(kWh)
     */
    private Integer capacity;

    /**
     * 是否新能源 0-否 1-是
     */
    private Integer ep;

    /**
     * 发布年限
     */
    private String year;

    /**
     * 指导价（xx万）
     */
    private Double price;

    /**
     * 品牌ID
     */
    private Integer bid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }
    public Integer getEp() {
        return ep;
    }

    public void setEp(Integer ep) {
        this.ep = ep;
    }
    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getBid() {
        return bid;
    }

    public void setBid(Integer bid) {
        this.bid = bid;
    }

    @Override
    public String toString() {
        return "Product{" +
            "id=" + id +
            ", name=" + name +
            ", power=" + power +
            ", capacity=" + capacity +
            ", ep=" + ep +
            ", year=" + year +
            ", price=" + price +
            ", bid=" + bid +
        "}";
    }
}
