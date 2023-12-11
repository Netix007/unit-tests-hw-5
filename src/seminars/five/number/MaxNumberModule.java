package seminars.five.number;

import java.util.ArrayList;
import java.util.List;

public class MaxNumberModule {

    public int getMaxNum(ArrayList<Integer> array) {
        int maxValue = array.get(0);
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) > maxValue) {
                maxValue = array.get(i);
            }
        }
        return maxValue;
    }
}
