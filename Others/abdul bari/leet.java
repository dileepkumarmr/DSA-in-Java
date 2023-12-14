import java.util.Hashtable;

public class leet {
    public int[] twoSum(int[] nums, int target) {
          Hashtable<Integer, Integer> hashTable = new Hashtable<Integer, Integer>();
          int i = 0;
          while ((i < nums.length) && (hashTable.get(nums[i]) == null)) {      
            hashTable.put(target - nums[i], i);
            i++;
          }
          if (i < nums.length) {
            return new int[]{hashTable.get(nums[i]),i};
          } 
          return null;       
        }
}
