class Pattern21{
	public static void main(String [] args){
		int m=5;
		int n=-1;
		for(int i=1;i<=10;i++){
			for(int k=1;k<=m;k++){
				System.out.print(k);
			}
			if(m==1)
				n=1;
			m=m+n;

			System.out.println();
		}
	}
}