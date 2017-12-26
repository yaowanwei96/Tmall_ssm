package com.how2java.tmall.pojo;

/**
 * Created by Administrator on 2017/12/26.
 */
public class Category {
    private int id;
    private String name;

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null?null:name.trim();
    }
}
