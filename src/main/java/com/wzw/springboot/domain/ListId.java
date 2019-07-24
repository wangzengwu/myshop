package com.wzw.springboot.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.List;

/**
 * @Author: Joker_wang
 * @Date: 2019/7/7 13:58
 * @Version 1.0.0
 */
public class ListId {

    private String[] lis;

    public String[] getLis() {
        return lis;
    }

    public void setLis(String[] lis) {
        this.lis = lis;
    }

    List<Integer> idLIst;

    public ListId() {
    }

    public List<Integer> getIdLIst() {
        return idLIst;
    }

    public void setIdLIst(List<Integer> idLIst) {
        this.idLIst = idLIst;
    }
}
