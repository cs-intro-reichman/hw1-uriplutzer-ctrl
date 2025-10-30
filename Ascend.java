// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		double number1 = Math.random() * lim;
		double number2 = Math.random() * lim;
		double number3 = Math.random() * lim;
		System.out.println((int) number1 + " " + (int) number2 + " " + (int) number3);
		double minNum = Math.min(number1, number2);
		minNum = Math.min(minNum, number3);
		double maxNum = Math.max(number1, number2);
		maxNum = Math.max(maxNum, number3);
		double middleNum = number1 + number2 + number3 - minNum - maxNum;
		System.out.println((int) minNum + " " + (int) middleNum + " " + (int) maxNum);

		// Replace this comment with your code
	}
}
