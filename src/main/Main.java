package main;

/*
 * Di ka kasabot ani?
 * I burger rana
 */
public class Main {
	
	public static void main(String[] args) {
		
		//Testing
		System.out.printf("Binary form of 100 = %s%n", decimalToBinary(100));
		System.out.printf("Decimal form of 1100100 = %d%n", binaryToDecimal("1100100"));
		System.out.printf("Octal form of 100 = %s%n", decimalToOctal(69));
	}
	
	/* Converts decimal(int) to binary(String)
	 * 
	 */
	public static String decimalToBinary(int decimal) {
		String binary = "";
		
		while(true) {
			
			binary = (decimal % 2) + binary;
			decimal /= 2;
			
			if(decimal / 2 == 0) {
				binary = (decimal % 2) + binary;
				break;
			}
		}
		
		return binary;
	}
	
	/* Converts binary(String) to decimal(int)
	 */
	static int binaryToDecimal(String binary) {
		int decimal = 0;
		int binaryIndex = binary.length() - 1;
		
		for(int i = 0; i < binary.length(); i++)
			decimal += (int) Math.pow(2, binaryIndex--) * Character.getNumericValue(binary.charAt(i));
		
		return decimal;
	}
	
	/*
	 * Converts decimal(int) to octal(String)
	 */
	static String decimalToOctal(int decimal) {
		String octal = "";
		
		while(true) {
			
			octal = (decimal % 8) + octal;
			decimal /= 8;
			
			if(decimal / 8 == 0) {
				
				octal = (decimal % 8) + octal;
				break;
			}
		}
		
		return octal;
	}
}