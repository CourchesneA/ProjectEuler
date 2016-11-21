
public class Euler10 {
	public static void main(String args[]){
		long sum=0;
		for(int i=1;i<2000000;i++){
			if(isPrime(i)){
				sum=sum+i;
			}
		}
		System.out.println(sum);
		
		System.out.println(isPrime(2));
	}
	public static boolean isPrime(int n){
		if (n==2){
			return true;
		}
		if (n%2==0 || n==1){
			return false;
		}
		for(int i=3;i*i<=n;i +=2){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

}
