package com.xiyuan.helloworld.task;

import com.google.gson.JsonElement;
import com.xiyuan.spider.annotation.OnStart;
import com.xiyuan.spider.annotation.Task;

/**
 * Created by xiyuan_fengyu on 2017/3/31.
 */
@Task
public class HelloWorld {

    @OnStart(name = "hello world", url = "https://www.baidu.com", js = "js/HelloWorld.js")
    public void test(String url, JsonElement result) {
        System.out.println(result);
    }

}
