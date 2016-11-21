
/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Euler5 {

	public static void main(String args[]){
		for(int i=0;i<999999999;i+=20){
			if(isDivisible(i)){
				System.out.println(i);
			}
		}
	}

	public static boolean isDivisible(int input){
		for(int i=1;i<=20;i++){
			if(input%i!=0){
				return false;
			}
		}
		return true;
	}
}
