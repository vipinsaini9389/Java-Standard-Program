 //Java Program to find the largest and smallest word in a string

class LargestAndSmallest{
    public static void main(String[] args){
        String str = "AMAN IS A GOOD BOY AND BOY AMAN IS IN CLASS XII";
        String[] words = str.split(" ");
        String max="";
        String min=str;
        for(int i=0;i<words.length;i++){
            if(max.length()<words[i].length())
                max = words[i];
            if(min.length()>words[i].length())
                min = words[i];
        }
        System.out.println("Maximum Length : "+max);
        System.out.println("Minimum Length : "+min);
    }
}