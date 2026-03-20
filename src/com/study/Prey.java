package com.study;

public interface Prey {
    //接口，定义猎物的行为
    //实现类必须实现flee方法来逃避捕食者
    Prey flee();
}