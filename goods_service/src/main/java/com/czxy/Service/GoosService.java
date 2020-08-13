package com.czxy.Service;

import com.czxy.domain.Goods;

import java.util.List;

/**
 * Created by Administrator on 2020/8/7 0007.
 */
public interface GoosService {
    Boolean findByName(String goods_name);

    void add(Goods goods);

    List<Goods> findByglist();
}
