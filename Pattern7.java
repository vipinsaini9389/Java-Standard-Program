class Pattern7{
	public static void main(String [] args){
		for (int i=10;i>=1;i--){
			for (int j=i;j<=9;j++){
				System.out.print(j);				
			}	
            System.out.print(0);			
			for (int k=9;k>=i;k--){
				System.out.print(k);
			}		
			System.out.println();
		}
	}
}