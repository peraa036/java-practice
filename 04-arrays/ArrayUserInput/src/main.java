import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for(int i = 0; i < nums.length; i++){
            System.out.println("Unesi broj " + (i + 1) + ": ");
            nums[i] = sc.nextInt();
        }
        for(int n : nums){
            System.out.print(n + " ");
        }
    }
}
