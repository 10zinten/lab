import java.util.Scanner;

public class GenNewNumber{

	public int modifyNumber(int number1){
		String num = Integer.toString(number1);
		StringBuffer newNum = new StringBuffer();
		for(int i = 0; i < num.length() - 1; i++) {
			int dig1 = Character.getNumericValue(num.charAt(i));
			int dig2 = Character.getNumericValue(num.charAt(i + 1));
			//System.out.println(dig1);
			//System.out.println(dig2);
			//System.out.println(Math.abs(dig2 - dig1));

			newNum.append(Math.abs(dig2 - dig1));
			//System.out.println(newNum);
		}
		newNum.append(num.charAt(num.length() - 1));
		return Integer.parseInt(newNum.toString());
	}

	public static void main(String[] args) {
		GenNewNumber num = new GenNewNumber();
		Scanner in = new Scanner(System.in);
		System.out.print("Input: ");
		System.out.println("Output: " + num.modifyNumber(in.nextInt()));
	}
}