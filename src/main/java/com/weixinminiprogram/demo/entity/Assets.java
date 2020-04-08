package com.weixinminiprogram.demo.entity;

import javax.persistence.*;

//使用JPA注解配置映射关系
@Entity//告诉JPA这是一个实体类（和数据表映射的类）
@Table(name="assets")
public class Assets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自增主键
    private Integer assets_id;

    private String assets_name;
    private String assets_value;
    private String assets_address;

    public Integer getId() {
        return assets_id;
    }

    public void setId(Integer id) {
        this.assets_id = id;
    }

    public String getAssets_name() {
        return assets_name;
    }

    public void setAssets_name(String assets_name) {
        this.assets_name = assets_name;
    }

    public String getAssets_value() {
        return assets_value;
    }

    public void setAssets_value(String assets_value) {
        this.assets_value = assets_value;
    }

    public String getAssets_address() {
        return assets_address;
    }

    public void setAssets_address(String assets_address) {
        this.assets_address = assets_address;
    }
}
