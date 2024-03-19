//Another Way For CHeck Rotation
class Demo7{
    public static void main(String[] args){
        String str = "ABCD";
        String s = "DABC";
        str = str+str;
        if(str.indexOf(s)!=-1)
            System.out.print("Is A Rotation");
        else
            System.out.print("Is Not A Rotation");
    }
}