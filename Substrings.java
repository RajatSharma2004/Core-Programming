//Write a program to create a substring from a String using the charAt() method. Also, use the String built-in method substring() to find the substring of the text. Finally Compare the the two strings and display the results.
import java.util.Scanner;


class Substrings{
	public static void main(String[] args){
	System.out.println("Enter the String and the start end index for the substring");
	
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	int start = sc.nextInt();
	int end = sc.nextInt();
	String res1 = Substrings.subString(str,start,end);
	String res2 = str.substring(start-1,end);
	System.out.println(check(res1,res2));
	System.out.println("The sub string is "+res1);
	System.out.println("The sub string from inbuilt method "+res2);
	}
	
	public static String subString(String str,int start,int end){
	String res1="";
		for(int i=start-1;i<end;i++){
			res1 = res1+str.charAt(i);
	}
		return res1;
	
	}
	
	public static boolean check(String res1,String res2){
		if(res1.equals(res2)) return true;
		else return false;
	
	}
}