//Write a program to return all the characters in a string using the user-defined method,  compare the result with the String built-in toCharArray() method, and display the result
import java.util.Arrays;
import java.util.Scanner;
class StringToCharacters{
	public static void main(String[] args){
	
	Scanner sc = new Scanner(System.in);
	String str = sc.next();
	char[] res1 = strToChar(str);
	char[] res2 = str.toCharArray();
	System.out.println(check(res1,res2));
	for(int i =0;i< str.length();i++){
		System.out.println(res1[i]);
		System.out.println(res2[i]);
	}
	
	
	}
	public static char[] strToChar(String str){
		char[] res1 = new char[str.length()];
		for(int i =0;i<str.length();i++){
			res1[i] = str.charAt(i);
		}
		return res1;
	}
	public static boolean check(char[] res1,char[] res2){
		if(Arrays.equals(res1,res2)) return true;
		else return false;
	
	}
}