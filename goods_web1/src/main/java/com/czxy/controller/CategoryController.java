package com.czxy.controller;

import com.czxy.Service.CategoryService;
import com.czxy.Service.GoosService;
import com.czxy.domain.Category;
import com.czxy.domain.Goods;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author
 * @version 1.0
 * @date 2020/8/7
 * @infos 说明信息:
 */
@RequestMapping("/category")
@Controller
public class CategoryController {
    @Resource
    private CategoryService categoryService;
    @Resource
    private GoosService goosService;
    @GetMapping("/searchall")
    public ResponseEntity<List<Category>> searchAlll(){
        List<Category>categoryList=categoryService.searchall();
        System.out.println("wanyijie"+categoryList);
        return ResponseEntity.ok(categoryList);
    }
    @GetMapping("/checkCname/{goodsName}")
    public @ResponseBody Boolean checkgoodsName(@PathVariable(name = "goodsName") String gname){
        Boolean check=goosService.findByName(gname);
        return check;
    }
    @PostMapping("/add")
    public String addGoods( Goods goods){
        goosService.add(goods);
        return "redirect:/goods/list.jsp";
    }
    @GetMapping("/findByglist")
    public ResponseEntity<List<Goods>>  findByglist(){
        List<Goods>categoryList= goosService.findByglist();
        return ResponseEntity.ok(categoryList);
    }



}
