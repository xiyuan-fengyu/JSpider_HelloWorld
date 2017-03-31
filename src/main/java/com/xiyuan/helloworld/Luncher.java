package com.xiyuan.helloworld;

import com.xiyuan.luncher.MasterLuncher;
import com.xiyuan.luncher.WorkerLuncher;

/**
 * Created by xiyuan_fengyu on 2017/3/31.
 */
public class Luncher {

    public static void main(String[] args) {
        MasterLuncher.startMaster();
        WorkerLuncher.startWorker();
    }

}
