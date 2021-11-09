package numbers;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumbers {

    public boolean isPerfectNumber(int number){
        List<Integer> divider = new ArrayList<>();
        for (int i=1; i<number; i++){
            if (number%i==0){
                divider.add(i);
            }
        }

        int sum = 0;
        for (int element: divider){
            sum = sum + element;
        }

        if ((sum!=0) && (sum==number)) {
            return true;
        }
        return false;
    }
}
