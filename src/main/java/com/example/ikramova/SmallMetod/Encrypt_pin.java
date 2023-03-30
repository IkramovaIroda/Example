package com.example.ikramova.SmallMetod;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class Encrypt_pin {

    private static final Logger log = LoggerFactory.getLogger(Encrypt_pin.class);

    public static void main(String[] args) {
        digestHex("1234");
    }
    public static String digestHex(String text) {
        StringBuilder stringBuffer = new StringBuilder();
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");// SHA-256
            digest.reset();
            for (byte b : digest.digest(text.getBytes(StandardCharsets.ISO_8859_1))) {
                stringBuffer.append(Integer.toHexString((int) (b & 0xff)));
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        System.out.println(stringBuffer.toString());
        return stringBuffer.toString();
    }
}
