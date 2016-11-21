/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10 001st prime number?
 */
public class Euler7 {
	
	public static void main(String args[]){
		int counter =0;
		int inst=2;
		int[] primes=new int[10001];
		while (true){
			if(isPrime(inst)){
				
				primes[counter]=inst;
				counter++;
			}
			if(counter==10001){
				break;
			}
			inst++;
		}
		System.out.println(primes[10000]);
		System.out.println(isPrime(4));
		for(int i=0;i<15;i++){
			System.out.println(primes[i]);
		}
		
	}
	public static boolean isPrime(int n){
		for (int i=2;i<=Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
		
	}
	
}
