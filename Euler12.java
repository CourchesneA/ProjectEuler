
public class Euler12 {
	public static void main(String[] args){
		//System.out.println(numFactor(28));
		/*long temp=0;
		for (long i=1;true;i++){
			temp=temp+i;
			System.out.println(temp+", "+numFactor(temp));
			if(numFactor(temp)>500){
				System.out.println(temp+", "+i+", "+numFactor(temp));
				break;
			}
		}*/
		System.out.println(391986000);
		for(int i=391986000;true;i-=100){
			//System.out.println(i+", "+ numFactor(i));
			if(isTriangle(i) && numFactor(i)>500){
				System.out.println(i);
				
			}
		}
		

	}
		public static long numFactor(long n){
			//return number of factor of n
			int numFac=0;
			for(int i=1;i<n;i++){
				if(n%i==0){
					numFac++;
				}
			}
			return numFac;
	}
		public static boolean isTriangle(int n){
			long temp=0;
			for(int i=1;temp<n;i++){
				temp=temp+i;
				if (temp==n){
					return true;
				}
			}
			return false;
		}

}
