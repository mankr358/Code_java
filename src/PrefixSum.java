//import java.util.Scanner;
//
//public class PrefixSum {
//    static void printArray(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//           System.out.print(arr[i] + " ");
//        }
//       System.out.println();
//    }
//    static int[] makePrefixSumArray(int[] arr) {
//        int n = arr.length;
////        int[] pref = new int[n]; this code make new arr so
//       // pref[0] = arr[0]; we chose to add up in same arr file
//
//        for (int i = 1; i < n; i++) {
//            //pref[i] = pref[i-1] + arr[i];
//            arr[i] = arr[i - 1] + arr[i];
//        }
//        //return pref;
//        return arr;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//
//        System.out.println("Enter " + n + " elements");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//       // System.out.println("Input array:");
//        //printArray(arr);
//
//        int[] pref = makePrefixSumArray(arr);
//        System.out.println("Prefix sum array:");
//        printArray(arr);
//    }
//}
import java.util.Scanner;
public class PrefixSum {

    static int solution(int[] num, int target){
        int ans = 0;
        for(int i = 0;i < num.length;i++){
            for (int j = i + 1; j < num.length; j++) {
                if(num [i] + num [j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size the of array");
        int n = sc.nextInt();
        int[] num = new int[n];

        System.out.println("Enter " + n + "elements");
        for(int i = 0;i < num.length;i++){
            num[i] = sc.nextInt();
        }

        System.out.println("enter the target");
        int target = sc.nextInt();

        System.out.println(solution(num, target));
    }
}