
public class Euler9 {

	public static void main(String args[]){
		int a=1;
		int b=1;
		int c=1;
		//System.out.println(isPythagorician(4, 3, 5));
		for(a=1;a+b+c<1001;a++){
			for(b=1;a+b+c<1001;b++){
				for(c=1;a+b+c<1001;c++){
					if(c==900){
						System.out.println(c);
					}
					if (isPythagorician(a, b, c)&& (a+b+c==1000)){
						System.out.println("Triplet:"+a+", "+b+", "+c);
						System.out.println("produit"+a*b*c);
						break;
					}
				}
				c=1;
			}
			b=1;
		}
	}
	public static boolean isPythagorician(int a, int b, int c){
		if(a*a+b*b==c*c){
			return true;
		}else{
		return false;
		}
	}
}
