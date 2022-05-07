package com.example.lgsdk.LGComment;

public class LG {
    public static void initBefore() {
        // 1.重复初始化
        // 2.加载数据
        loadConfig();
        // 3.请求网络
        enterGame();
    }

    public static void initAfter() {

    }

    public static void loginBefore() {
        // 目前什么事情都不需要做直接调用
    }

    public static void loginAfter() {

    }

    private static void loadConfig() {

    }

    private static void enterGame() {
        // 回到LGSDK
    }
}
