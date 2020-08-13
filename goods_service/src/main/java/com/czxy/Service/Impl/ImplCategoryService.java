package com.czxy.Service.Impl;

import com.czxy.Service.CategoryService;
import com.czxy.CategoryDao;
import com.czxy.domain.Category;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2020/8/7 0007.
 */
@Service
@Transactional
public class ImplCategoryService implements CategoryService {
    @Resource
    private CategoryDao CategoryDao;

    @Override
    public List<Category> searchall() {
        List<Category> categoryList = CategoryDao.selectAll();
        return categoryList;
    }

}
