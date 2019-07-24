package com.wzw.springboot.dao.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "book")
public class Book {
    private Integer bid;

    private String bname;

    private String detail;

    private String pirce;

    private String writer;

    private String printer;

    private Date date;

    private String type;

    private String image;

    private Integer stock;

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

    /**
     * @return writer
     */
    public String getWriter() {
        return writer;
    }

    /**
     * @param writer
     */
    public void setWriter(String writer) {
        this.writer = writer == null ? null : writer.trim();
    }

    /**
     * @return printer
     */
    public String getPrinter() {
        return printer;
    }

    /**
     * @param printer
     */
    public void setPrinter(String printer) {
        this.printer = printer == null ? null : printer.trim();
    }

    /**
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * @return stock
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * @param stock
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }
}