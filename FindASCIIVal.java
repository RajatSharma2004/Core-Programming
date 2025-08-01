class FindASCIIVal{
	
	public static void main(String[] args){
	String val = "Rajat";
	int[][]res = FindASCIIVal.values(val);
	FindASCIIVal.print(res,val);
	
	}
	
	public static int[][] values(String val){
	int res[][] = new int[val.length()][2];
	
	for(int i =0;i<val.length();i++){
	res[i][0]= val.charAt(i);
	res [i][1]= val.charAt(i);
	
	
	}
	return res;
	}
	
	public static void print(int[][] res,String val){
	System.out.println("Characters and their corrosponding values are as follows ");
	
	for(int i=0;i<val.length();i++){
	System.out.println((char)res[i][0]+" - "+ res[i][1]);
	}
	
	}

}