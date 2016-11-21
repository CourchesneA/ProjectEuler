import java.util.Objects;
/*
A palindromic number reads the same both ways. The largest palindrome made
from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Euler4 {
	public static void main(String args[]){
		int prod1=0;
		for(int i=999;i>0;i--){
			for(int j=999;j>0;j--){
				if(isPalindrome(i*j)&& i*j>prod1){
					prod1=(i*j);
				}
			}
		}
		System.out.println(prod1);
		
	}
	public static boolean isPalindrome(int input){
		String strInp=Integer.toString(input);
		String partOne="";
		String invParTwo="";
		int j=0;
		for(int i=0;i<Math.ceil(((double)strInp.length())/2);i++){
			j=(strInp.length()-1)-i;
			partOne=partOne+strInp.charAt(i);
			invParTwo=invParTwo+strInp.charAt(j);
		}
		if(Objects.equals(partOne,invParTwo)){
			return true;
		}else{
			return false;
		}
	}
	
	
}
