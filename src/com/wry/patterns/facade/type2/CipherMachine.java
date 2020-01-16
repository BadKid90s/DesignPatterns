package com.wry.patterns.facade.type2;

/**
 * 数据加密类，充当子系统类
 */
public class CipherMachine {
    public String Encrypt(String plainText) {
        System.out.println("数据加密，将明文转换为密文：");
        String es = "";
        char[] chars = plainText.toCharArray();
        for (char ch : chars) {
            int c = (ch % 7);
            es += c;
        }
        return es;
    }
}