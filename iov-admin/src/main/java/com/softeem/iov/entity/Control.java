package com.softeem.iov.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * <p>
 * 控制记录表
 * </p>
 *
 * @author softeem
 * @since 2023-09-19
 */
public class Control implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 操作id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 操作名，例如:解锁，上锁
     */
    private String cname;

    /**
     * 操作时间
     */
    private LocalDateTime ctime;

    /**
     * 操作结果 0-成功  1-失败
     */
    private Boolean result;

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
    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
    public LocalDateTime getCtime() {
        return ctime;
    }

    public void setCtime(LocalDateTime ctime) {
        this.ctime = ctime;
    }
    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }
    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Control{" +
            "id=" + id +
            ", cname=" + cname +
            ", ctime=" + ctime +
            ", result=" + result +
            ", cid=" + cid +
        "}";
    }
}
