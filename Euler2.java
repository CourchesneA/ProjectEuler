
public class Euler2 {

	public static void main(String args[]){
		prob2(4000000);
	}
	public static void prob2(int n){
		long a=1;long b=2;long c=0;int i=0;long[] pair=new long[100];pair[0]=2;
		while (c<n){	//while the last term is less than n
			c=a+b;
			if(c%2==0){
				pair[i+1]=c;
			}
			a=b;
			b=c;
			i++;
		}
		System.out.println(somme(pair));
	}
	public static long somme(long[] matrice){
		long somme=0;
		for(int i=0;i<matrice.length;i++){
			somme=matrice[i]+somme;
		}
		return somme;
	}
}
