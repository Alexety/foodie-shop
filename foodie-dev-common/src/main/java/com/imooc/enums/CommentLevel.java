package com.imooc.enums;



//商品评价等级  枚举
public enum CommentLevel {

    GOOD(1, "好评"),
    NORMAL(2,"一般"),
    BAD(3,"一般");


    public final Integer type;
    public final String value;

    CommentLevel(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
