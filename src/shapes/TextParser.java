package shapes;

import com.sun.org.apache.xerces.internal.impl.dv.util.HexBin;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TextParser {
	public String parse(String input){
		MessageDigest messageDigest = null;
		try {
			messageDigest = MessageDigest.getInstance("SHA-256");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		byte[] arr = messageDigest.digest(input.getBytes());
		String hex = HexBin.encode(arr);
		String base36 = new BigInteger(hex,16).toString(36);
		return base36.toUpperCase();
	}
}
