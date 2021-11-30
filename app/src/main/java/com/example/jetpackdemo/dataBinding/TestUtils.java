package com.example.jetpackdemo.dataBinding;

/**
 * @TODO: import 标签的使用: 让xml文件可以直接使用Utils这样的方法。进一步解耦A和xml联合使用的场景。
 * @Date: 2021/11/24 9:09
 * @User: lay
 */
public class TestUtils {
    public static String changeData(int type){
        String result;
        switch (type) {
            case 1:
                result = "演员";
                break;
            case 2:
                result = "作家";
                break;
            case 3:
                result = "歌手";
                break;
            case 4:
                result = "程序员";
                break;
            default:
                result = "啥也不是";
                break;
        }
        return result;
    }
}
