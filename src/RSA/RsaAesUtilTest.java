//package RSA;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//
//import javax.crypto.SecretKey;
//import java.security.KeyPair;
//import java.security.PrivateKey;
//import java.security.PublicKey;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class RsaAesUtilTest {
//
//    @Test
//    @DisplayName("RSA 키쌍 생성 테스트")
//    public void testGenerateKeyPair() throws Exception {
//        KeyPair keyPair = RsaAesUtil.generateKeyPair();
//        assertNotNull(keyPair);
//        assertNotNull(keyPair.getPublic());
//        assertNotNull(keyPair.getPrivate());
//    }
//
//    @Test
//    @DisplayName("AES 대칭키 생성")
//    public void testGenerateSymmetricKey() throws Exception {
//        // 대칭키(AES) 생성
//        SecretKey symmetricKey = RsaAesUtil.generateSymmetricKey();
//        assertNotNull(symmetricKey);
//        assertEquals("AES", symmetricKey.getAlgorithm());
//    }
//
//    @Test
//    @DisplayName("AES 대칭키와 RSA 이용한 암호화/복호화 테스트")
//    public void testEncryptAndDecryptSymmetricKey() throws Exception {
//        // RSA 키쌍 생성
//        KeyPair keyPair = RsaAesUtil.generateKeyPair();
//        PublicKey publicKey = keyPair.getPublic();
//        PrivateKey privateKey = keyPair.getPrivate();
//
//        // 대칭키 생성
//        SecretKey symmetricKey = RsaAesUtil.generateSymmetricKey();
//
//        // 대칭키를 RSA 공개키로 암호화
//        String encryptedSymmetricKey = RsaAesUtil.encryptSymmetricKey(symmetricKey, publicKey);
//
//        // 암호화된 대칭키를 RSA 개인키로 복호화
//        SecretKey decryptedSymmetricKey = RsaAesUtil.decryptSymmetricKey(encryptedSymmetricKey, privateKey);
//
//        // 원본 대칭키와 복호화된 대칭키 비교
//        assertArrayEquals(symmetricKey.getEncoded(), decryptedSymmetricKey.getEncoded());
//    }
//
//    @Test
//    public void testEncryptAndDecryptData() throws Exception {
//        // RSA 키쌍 생성
//        KeyPair keyPair = RsaAesUtil.generateKeyPair();
//        PublicKey publicKey = keyPair.getPublic();
//        PrivateKey privateKey = keyPair.getPrivate();
//
//        // 대칭키 생성
//        SecretKey symmetricKey = RsaAesUtil.generateSymmetricKey();
//
//        // 대칭키를 RSA 공개키로 암호화
//        String encryptedSymmetricKey = RsaAesUtil.encryptSymmetricKey(symmetricKey, publicKey);
//
//        // 암호화된 대칭키를 RSA 개인키로 복호화
//        SecretKey decryptedSymmetricKey = RsaAesUtil.decryptSymmetricKey(encryptedSymmetricKey, privateKey);
//
//        // 데이터 암호화
//        String originalData = "Test Data";
//        String encryptedData = RsaAesUtil.encryptData(originalData, symmetricKey);
//
//        // 데이터 복호화
//        String decryptedData = RsaAesUtil.decryptData(encryptedData, decryptedSymmetricKey);
//
//        // 원본 데이터와 복호화된 데이터 비교
//        assertEquals(originalData, decryptedData);
//    }
//}
