public class main {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 5};
        int target = 9;
        boolean found = false;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                System.out.println("Broj je pronadjen na indexu: " + i);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Broj nije pronadjen!");
        }
    }
}
