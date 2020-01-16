package com.wry.patterns.facade.type2;

/**
 * 加密外观类，充当外观类。
 */
public class EncryptFacade {
    //维持对其他对象的引用
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade() {
        reader = new FileReader();
        cipher = new CipherMachine();
        writer = new FileWriter();
    }

    /**
     * 调用其他对象的业务方法
     */
    public void FileEncrypt(String fileNameSrc, String fileNameDes) {
        String plainStr = reader.Read(fileNameSrc);
        String encryptStr = cipher.Encrypt(plainStr);
        System.out.println(encryptStr);
        System.out.println(fileNameDes);
    }
}
