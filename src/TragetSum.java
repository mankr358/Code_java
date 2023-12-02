import java.util.Scanner;
public class TragetSum {

    static int solution(int[] num, int target){
        int ans = 0;
        for(int i = 0;i < num.length;i++){
            for (int j = i + 1; j < num.length; j++) {
                if(num [i] + num [j] == target){
                    System.out.println("[" + i + "," + j + "]") ;
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