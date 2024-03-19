import java.util.*;

class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Map<Integer, Integer> map = new HashMap<>();
        int pointer = 0;
        for(int i : students) map.put(i, map.getOrDefault(i,0) + 1);

        while(pointer < sandwiches.length){
            int val = sandwiches[pointer];
            if(map.containsKey(val) && map.get(val)!=0){
                map.put(val, map.getOrDefault(val,0) - 1);
                pointer++;
            }
            else break;
        }
        return sandwiches.length - pointer;
    }
}
