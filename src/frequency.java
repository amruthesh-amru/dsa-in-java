import java.util.HashMap;
import java.util.Map;
import java.util.*;
public class frequency {
    public static void main(String[] args) {
        frequency obj = new frequency();
        obj.countFreq();
    }

    public void countFreq() {
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr = {10, 10, 3, 2, 3, 2};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
//                map.put(arr[i], map.getKey(arr[i]));
            } else {
                map.put(arr[i], 1);
            }
//        for (int j = 0; j < map.size(); j++) {
//            if(map.containsKey(arr[j])) {
//                map.put(arr[j], count++);
//            }
//        }
        }
            System.out.println(map);


    }
}
