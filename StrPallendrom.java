public class StrPallendrom {
    public static void main(String[] args) {
        String str = "madam";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
             rev = rev + str.charAt(i);
        }
        System.out.println(rev);
        if(str.equals(rev))
        {
            System.out.println("pallendrom");
        }
        else
        {
            System.out.println("Not a Pallendrom");
        }
    }
}
