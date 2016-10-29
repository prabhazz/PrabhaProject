package work;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static String nadi1="nadi";

	public static void main(String[] args) {
		
//			String tofind="testABC1";
//			String wheretofind="pswABC2";
//			int length=tofind.length();
//			int length1=wheretofind.length();
//			for(int i=0;i<length-2;i++){
//			tofind.substring(i, i+2);
//			System.out.println("text to be found at this iteration"+tofind.substring(i, i+2));
//
//			if(wheretofind.contains(tofind.substring(i, i+2))){
//			System.out.println("search string found at "+i+" th iteration");
//			}else{
//			System.out.println("search string not found at "+i+" th iteration");
//			}
		Pattern pattern = Pattern.compile("cts:src-dst-rbacl=.(/d/d/d/d)");
		Matcher matcher = pattern.matcher("cts:src-dst-rbacl=0009-06-00-0000-78-00-ICMP100-1"); 
		while (matcher.find())
		{
		    System.out.println(matcher.group().toString());
		}

			
			
			
		
		
	
	}

	
	
	
	
	
}
