package be.pxl.lambdaexpressions.opdracht2;

public class Cryptograaf {
		
	/*public static String encryptFirst(String message) {
		Bericht bericht = new Bericht(message);
		
		String encrypted = bericht.encrypt(new Encryptie() {
			public String apply(String s) {
				return new StringBuilder(s).reverse().toString();
			}
		});
		
		return encrypted;
	}*/
	
	public static String encryptFirst(String message) {
		Bericht bericht = new Bericht(message);
		
		String encrypted = bericht.encrypt(s -> new StringBuilder(s).reverse().toString());
		
		return encrypted;
	}
	
	public static String encryptSimple(String message) {
		Bericht bericht = new Bericht(message);
		
		String encrypted = bericht.encrypt(new Encryptie() {
			public String apply(String s) {
				char[] chars = s.toUpperCase().toCharArray();
				String result = "";
				for(int i=0;i<chars.length;i++) {
					if(Character.isAlphabetic(chars[i])) {
						result += Character.getNumericValue(chars[i]);
					} else {
						result += chars[i];
					}
					result += (i<chars.length-1) ? "-" : "";
				}
				return result;
			}
		});
		
		return encrypted;
	}
	
	public static String encryptLambda(String message) {
		Bericht bericht = new Bericht(message);
		
		String encrypted = bericht.encrypt(s -> {
				char[] chars = s.toLowerCase().toCharArray();
				for(int i=0;i<chars.length;i++) {
					if(Character.isAlphabetic(chars[i])) {
						char temp = chars[i];
						temp += s.length();
						if(!Character.isAlphabetic(temp)) {
							chars[i] -= 26-s.length();
						} else {
							chars[i] += s.length();
						}
					}
				}
				return new String(chars);
			}
		);
		
		return encrypted;
	}
}
