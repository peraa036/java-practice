//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] niz = {1,7,9,6,8,4,5};
        int max = niz[0];
        for(int x : niz){
            if(x > max){
                max = x;
            }
        }
        System.out.println(max);
    }
}