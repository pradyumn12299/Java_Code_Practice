import java.util.HashMap;

public class Hashing1MajorityElement {
    public static void main(String[] args) {
        int nums[]={1,3,5,2,1,5,1,3,1};
        majorityElement(nums);
    }

    public static void majorityElement(int nums[]){
        HashMap<Integer, Integer> map=new HashMap<>();
        int n= nums.length;
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else {
                map.put(nums[i], 1);
            }
        }
        for (int key: map.keySet()) {
            if(map.get(key) > n/3){
                System.out.println(key);
            }
        }
    }
}
