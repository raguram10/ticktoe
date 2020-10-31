import java.util.*;

public class threesum {
  static  HashSet<List<Integer>> result=new HashSet<>();
    static void seq(ArrayList<Integer> fg,int start,int[] nums,int target)
    {
        for(int i=0;i<nums.length-1;i++)
        {
            int l=i+1,r=nums.length-1;
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0)
                {
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    l++;
                    r--;
                }
                else if(sum<0)
                    l++;
                else
                    r--;
            }
        }
    }
    public static List<List<Integer>> main(int[] nums) {
        Arrays.sort(nums);
        seq(new ArrayList<Integer>(),0,nums,0);
        return new ArrayList<>(result);
    }
}
