package com.wry.patterns.facade.type2;

import com.wry.utils.XMLUtil;

public class Client {
    public static void main(String[] args) {
        String filePath = new Client().getClass().getResource("").getPath();

        EncryptFacade ef = new EncryptFacade();
        ef.FileEncrypt(filePath+"src.txt", filePath+"des.txt");

        System.out.println("--------------------使用配置文件--------------------");
        NewEncryptFacade  encryptFacade = (NewEncryptFacade)XMLUtil.getBean(new Client(), "className");
        encryptFacade.FileEncrypt(filePath+"src.txt", filePath+"des.txt");
    }
}
