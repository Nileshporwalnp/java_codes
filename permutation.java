
import java.util.*;

public class permutation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arrSize = sc.nextInt();
        int[] array = new int[arrSize];
        for(int i =0;i<arrSize;i++){
            array[i]=  sc.nextInt();
        }
        List<List<Integer>> ans = new  ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[arrSize];
        recursion(array, ds, ans, freq);

        for(List<Integer> item:ans){
            System.out.println(item);
        }
    }
    private static void recursion(
        int[] nums,List<Integer> ds,List<List<Integer>> ans, boolean []freq
    ){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i = 0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(nums[i]);
                recursion(nums, ds, ans, freq);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }
    
}