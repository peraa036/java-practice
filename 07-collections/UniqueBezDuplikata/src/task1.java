import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class task1 {
    public static List<Integer> uniqueKeepOrder(List<Integer>nums){
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for(Integer n : nums){
            if(seen.add(n)){
                result.add(n);
            }
        }
        return result;
    }
}
