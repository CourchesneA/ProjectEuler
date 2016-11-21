import java.util.Arrays;
/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
*
*Find the sum of all the multiples of 3 or 5 below 1000.
*/


public class Euler1 {
	public static void main(String[] args){
		prob1(1000);
	}
	public static void prob1(int n){
		int[] multiples=new int[n/5+n/3];
		int index=0;
		for(int i=3;i<n;i=i+3){
			if(i%5==0){		//don't count these twice !
				continue;
			}
			multiples[index]=i;
			index++;
		}
		for(int i=5;i<n;i=i+5){
			
			multiples[index]=i;
			index++;
		}
		int sum=0;
		
		for (int i=0;i<(n/5+n/3);i++){
			sum=sum+multiples[i];
		}
		System.out.println(Arrays.toString(multiples));
		System.out.println(sum);
	}

	
	public static void prob3(int n){
		int[] factor=new int[n];//int[] primeFactor=new int[n/4];
		int counter=0;
		int k=0;
		for(int i=0;i<n;i++){	//find all factors > factor[]
			if(n%i==0){
				factor[counter]=i;
				counter++;
			}
		}
		for(int j=0;j<n;j++){	//go through all factors
			k=factor[counter];
			if(k==0){break;}
			for(int ii=3;ii<Math.sqrt(k);ii++){
				if(k%ii==0){
					break;
				}
			}
			
		}
	}
}
