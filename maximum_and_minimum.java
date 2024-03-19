// Java Program to find maximum and minimum occurring character in a string

class maximum_and_minimum{
    public static void main(String[] args){
        String str = "AKJBDJCJSLAFSAGDASJFFJGDFFD";
        char max=str.charAt(0);
        char min=str.charAt(0);
        int maxx=0;
        int minn=str.length();
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j))
                    count++;
            }
            if(maxx<count){
                max=str.charAt(i);
                maxx=count;
            }
            if(minn>count){
                min=str.charAt(i);
                minn=count;
            }
        }
        System.out.print("\nMaximum Character : "+max);
        System.out.print("\nMinimum Character : "+min);
    }
}