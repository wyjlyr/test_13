package com.czxy.Service.Impl;

import com.czxy.GoodsDao;
import com.czxy.Service.GoosService;
import com.czxy.domain.Goods;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2020/8/7 0007.
 */
@Service
public class ImplGoosService implements GoosService {
    @Resource
    private GoodsDao GoodsDao;


    @Override
    public Boolean findByName(String goods_name) {
        Example example = new Example(Goods.class);
        Example.Criteria c = example.createCriteria();
        c.andEqualTo("goods_name",goods_name);
        Goods goods = GoodsDao.selectOneByExample(example);
        if (goods==null){
            return true;
        }
        return false;
    }

    @Override
    public void add(Goods goods) {
        GoodsDao.insert(goods);

    }

    @Override
    public List<Goods> findByglist() {
        return GoodsDao.findAll();
    }
}
