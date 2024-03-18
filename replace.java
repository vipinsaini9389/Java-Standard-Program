class replace{
	public static void main(String [] args){
		String str = "Ram Is A Good Boy";
		String temp = " ";
		System.out.println("String"+str);
		for(int i=0;i<str.length();i++){
			if((str.charAt(i)>=65)&&(str.charAt(i)<=90))
				temp=temp+((char)(str.charAt(i)+32));
			else
				if((str.charAt(i)>=97)&&(str.charAt(i)<=122))
				temp=temp+((char)(str.charAt(i)-32));
			else
				temp=temp+str.charAt(i);
		}
		System.out.println("String"+temp);
	}
}