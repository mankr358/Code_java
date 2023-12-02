import java.util.Scanner;

public class Rotating {
        static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.println(num + " ");
        }
        System.out.println();
    }
//    static void printArray(int[] arr) {
//
//    }
//
//    static void swap(int[] arr, int i, int j) {
//
//    }
//
//    static void reverse(int[] arr) {


//    }
//
//    static void rotateInPlace(int[] arr, int k) {
//        int n = arr.length;
//    }

    static int[] rotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter" + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k = sc.nextInt();

        System.out.println("Original array");
        printArray(arr);
        int[] ans = rotate(arr, k);
        System.out.println("Array after rotation");
        printArray(ans);
    }
}
