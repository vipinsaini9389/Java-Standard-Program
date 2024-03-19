 //Java Program to find the frequency of characters
class FrequencyOfCharacters{
    public static void main(String[] args){
        String str = "AMAN IS A GOOD BOY AND BOY AMAN IS IN CLASS XII";
        String[] words = str.split(" ");
        for(int i=0;i<words.length;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].equals(words[j]))
                    System.out.println(words[i]);
            }
        }
    }
}