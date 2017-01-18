import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.Arrays;
public class Euler22 {

	public static void main(String[] args){
		String[] names = getInput();
		Arrays.sort(names);
		int acc = 0;
		for(int i = 0; i< names.length; i++){
			acc+=countValue(names[i])*(i+1);
//			System.out.println(i+": "+names[i]);
//			if(names[i].equals("COLIN")){
//				System.exit(0);
//				System.out.println(i);
//			}
		}
		
		System.out.println(acc);
		
	}
	
	public static String[] getInput(){
		File input = new File("C:/Users/Anthony/Documents/names.txt");
		String content="";
		try {
			BufferedReader br = new BufferedReader(new FileReader(input));
			content = br.readLine();
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
		} catch (IOException e){
			e.printStackTrace();
		}
		content = content.replaceAll("\"", "");
		String[] names = content.split(",");
		return names;
	}
	
	public static int countValue(String name){
		int acc = 0;
		for(int i=0; i < name.length(); i++){
			acc+= ((int) name.charAt(i)) - 64;
		}
		return acc;
	}
	
}
