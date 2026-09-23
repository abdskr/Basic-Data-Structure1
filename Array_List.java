import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
       ArrayList<Integer> num=new ArrayList<>();
       num.add(10);
       num.add(20); 
       System.out.println(num);
       System.out.println(num.get(1));
       num.add(50);
       num.remove(10);
       System.out.println(num);
    }
    
}
