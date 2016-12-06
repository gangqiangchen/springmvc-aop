package org.springmvc.aop.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 3129647864907293365L;

    @Id
    @Column(name = "id")
    private String id;

    @Column(name = "name", length = 255, nullable = true, unique = false)
    private String name;

    @Column(name = "nickname", length = 255, nullable = true, unique = false)
    private String nickname;

    @Column(name = "datatime", nullable = true, unique = false)
    private Date datatime;

    @Column(name = "timelong", length = 20, nullable = true, unique = false)
    private Long timelong;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDatatime() {
        return datatime;
    }

    public void setDatatime(Date datatime) {
        this.datatime = datatime;
    }

    public Long getTimelong() {
        return timelong;
    }

    public void setTimelong(Long timelong) {
        this.timelong = timelong;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", nickname=" + nickname + ", datatime=" + datatime + ", timelong="
                + timelong + "]";
    }

}
