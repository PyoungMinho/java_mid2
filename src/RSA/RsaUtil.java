package RSA;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;

public class RsaUtil {
    private static final String INSTANCE_TYPE ="RSA";

    // 2048bit RSA KeyPair 생성
    public static KeyPair generateKeyPair() throws NoSuchAlgorithmException {

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance(INSTANCE_TYPE);
        keyPairGenerator.initialize(2048, new SecureRandom()); // 1024에 비해 생성 속도는 느리지만 보안적 측면에서 우수하다.

        return keyPairGenerator.generateKeyPair();
    }

    public static String rsaEncode(String plainText, String publicKey)
            throws InvalidKeyException, InvalidKeySpecException, NoSuchAlgorithmException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {

        Cipher cipher = Cipher.getInstance(INSTANCE_TYPE);
        cipher.init(Cipher.ENCRYPT_MODE, convertPublicKey(publicKey));

        byte[] plainTextBytes = cipher.doFinal(plainText.getBytes());

        return base64EncodeToString(plainTextBytes);
    }

    public static String rsaDecode(String encryptedText, String privateKey)
            throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidKeySpecException, IllegalBlockSizeException, BadPaddingException {

        byte[] encryptedPlainTextByte = Base64.getDecoder().decode(encryptedText.getBytes());

        Cipher cipher = Cipher.getInstance(INSTANCE_TYPE);
        cipher.init(Cipher.DECRYPT_MODE, convertPrivateKey(privateKey));

        return new String(cipher.doFinal(encryptedPlainTextByte));
    }



    public static PublicKey convertPublicKey(String publicKey)
        throws InvalidKeySpecException, NoSuchAlgorithmException{

        KeyFactory keyFactory = KeyFactory.getInstance(INSTANCE_TYPE);
        byte[] publicKeyByte = Base64.getDecoder().decode(publicKey.getBytes());

        return keyFactory.generatePublic(new X509EncodedKeySpec(publicKeyByte));
    }

    public static PrivateKey convertPrivateKey(String privateKey)
        throws InvalidKeySpecException, NoSuchAlgorithmException{

        KeyFactory keyFactory = KeyFactory.getInstance(INSTANCE_TYPE);
        byte[] privateKeyByte = Base64.getDecoder().decode(privateKey.getBytes());

        return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(privateKeyByte));
    }


    public static String base64EncodeToString(byte[] bytes) {
        return Base64.getEncoder().encodeToString(bytes);
    }
}
