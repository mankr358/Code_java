
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Integer in = Integer.valueOf(4);
        ArrayList<Integer>l1= new ArrayList<>();
        l1.add(5);//5
        l1.add(6);//56
        l1.add(7);//567
        l1.add(8);//5678
        System.out.println(l1.get(1));//6

        for (int i = 0;i < l1.size(); i++){
            System.out.println(l1.get(i));//5678
        }
        //print the array list directly
        System.out.println(l1);//[5678]

        //adding elements at index i//[5 100 6 7 8]
        l1.add(1,100);
        System.out.println(l1);

        //changing the number of particular index
        l1.set(1,10);
        System.out.println(l1);//5 10 6 7 8

        //removing the element at index i
        l1.remove(2);
        System.out.println(l1);//5 10 7 8

        //removing the element e
       // System.out.println(l1.remove(Integer.valueOf(7)));
        l1.remove(Integer.valueOf(7));
        System.out.println(l1);//5 10 8

        ///checking the element exits
        boolean ans = l1.contains(Integer.valueOf(8));
        System.out.println(ans);

        //if you dont specify class, you can put anything inside l
        ArrayList l = new ArrayList();
        l.add("Manish");
        l.add(5);
        l.add(true);
        System.out.println(l);
    }
}