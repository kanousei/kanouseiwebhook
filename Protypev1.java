import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Protypev1 {
	
	public static void main(String[] args) {
		
		String channelSecret = '6722502cf6fe4c9c0d19c7ffbe6fc8ff';
		String httpRequestBody = '...'; // Request body string
		SecretKeySpec key = new SecretKeySpec(channelSecret.getBytes(), "HmacSHA256");
		Mac mac = Mac.getInstance("HmacSHA256");
		mac.init(key);
		byte[] source = httpRequestBody.getBytes("UTF-8");
		String signature = Base64.encodeBase64String(mac.doFinal(source));
		// Compare x-line-signature request header string and the signature
	}	
}
//https://github.com/kanousei/kanouseiwebhook.git
