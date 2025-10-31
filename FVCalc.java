// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args) {
		// Replace this comment with your code
		int currntValue = Integer.parseInt(args[0]);
		double interesrRate = Double.parseDouble(args[1]);
		int years = Integer.parseInt(args[2]);
		double futureValue = currntValue * Math.pow(1 + (interesrRate / 100), years);
		System.out.println("After " + years + " years, $" + currntValue + " saved at " + interesrRate
				+ "% will yield " + (int) futureValue + "$");
	}
}