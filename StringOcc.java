import java.util.*;

public class StringOcc {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter String any string ==");
       String str = sc.nextLine();

       char [] arr = str.toCharArray();
       str.replace(" ", "");
      
       Map<Character,Integer> map = new TreeMap<>();

       int count =0;
       for(int i =0;i<str.length();i++){
        count=0;
        for(int j =0;j<str.length();j++){
            if(arr[i]==arr[j]){
                count++;
            }
        }
          map.put(arr[i], count); 
       }
            System.out.print(map);
    }
}
