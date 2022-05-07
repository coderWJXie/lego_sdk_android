package com.example.lgsdk;

import com.example.lgsdk.LGComment.LG;
import com.example.lgsdk.LGUtils.LGUtils;

/**
 * 怎么新建一个demo & library
 * 1.新建demo
 * 2.新建Module
 * 3.添加依赖
 * 4.项目部署
 */

/**
 * 添加依赖 - https://blog.csdn.net/qq_29623203/article/details/51191129
 * 选择Project -> LGGame -> File -> Project Structure... -> Dependencies -> 选中App -> +LGSDK
 */
public class LGSDK {

    public static void initSDK() {
        LGUtils.log("初始化开始...");

        // 是否是重复初始化
        if (false) {
            // 重复初始化
            return;
        }

        // 渠道初始化之前
        LG.initBefore();
    }

    public static void login() {
        // 1.是否已经初始化

        // 2.是否已经登录

        // 3.渠道登录之前
        LG.loginBefore();
    }

    public static void logout() {

    }

    public static void switchAccount() {

    }

    public static void pay(LGPayConfig config) {

    }

    /**************************此处需要根据渠道修改 - start**************************/
    private static void initPFSDK() {

    }

    private static void loginPFSDK() {

    }
    /**************************此处需要根据渠道修改 - end**************************/
}
