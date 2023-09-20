package com.softeem.iov.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

/**
 * <p>
 * 用户汽车表
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
@TableName("user_car")
public class UserCar implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 用户汽车id-标志位
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 车辆识别号（车架号）
     */
    private String vin;

    /**
     * 车牌号(例如:鄂ACM123、鄂AD78J9K)
     */
    private String carnum;

    /**
     * 车辆图片
     */
    private String img;

    /**
     * 总行驶里程数
     */
    private Integer totalmileage;

    /**
     * 当前车内温度
     */
    private Double temp;

    /**
     * 剩余油量(L)、电量(kwh)
     */
    private Double free;

    /**
     * 当前车辆位置(经纬度表示:114.416005,30.470307)
     */
    private String location;

    /**
     * 当前变速箱档位（P/N/D/M/S）
     */
    private String gearStatus;

    /**
     * 发动机状态0-未启动  1-已启动
     */
    private Integer enginStatus;

    /**
     * 发动机盖状态(引擎盖) 0-关闭 1-开启
     */
    private Integer forecabinStatus;

    /**
     * 后备箱状态(0-关闭  1-开启)
     */
    private Integer trunkStatus;

    /**
     * 平均能耗(油，电)
     */
    private Double avgConsume;

    /**
     * 锁定状态  0-已锁定 1-已解锁
     */
    private Integer lockStatus;

    /**
     * 大灯状态 0-已关闭 1-已开启
     */
    private Integer lightStatus;

    /**
     * 天窗状态0-已关闭  1-已开启
     */
    private Integer sunRoofStatus;

    /**
     * 左前门状态0-已关闭 1-已开启
     */
    private Integer doorFrontLeftStatus;

    /**
     * 右前门状态0-已关闭 1-已开启
     */
    private Integer doorFrontRightStatus;

    /**
     * 左后门状态0-已关闭 1-已开启
     */
    private Integer doorBackLeftStatus;

    /**
     * 右后门状态0-已关闭 1-已开启
     */
    private Integer doorBackRightStatus;

    /**
     * 左前窗状态0-已关闭  1-已开启
     */
    private Integer windowFrontLeftStatus;

    /**
     * 右前窗状态0-已关闭 1-已开启
     */
    private Integer windowFrontRightStatus;

    /**
     * 左后窗状态0-已关闭 1-已开启
     */
    private Integer windowBackLeftStatus;

    /**
     * 右后窗状态0-已关闭 1-已开启
     */
    private Integer windowBackRightStatus;

    /**
     * 左前胎压(例如 2.4 )
     */
    private Double pressureFrontLeft;

    /**
     * 右前胎压(例如 2.4 )
     */
    private Double pressureFrontRight;

    /**
     * 左后胎压(例如 2.4 )
     */
    private Double pressureBackLeft;

    /**
     * 右后胎压(例如 2.4 )
     */
    private Double pressureBackRight;

    /**
     * 用户身份证号
     */
    private String userCardid;

    /**
     * 用户id
     */
    private Integer uid;

    /**
     * 汽车型号id
     */
    private Integer pid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }
    public String getCarnum() {
        return carnum;
    }

    public void setCarnum(String carnum) {
        this.carnum = carnum;
    }
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }
    public Integer getTotalmileage() {
        return totalmileage;
    }

    public void setTotalmileage(Integer totalmileage) {
        this.totalmileage = totalmileage;
    }
    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }
    public Double getFree() {
        return free;
    }

    public void setFree(Double free) {
        this.free = free;
    }
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public String getGearStatus() {
        return gearStatus;
    }

    public void setGearStatus(String gearStatus) {
        this.gearStatus = gearStatus;
    }
    public Integer getEnginStatus() {
        return enginStatus;
    }

    public void setEnginStatus(Integer enginStatus) {
        this.enginStatus = enginStatus;
    }
    public Integer getForecabinStatus() {
        return forecabinStatus;
    }

    public void setForecabinStatus(Integer forecabinStatus) {
        this.forecabinStatus = forecabinStatus;
    }
    public Integer getTrunkStatus() {
        return trunkStatus;
    }

    public void setTrunkStatus(Integer trunkStatus) {
        this.trunkStatus = trunkStatus;
    }
    public Double getAvgConsume() {
        return avgConsume;
    }

    public void setAvgConsume(Double avgConsume) {
        this.avgConsume = avgConsume;
    }
    public Integer getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(Integer lockStatus) {
        this.lockStatus = lockStatus;
    }
    public Integer getLightStatus() {
        return lightStatus;
    }

    public void setLightStatus(Integer lightStatus) {
        this.lightStatus = lightStatus;
    }
    public Integer getSunRoofStatus() {
        return sunRoofStatus;
    }

    public void setSunRoofStatus(Integer sunRoofStatus) {
        this.sunRoofStatus = sunRoofStatus;
    }
    public Integer getDoorFrontLeftStatus() {
        return doorFrontLeftStatus;
    }

    public void setDoorFrontLeftStatus(Integer doorFrontLeftStatus) {
        this.doorFrontLeftStatus = doorFrontLeftStatus;
    }
    public Integer getDoorFrontRightStatus() {
        return doorFrontRightStatus;
    }

    public void setDoorFrontRightStatus(Integer doorFrontRightStatus) {
        this.doorFrontRightStatus = doorFrontRightStatus;
    }
    public Integer getDoorBackLeftStatus() {
        return doorBackLeftStatus;
    }

    public void setDoorBackLeftStatus(Integer doorBackLeftStatus) {
        this.doorBackLeftStatus = doorBackLeftStatus;
    }
    public Integer getDoorBackRightStatus() {
        return doorBackRightStatus;
    }

    public void setDoorBackRightStatus(Integer doorBackRightStatus) {
        this.doorBackRightStatus = doorBackRightStatus;
    }
    public Integer getWindowFrontLeftStatus() {
        return windowFrontLeftStatus;
    }

    public void setWindowFrontLeftStatus(Integer windowFrontLeftStatus) {
        this.windowFrontLeftStatus = windowFrontLeftStatus;
    }
    public Integer getWindowFrontRightStatus() {
        return windowFrontRightStatus;
    }

    public void setWindowFrontRightStatus(Integer windowFrontRightStatus) {
        this.windowFrontRightStatus = windowFrontRightStatus;
    }
    public Integer getWindowBackLeftStatus() {
        return windowBackLeftStatus;
    }

    public void setWindowBackLeftStatus(Integer windowBackLeftStatus) {
        this.windowBackLeftStatus = windowBackLeftStatus;
    }
    public Integer getWindowBackRightStatus() {
        return windowBackRightStatus;
    }

    public void setWindowBackRightStatus(Integer windowBackRightStatus) {
        this.windowBackRightStatus = windowBackRightStatus;
    }
    public Double getPressureFrontLeft() {
        return pressureFrontLeft;
    }

    public void setPressureFrontLeft(Double pressureFrontLeft) {
        this.pressureFrontLeft = pressureFrontLeft;
    }
    public Double getPressureFrontRight() {
        return pressureFrontRight;
    }

    public void setPressureFrontRight(Double pressureFrontRight) {
        this.pressureFrontRight = pressureFrontRight;
    }
    public Double getPressureBackLeft() {
        return pressureBackLeft;
    }

    public void setPressureBackLeft(Double pressureBackLeft) {
        this.pressureBackLeft = pressureBackLeft;
    }
    public Double getPressureBackRight() {
        return pressureBackRight;
    }

    public void setPressureBackRight(Double pressureBackRight) {
        this.pressureBackRight = pressureBackRight;
    }
    public String getUserCardid() {
        return userCardid;
    }

    public void setUserCardid(String userCardid) {
        this.userCardid = userCardid;
    }
    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @Override
    public String toString() {
        return "UserCar{" +
            "id=" + id +
            ", vin=" + vin +
            ", carnum=" + carnum +
            ", img=" + img +
            ", totalmileage=" + totalmileage +
            ", temp=" + temp +
            ", free=" + free +
            ", location=" + location +
            ", gearStatus=" + gearStatus +
            ", enginStatus=" + enginStatus +
            ", forecabinStatus=" + forecabinStatus +
            ", trunkStatus=" + trunkStatus +
            ", avgConsume=" + avgConsume +
            ", lockStatus=" + lockStatus +
            ", lightStatus=" + lightStatus +
            ", sunRoofStatus=" + sunRoofStatus +
            ", doorFrontLeftStatus=" + doorFrontLeftStatus +
            ", doorFrontRightStatus=" + doorFrontRightStatus +
            ", doorBackLeftStatus=" + doorBackLeftStatus +
            ", doorBackRightStatus=" + doorBackRightStatus +
            ", windowFrontLeftStatus=" + windowFrontLeftStatus +
            ", windowFrontRightStatus=" + windowFrontRightStatus +
            ", windowBackLeftStatus=" + windowBackLeftStatus +
            ", windowBackRightStatus=" + windowBackRightStatus +
            ", pressureFrontLeft=" + pressureFrontLeft +
            ", pressureFrontRight=" + pressureFrontRight +
            ", pressureBackLeft=" + pressureBackLeft +
            ", pressureBackRight=" + pressureBackRight +
            ", userCardid=" + userCardid +
            ", uid=" + uid +
            ", pid=" + pid +
        "}";
    }
}
