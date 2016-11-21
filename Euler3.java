/*
 * The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?
 */

public class Euler3 {
	
	public static void main(String[] args){
		long big=600851475143L;/*
		long[] primes = new long[15000];
		primes=answer2(big);
		//answer(600851475143L);
		//System.out.println(13195L/29);
		for(int i=0;i<15000;i++){
			if(big%primes[i]==0){
				System.out.println(i);
			}
		}*/
		//int i=6857;
		//System.out.println(isPrime(i));
		//System.out.println(isFactor(i,big));
		//System.out.println(big%i);
		answer3(big);
		
	}
	
	public static boolean isPrime(long n){
		for (long i=3;i<Math.sqrt(n);i++){
			if (n%i==0){
				return false;
			}
		}
		return true;
	}

	public static boolean isFactor(long n,long gros){
		if(gros%n==0){
			return true;
		}else{
			return false;
		}
	}
	public static long[] answer2(long big){
		long[] primes=new long[15000];
		long i=big;int counter=0;
		while(counter<15000){
			if(isPrime(i)){
				primes[counter]=i;
				counter++;
			}
			i--;
		}
		return primes;
	}

	public static void answer(long big){
		long lastPrimeFactorCounted=0;
		for(long i=big;i>0;i=i-2){
			//System.out.println(i);
			if(isFactor(i,big)&&isPrime(i)){
				lastPrimeFactorCounted=i;
				System.out.println(lastPrimeFactorCounted);
				break;
			}
		}
		
	}
	
	public static void answer3(long big){
		long lastPrimeFactorCounted=0;
		for(long i=3;i<big;i +=2){
			if(isFactor(i,big)&&isPrime(i)){
				if(isPrime(i)){
					lastPrimeFactorCounted=i;
					System.out.println(lastPrimeFactorCounted);
				}
			}
		}
		
	}
}
