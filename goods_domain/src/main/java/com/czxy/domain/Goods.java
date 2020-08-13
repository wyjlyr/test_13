package com.czxy.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Table;
import java.util.Date;

@Table(name = "tbl_goods")
public class Goods {
    private Integer goods_id;
    private String goods_name;
    private Integer goods_number;
    private Double goods_price;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date guarantee_period;
    private String cid;
    private Category category;

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goods_id=" + goods_id +
                ", goods_name='" + goods_name + '\'' +
                ", goods_number=" + goods_number +
                ", goods_price=" + goods_price +
                ", guarantee_period=" + guarantee_period +
                ", cid='" + cid + '\'' +
                '}';
    }

    public Goods() {
    }

    public Goods(Integer goods_id, String goods_name, Integer goods_number, Double goods_price, Date guarantee_period, String cid) {
        this.goods_id = goods_id;
        this.goods_name = goods_name;
        this.goods_number = goods_number;
        this.goods_price = goods_price;
        this.guarantee_period = guarantee_period;
        this.cid = cid;
    }

    public Integer getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(Integer goods_id) {
        this.goods_id = goods_id;
    }

    public String getGoods_name() {
        return goods_name;
    }

    public void setGoods_name(String goods_name) {
        this.goods_name = goods_name;
    }

    public Integer getGoods_number() {
        return goods_number;
    }

    public void setGoods_number(Integer goods_number) {
        this.goods_number = goods_number;
    }

    public Double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(Double goods_price) {
        this.goods_price = goods_price;
    }
    @JsonFormat(pattern = "yyyy-MM-dd")
    public Date getGuarantee_period() {
        return guarantee_period;
    }

    public void setGuarantee_period(Date guarantee_period) {
        this.guarantee_period = guarantee_period;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}