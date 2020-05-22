package login;
import java.security.MessageDigest;
//import org.springframework.security.crypto.encrypt.Encryptors;
//import org.springframework.security.crypto.encrypt.TextEncryptor;
//import org.springframework.security.crypto.keygen.KeyGenerators;
public class EncryptExample {
    public static void main(String[] args) {
    	EncryptExample myobj=new EncryptExample();
    	String pass="abhayy";
    	myobj.EncryptExample_function(pass);
    }
    public String EncryptExample_function(String pass) {
        String password = pass;
        String algorithm = "SHA";

        byte[] plainText = password.getBytes();

        try {
            MessageDigest md = MessageDigest.getInstance(algorithm);

            md.reset();
            md.update(plainText);
            byte[] encodedPassword = md.digest();

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < encodedPassword.length; i++) {
                if ((encodedPassword[i] & 0xff) < 0x10) {
                    sb.append("0");
                }

                sb.append(Long.toString(encodedPassword[i] & 0xff, 16));
            }
            System.out.println("Plain    : " + password);
            System.out.println("Encrypted: " + sb.toString());
           System.out.println(sb.getClass().getName());           
           return sb.toString();
        } catch (Exception e) {
        	e.printStackTrace();
        }
        
        return "gatalhai";
   }
    
    
    
//    public static final String md5(final String toEncrypt) {
//        try {
//            final MessageDigest digest = MessageDigest.getInstance("md5");
//            digest.update(toEncrypt.getBytes());
//            final byte[] bytes = digest.digest();
//            final StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < bytes.length; i++) {
//                sb.append(String.format("%02X", bytes[i]));
//            }
//            return sb.toString().toLowerCase();
//        } catch (Exception exc) {
//            return ""; // Impossibru!
//        }
//    }
}