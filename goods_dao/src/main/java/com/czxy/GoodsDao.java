package com.czxy;

import com.czxy.domain.Goods;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * Created by Administrator on 2020/8/7 0007.
 */
@org.apache.ibatis.annotations.Mapper
public interface GoodsDao extends Mapper<Goods> {
    @Select("select * from tbl_goods")
    @Results({
            @Result(property = "cid",column = "cid"),
            @Result(property = "category",column = "cid",one = @One(select = "com.czxy.CategoryDao.selectByPrimaryKey"))
    })
    List<Goods> findAll();

}
