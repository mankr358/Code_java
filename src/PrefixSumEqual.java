import java.util.Scanner;

public class PrefixSumEqual {
    static int findArraySum(int arr[]) {
        int totalsum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalsum += arr[i];
        }
        return totalsum;
    }

    static boolean equalSumPartition(int arr[]) {
        int totalsum = findArraySum(arr);
        int prefSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefSum += arr[i];
            int suffixSum = totalsum - prefSum;
            if (suffixSum == prefSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];

        System.out.println("Enter " + n + " elements");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Equal Partition possible:" + equalSumPartition(arr));
    }
}
