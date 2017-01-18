package euler;


import java.util.ArrayList;


public class Euler21 {
	
	public static void main(String[] args) {
		int input = 10000;
		ArrayList<Integer> amicableNumbers = new ArrayList<Integer>();
		for(int i = 1; i<= input; i++) {
			if (isAmicable(i) ) {
				amicableNumbers.add(i);
			}
		}
		for(int i : amicableNumbers) {
			System.out.println(i);
		}
		int output = sumAl(amicableNumbers);
		System.out.println("total: "+output);
		return;
	}
	
	public static ArrayList<Integer> getProperDivisors(int number){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int i=1; i<number; i++) {
			if(number % i == 0) {
				output.add(i);
			}
		}
		return output;
	}
	
	public static boolean isAmicable(int number) {
		
		ArrayList<Integer> pDivisors = getProperDivisors(number);
		int sum1 = sumAl(pDivisors);
		int sum2 = sumAl(getProperDivisors(sum1));
		
		if(sum2 == number && sum2 != sum1) {
			return true;
		}
		return false;
	}
	
	public static int sumAl(ArrayList<Integer> list) {
		int cumul = 0;
		for(int i : list) {
			cumul+=i;
		}
		return cumul;
	}

}
