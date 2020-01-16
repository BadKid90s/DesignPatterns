package com.wry.patterns.facade.type2;


import java.io.*;

public class FileWriter {
    public void Write(String encryptStr, String fileNameDes) {
        System.out.println("保存密文，写入文件。");
        FileOutputStream fs = null;
        try {
            fs = new FileOutputStream(fileNameDes);
            byte[] str = encryptStr.getBytes();
            fs.write(str, 0, str.length);
            fs.flush();
            fs.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在！");
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("文件操作错误！");
        }
    }
}
