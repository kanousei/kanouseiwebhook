import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

public class Protypev1 {
	
	public static void main(String[] args) {
		
		String channelSecret = '１';
		String httpRequestBody = 'info.json'; // Request body string
		SecretKeySpec key = new SecretKeySpec(channelSecret.getBytes(), "HmacSHA256");
		Mac mac = Mac.getInstance("HmacSHA256");
		mac.init(key);
		byte[] source = httpRequestBody.getBytes("UTF-8");
		String signature = Base64.encodeBase64String(mac.doFinal(source));
		// Compare x-line-signature request header string and the signature
	}	
}
//https://github.com/kanousei/kanouseiwebhook.git
