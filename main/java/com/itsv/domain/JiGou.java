package com.itsv.domain;

import java.util.Date;
import java.math.BigDecimal;

/**
 * 说明： t_jigou 值对象类
 *
 * @author Pan
 * @version 1.0
 * @since 2018-03-21
 */
public class JiGou {
    private Integer id;//机构id

    private String name; //机构名称

    private String shen_name; //申请人姓名

    private Integer shen_sex; //申请人性别

    private Date shen_brithday; //申请人出生日期

    private String shen_tel; //申请人电话

    private String address; //机构地址

    private String fd_name; //法定代表人姓名

    private String fd_tel; //法定代表人电话

    private String jg_name; //机构代表人姓名

    private String jg_tel; //机构代表人电话

    private BigDecimal mianji; //建筑面积

    private BigDecimal usedmianji; //使用面积

    private Integer minusedmianji;//最小面积

    private Integer maxusedmianji;//最大面积

    private String xingshi; //建筑形式

    private Long chuangwei; //床位设置

    private Integer minchuangwei;//最少床位

    private Integer maxchuangwei;//最多床位

    private String fqdw_name; //房权证单位

    private Integer zudate; //租赁期限

    private BigDecimal touzong; //投资总额

    private String xingzhi; //资产性质

    private BigDecimal zhucezijin; //注册资金

    private BigDecimal shoufei; //收费标准

    private String beizhu; //备注


    public Integer getMinusedmianji() {
        return minusedmianji;
    }

    public void setMinusedmianji(Integer minusedmianji) {
        this.minusedmianji = minusedmianji;
    }

    public Integer getMaxusedmianji() {
        return maxusedmianji;
    }

    public void setMaxusedmianji(Integer maxusedmianji) {
        this.maxusedmianji = maxusedmianji;
    }

    public Integer getMinchuangwei() {
        return minchuangwei;
    }

    public void setMinchuangwei(Integer minchuangwei) {
        this.minchuangwei = minchuangwei;
    }

    public Integer getMaxchuangwei() {
        return maxchuangwei;
    }

    public void setMaxchuangwei(Integer maxchuangwei) {
        this.maxchuangwei = maxchuangwei;
    }

    /**
     * 以下为get,set方法
     */



    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShen_name() {
        return this.shen_name;
    }

    public void setShen_name(String shen_name) {
        this.shen_name = shen_name;
    }

    public Integer getShen_sex() {
        return this.shen_sex;
    }

    public void setShen_sex(Integer shen_sex) {
        this.shen_sex = shen_sex;
    }

    public Date getShen_brithday() {
        return this.shen_brithday;
    }

    public void setShen_brithday(Date shen_brithday) {
        this.shen_brithday = shen_brithday;
    }

    public String getShen_tel() {
        return this.shen_tel;
    }

    public void setShen_tel(String shen_tel) {
        this.shen_tel = shen_tel;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFd_name() {
        return this.fd_name;
    }

    public void setFd_name(String fd_name) {
        this.fd_name = fd_name;
    }

    public String getFd_tel() {
        return this.fd_tel;
    }

    public void setFd_tel(String fd_tel) {
        this.fd_tel = fd_tel;
    }

    public String getJg_name() {
        return this.jg_name;
    }

    public void setJg_name(String jg_name) {
        this.jg_name = jg_name;
    }

    public String getJg_tel() {
        return this.jg_tel;
    }

    public void setJg_tel(String jg_tel) {
        this.jg_tel = jg_tel;
    }

    public BigDecimal getMianji() {
        return this.mianji;
    }

    public void setMianji(BigDecimal mianji) {
        this.mianji = mianji;
    }

    public BigDecimal getUsedmianji() {
        return this.usedmianji;
    }

    public void setUsedmianji(BigDecimal usedmianji) {
        this.usedmianji = usedmianji;
    }

    public String getXingshi() {
        return this.xingshi;
    }

    public void setXingshi(String xingshi) {
        this.xingshi = xingshi;
    }

    public Long getChuangwei() {
        return this.chuangwei;
    }

    public void setChuangwei(Long chuangwei) {
        this.chuangwei = chuangwei;
    }

    public String getFqdw_name() {
        return this.fqdw_name;
    }

    public void setFqdw_name(String fqdw_name) {
        this.fqdw_name = fqdw_name;
    }

    public Integer getZudate() {
        return this.zudate;
    }

    public void setZudate(Integer zudate) {
        this.zudate = zudate;
    }

    public BigDecimal getTouzong() {
        return this.touzong;
    }

    public void setTouzong(BigDecimal touzong) {
        this.touzong = touzong;
    }

    public String getXingzhi() {
        return this.xingzhi;
    }

    public void setXingzhi(String xingzhi) {
        this.xingzhi = xingzhi;
    }

    public BigDecimal getZhucezijin() {
        return this.zhucezijin;
    }

    public void setZhucezijin(BigDecimal zhucezijin) {
        this.zhucezijin = zhucezijin;
    }

    public BigDecimal getShoufei() {
        return this.shoufei;
    }

    public void setShoufei(BigDecimal shoufei) {
        this.shoufei = shoufei;
    }

    public String getBeizhu() {
        return this.beizhu;
    }

    public void setBeizhu(String beizhu) {
        this.beizhu = beizhu;
    }

    @Override
    public String toString() {
        return "JiGou{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shen_name='" + shen_name + '\'' +
                ", shen_sex=" + shen_sex +
                ", shen_brithday=" + shen_brithday +
                ", shen_tel='" + shen_tel + '\'' +
                ", address='" + address + '\'' +
                ", fd_name='" + fd_name + '\'' +
                ", fd_tel='" + fd_tel + '\'' +
                ", jg_name='" + jg_name + '\'' +
                ", jg_tel='" + jg_tel + '\'' +
                ", mianji=" + mianji +
                ", usedmianji=" + usedmianji +
                ", minusedmianji=" + minusedmianji +
                ", maxusedmianji=" + maxusedmianji +
                ", xingshi='" + xingshi + '\'' +
                ", chuangwei=" + chuangwei +
                ", minchuangwei=" + minchuangwei +
                ", maxchuangwei=" + maxchuangwei +
                ", fqdw_name='" + fqdw_name + '\'' +
                ", zudate=" + zudate +
                ", touzong=" + touzong +
                ", xingzhi='" + xingzhi + '\'' +
                ", zhucezijin=" + zhucezijin +
                ", shoufei=" + shoufei +
                ", beizhu='" + beizhu + '\'' +
                '}';
    }
}


