package RSA;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import java.security.*;
import java.util.Base64;

public class RsaAesUtil {
    private static final String RSA = "RSA";
    private static final String AES = "AES";

    // RSA 키쌍 생성
    public static KeyPair generateKeyPair() throws NoSuchAlgorithmException {
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(RSA);
        keyPairGenerator.initialize(2048, new SecureRandom());
        return keyPairGenerator.generateKeyPair();
    }

    // 대칭키(AES) 생성
    public static SecretKey generateSymmetricKey() throws NoSuchAlgorithmException {
        KeyGenerator keyGen = KeyGenerator.getInstance(AES);
        keyGen.init(256); // AES-256
        return keyGen.generateKey();
    }

    // 대칭키를 RSA 공개키로 암호화
    public static String encryptSymmetricKey(SecretKey key, PublicKey publicKey)
            throws Exception {
        Cipher cipher = Cipher.getInstance(RSA);
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        byte[] encryptedKey = cipher.doFinal(key.getEncoded());
        return Base64.getEncoder().encodeToString(encryptedKey);
    }

    // 암호화된 대칭키를 RSA 개인키로 복호화
    public static SecretKey decryptSymmetricKey(String encryptedKey, PrivateKey privateKey)
            throws Exception {
        Cipher cipher = Cipher.getInstance(RSA);
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] decodedKey = cipher.doFinal(Base64.getDecoder().decode(encryptedKey));
        return new SecretKeySpec(decodedKey, AES);
    }

    // 대칭키로 데이터 암호화
    public static String encryptData(String data, SecretKey symmetricKey) throws Exception {
        Cipher cipher = Cipher.getInstance(AES);
        cipher.init(Cipher.ENCRYPT_MODE, symmetricKey);
        byte[] encryptedData = cipher.doFinal(data.getBytes());
        return Base64.getEncoder().encodeToString(encryptedData);
    }

    // 대칭키로 데이터 복호화
    public static String decryptData(String encryptedData, SecretKey symmetricKey) throws Exception {
        Cipher cipher = Cipher.getInstance(AES);
        cipher.init(Cipher.DECRYPT_MODE, symmetricKey);
        byte[] decryptedData = cipher.doFinal(Base64.getDecoder().decode(encryptedData));
        return new String(decryptedData);
    }
}
