public class main {
    public static void main(String[] args) {
        int[] numbers = new int[5]; //pravimo mesta
        //ili
        int[] nums = {1, 2, 3, 4, 5}; // popunjena mesta
        //PRISTUP ELEMENTIMA
        System.out.println(numbers[1]);
        System.out.println(nums[1]);
        //Prolaz kroz NIZ
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
