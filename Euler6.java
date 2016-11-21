
public class Euler6 {

	public static void main(String args[]){
		int number=100;
		long diff=squareOfSums(number)-sumOfSquares(number);
		System.out.println(diff);
		System.out.println(squareOfSums(number));
		System.out.println(sumOfSquares(number));
	}
	public static long sumOfSquares(int input){
		long sumSqr=0;
		for(int i=0;i<=input;i++){
			sumSqr=sumSqr+i*i;
		}
		return sumSqr;
	}
	public static long squareOfSums(int input){
		long sum=0;
		for(int i=0;i<=input;i++){
			sum=sum+i;
		}
		long sqrSum=sum*sum;
		return sqrSum;
	}
}
