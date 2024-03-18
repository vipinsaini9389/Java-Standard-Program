// Java Program to replace the spaces of a string with a specific character

class demo{
	public static void main(String []args){
		String str = "Ram Is A Good Boy";
		StringBuffer sb=new StringBuffer(str);
		for (int i=0;i<sb.length();i++)
			if(sb.charAt(i)==' ')
				sb.setCharAt(i,'$');
		str = sb.toString();
		System.out.println("String" +str);
	}
}