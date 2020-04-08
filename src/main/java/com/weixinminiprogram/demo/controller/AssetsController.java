package com.weixinminiprogram.demo.controller;

import com.weixinminiprogram.demo.entity.Assets;
import com.weixinminiprogram.demo.repository.AssetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class AssetsController {

    @Autowired
    AssetsRepository assetsRepository;

//    根据id进行查找
    @GetMapping("/Find/{assets_id}")
    public Assets getAssets(@PathVariable("assets_id") Integer assets_id){
        Assets assets = new Assets();
        assets.setId(assets_id);
        Example<Assets> example = Example.of(assets);
        Optional<Assets> one = assetsRepository.findOne(example);
        return one.get();
    }

//    列表
    @GetMapping("/List")
    public ArrayList<Assets> getAllAssets(){
        List<Assets> list = assetsRepository.findAll();
        ArrayList<Assets> S = new ArrayList<>();
        for (Assets assets : list){
            S.add(assets);
        };
        return S;
    }

//    增加
    @GetMapping("/Add")
    public Assets insertAssets(Assets assets){
        Assets save = assetsRepository.save(assets);
        return save;
    }

//    更新
    @GetMapping("/Update")
    public Assets updateAssets(Assets assets){
        Assets save = assetsRepository.save(assets);
        return save;
    }

//    删除
    @GetMapping("/Delete/{assets_id}")
    public boolean deleteById(@PathVariable("assets_id") Integer assets_id){
        assetsRepository.deleteById(assets_id);
        return true;
    }
}
