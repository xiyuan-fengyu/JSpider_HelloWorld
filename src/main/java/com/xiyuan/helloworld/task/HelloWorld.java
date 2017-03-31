package com.xiyuan.helloworld.task;

import com.google.gson.JsonElement;
import com.xiyuan.spider.annotation.OnMessage;
import com.xiyuan.spider.annotation.OnStart;
import com.xiyuan.spider.annotation.OnTime;
import com.xiyuan.spider.annotation.Task;

/**
 * Created by xiyuan_fengyu on 2017/3/31.
 */
@Task
public class HelloWorld {

    @OnStart(name = "hello world", url = "https://www.baidu.com", js = "js/HelloWorld.js", timeout = 30)
    @OnTime(name = "hello world", cron = "*/10 * * * * ? ", url = "https://www.baidu.com", js = "js/HelloWorld.js")
    @OnMessage(name = "hello world", fromQueue = "just test", js = "js/HelloWorld.js", parallel = 10)
    public void test(String url, JsonElement result) {
        System.out.println(result);
    }

}
