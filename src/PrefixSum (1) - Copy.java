import java.util.Scanner;

public class PrefixSum {
    static void printArray(int[] arr) {
        static int[] makePrefixSumArray ( int[] arr){
            int n = arr.length;
            int[] pref = new int[];
            pref[0] = arr[0];

            for (int i = 1; i < n; i++) {
                pref[i] = pref[i - 1] + arr[i];
            }
            return pref;
        }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter array size");
            int n = sc.nextInt();
            int[] arr = new int[n];

            System.out.println("Enter " + n + " elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("input  array");
            printArray(arr);
            int[] pref = makePrefixSumArray(arr);
            printArray(pref);

        }
    }