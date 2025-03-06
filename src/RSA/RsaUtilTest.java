//package RSA;
//
//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import org.junit.platform.commons.logging.Logger;
//import org.junit.platform.commons.logging.LoggerFactory;
//
//import java.security.KeyPair;
//
//
//class RsaUtilTest {
//
//    private final Logger logger = LoggerFactory.getLogger(RsaUtilTest.class);
//
//    private static String publicKey;
//    private static String privateKey;
//
//    @Test
//    @DisplayName("2048bit RSA KeyPair 생성")
//    void generateKeyPair() throws Exception{
//
//        KeyPair keyPair = RsaUtil.generateKeyPair();
//
//        publicKey = RsaUtil.base64EncodeToString(keyPair.getPublic().getEncoded());
//        privateKey = RsaUtil.base64EncodeToString(keyPair.getPrivate().getEncoded());
//
//        logger.info(() -> "Encoding : " + publicKey);
//        logger.info(() -> "Decoding : " + privateKey);
//    }
//
//    @Test
//    @DisplayName("RSA-2048 공개키(비대칭키) 암호화/ 복호화")
//    void testRsa2048() throws Exception{
//
//        String testText = "RSA 테스트 중.";
//
//        String encryptedPlainText = RsaUtil.rsaEncode(testText, publicKey);
//        String decryptedPlainText = RsaUtil.rsaDecode(encryptedPlainText, privateKey);
//
//        logger.info(() -> "Encoding : " + encryptedPlainText);
//        logger.info(() -> "Decoding : " + decryptedPlainText);
//
//    }
//
//    // AES 대칭키로 암호화하고 RSA 공개키로 AES 대칭키를 암호화해서 저장하는 방식을 많이 사용한다
//    // AES가 대용량 처리가 쉽고 빠르기 때문에 하이브리드로 사용하면 좋다 물론 용도에 맞게 선택은 내가 해야한다.
//
//}