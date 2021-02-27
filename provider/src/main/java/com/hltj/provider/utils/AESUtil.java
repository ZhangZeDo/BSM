package com.hltj.provider.utils;

import org.bouncycastle.util.encoders.Hex;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AESUtil {
    static final String KEY = "b70c81e683ecdba295e8aaa520b2301b";

    //生成AES秘钥，然后Base64编码
    static String genKeyAES() throws Exception {
        KeyGenerator keyGen = KeyGenerator.getInstance("AES");
        keyGen.init(128);
        SecretKey key = keyGen.generateKey();
        // System.out.println(key.getEncoded());
        String base64Str = toBinStr(key.getEncoded());
        return base64Str;
    }

    //将Base64编码后的AES秘钥转换成SecretKey对象
    static SecretKey loadKeyAES(String base64Key) throws Exception {
        byte[] bytes = binParse(base64Key);
        SecretKeySpec key = new SecretKeySpec(bytes, "AES");
        return key;
    }

    //字节数组转Base64编码
    static String toBinStr(byte[] bytes) {
        return Hex.encode(bytes).toString();
    }

    //Base64编码转字节数组
    static byte[] binParse(String base64Key) {
        return Hex.decode(base64Key);
    }

    //加密
    static byte[] encryptAES(byte[] source, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, key);
        return cipher.doFinal(source);
    }

    //解密
    static byte[] decryptAES(byte[] source, SecretKey key) throws Exception {
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.DECRYPT_MODE, key);
        return cipher.doFinal(source);
    }

    //加密id
    static String encryptInner(String id) throws Exception {
        String message = id;
        //生成AES秘钥，并Base64编码
//            String base64Str = AESUtil.genKeyAES();
        String base64Str = KEY;
        //将Base64编码的字符串，转换成AES秘钥
        SecretKey aesKey = loadKeyAES(base64Str);
        //加密
        byte[] encryptAES = encryptAES(message.getBytes(), aesKey);
        //加密后的内容Base64编码
        String byte2Base64 = AESUtil.toBinStr(encryptAES);
        return byte2Base64;
    }

    static String decryptInner(String byte2Base64) throws Exception {
        String base64Str = KEY;
        SecretKey aesKey2 = AESUtil.loadKeyAES(base64Str);
        //加密后的内容Base64解码
        byte[] base642Byte = AESUtil.binParse(byte2Base64);
        //解密
        byte[] decryptAES = AESUtil.decryptAES(base642Byte, aesKey2);
        return new String(decryptAES);
    }


    public static String decrypt(String content) {

        if (content.startsWith("enc$")) {
            try {
                return decryptInner(content.substring(4));
            } catch (Exception e) {
                throw new RuntimeException("未能解密密码", e);
            }
        }
        return content;


    }

    public static String encrypt(String content) {
        try {
            return "enc$" + encryptInner(content);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] ss) throws IOException {
        while (true) {
            System.out.println("Inputv:");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String s = bufferedReader.readLine();
            String encrypt = encrypt(s);
            String decrypt = decrypt(encrypt);
            System.out.println(s + "===> " + encrypt + " --> " + decrypt);
        }

    }

}