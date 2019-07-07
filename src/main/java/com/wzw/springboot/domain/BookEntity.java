package com.wzw.springboot.domain;


import java.io.Serializable;


public class BookEntity implements Serializable {
    private Integer bid;

    private String bname;

    private String detail;

    private String pirce;



    /**
     * @return bid
     */
    public Integer getBid() {
        return bid;
    }

    /**
     * @param bid
     */
    public void setBid(Integer bid) {
        this.bid = bid;
    }

    /**
     * @return bname
     */
    public String getBname() {
        return bname;
    }

    /**
     * @param bname
     */
    public void setBname(String bname) {
        this.bname = bname == null ? null : bname.trim();
    }

    /**
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    /**
     * @param detail
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * @return pirce
     */
    public String getPirce() {
        return pirce;
    }

    /**
     * @param pirce
     */
    public void setPirce(String pirce) {
        this.pirce = pirce == null ? null : pirce.trim();
    }

}