//import java.nio.channels.AsynchronousSocketChannel;
//import java.util.Scanner;
//
//
//public class Sortarray {
//    static void printArray(int[] arr) {
//        int n = arr.length;
//        for (int i = 0; i < n; i++) {
//            System.out.println(arr[i] + " ");
//        }
//        System.out.println();
//    }
//
//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
//
////    static void sortArrayByParity(int[] arr) {
////        int n = arr.length;
////        int left = 0, right = n - 1;
////        while (left < right) {
////            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
////                swap(arr, left, right);
////                left++;
////                right--;
////            }
////            if (arr[left] % 2 == 0) {
////                left++;
////            }
////            if (arr[right] % 2 == 1) {
////                right--;
////            }
////        }
////    }
//
//    // using two pointer method
//   /* static  void sortzerosandones(int[] arr){
//        int n = arr.length;
//        int left = 0, right = n-1;
//        while(left < right){
//            if (arr[left] == 1 && arr[right] == 0){
//                swap(arr, left, right);
//                left++;
//                right--;
//            }
//            if (arr[left] == 0){
//                left++;
//            }
//            if (arr[right] == 1){
//                right--;
//            }
//        }
//    }
//    /*
//    */
//// this will starts with normal method
////    static void sortzerosandones(int[] arr) {
////        int n = arr.length;
////        int zeroes = 0;
////        //count number of zeroes
////        for (int i = 0; i < n; i ++) {
////            if (arr[i] == 0) {
////                zeroes++;
////            }
////
////        }
////        for (int i = 0; i < n; i++) {
////            if (i < zeroes) {
////                arr[i] = 0;
////            } else {
////                arr[i] = 1;
////            }
////        }
////    }
//    static void reverse(int[] arr) {
//        int i = 0, j = arr.length;
//        while (i < j) {
//            swap(arr, i, j);
//            i++;
//            j--;
//        }
//    }
//
//    static int[] sortSquares(int[] arr) {
//        int n = arr.length;
//        int left = 0, right = n - 1;
//        int[] ans = new int[n];
//        int k = 0;
//        while (left <= right) {
//            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
//                ans[k++] = arr[left] * arr[left];// ans[k] and niche write k++; k++ is postincreameant order
//                left++;
//            } else {
//                ans[k++] = arr[right] * arr[right];
//                right--;
//            }
//        }
//        return ans;
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter array size");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//
//        System.out.println("Enter " + n + "elements");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println("Original array");
//        printArray(arr);
//        int[] ans = sortSquares(arr);
//        // sortArrayByParity(arr);
//        //  sortzerosandones(arr);
//        System.out.print("Sorted array : ");
//        reverse(ans);
//        printArray(ans);
//    }
//}
import java.nio.channels.AsynchronousSocketChannel;
import java.util.Scanner;

public class Sortarray {
    static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr) {
        int i = 0, j = arr.length;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] sortSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Original array");
        printArray(arr);
        int[] ans = sortSquares(arr);
        System.out.print("Sorted array : ");
        reverse(ans);
        printArray(ans);
    }
}