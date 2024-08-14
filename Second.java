
import java.util.*;;
public class Second {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
         System.out.println(l);
    
    Iterator it =  l.iterator();
         while (it.hasNext()) {
    
             System.out.println(it.next());
             
         }
    }
}
