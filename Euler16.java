import java.math.BigInteger;


public class Euler16 {

	
	public static void main(String[] args){
		for(int i=0;i<1001;i++){
			BigInteger pow =new BigInteger("1");
			for(int j=0;j<i;j++){
				pow=pow.multiply(new BigInteger("2"));
			}
			System.out.println("2^"+i+ " is: " + pow);
			long sum=0;
			for(int j=0;j<String.valueOf(pow).length();j++){
				sum+=String.valueOf(pow).charAt(j)-48;
			//	System.out.println(String.valueOf(pow).charAt(j)-48);
			}
			System.out.println("sum of digit is: "+ sum);
			System.out.println("");
		}
	}
}
