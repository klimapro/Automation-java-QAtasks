package str.Coder;

public class RLEdeCoder {
	public static String decoder(String inputData){
		StringBuffer text = new StringBuffer();
		if (Character.isDigit(inputData.charAt(inputData.length() -1)))
			return text.toString();
		for (int i = 0; i < inputData.length(); i++){
			if (Character.isDigit(inputData.charAt(i))){
				if (Character.getNumericValue(inputData.charAt(i)) <= 9)
				for (int j = 0; j < Character.getNumericValue(inputData.charAt(i)) - 1; j++)
				text.append(inputData.charAt(i+1));
				i++;}
			text.append(inputData.charAt(i));}
		return text.toString();}
}