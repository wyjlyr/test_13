package com.czxy.domain;

import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by Administrator on 2020/8/7 0007.
 */
@Table(name = "tbl_category")
public class Category {
    @Id
   private String  cid ;
   private String  cname ;

    @Override
    public String toString() {
        return "Tbl_category{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                '}';
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Category(String cid, String cname) {
        this.cid = cid;
        this.cname = cname;
    }

    public Category() {
    }
}
