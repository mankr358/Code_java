import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseArraylist {

    static void reverseList(ArrayList<Integer> list) {
        int i = 0;
        int j = list.size() - 1;
        while (i < j) {
          Integer temp = Integer.valueOf(list.get(i)); // int temp = a;
          list.set(i, list.get(j));// a= b;
            list.set(j, temp);

            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);
        System.out.println("original List" + list);
        Collections.reverse(list);
        //reverseList(list);
        System.out.println("Reverse List" + list);
        Collections.sort(list);
        System.out.println("Asending order" + list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Desending order" + list);

        ArrayList<String> l1= new ArrayList<>();
        l1.add("welcome");
        l1.add("to");
        l1.add("manish");
        l1.add("laptop");
        System.out.println("og" + l1);
//        Collections.sort(l1);
        Collections.sort(l1, Collections.reverseOrder());

        System.out.println("Sorted" + l1);
    }
    }

