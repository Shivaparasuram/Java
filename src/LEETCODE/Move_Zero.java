package LEETCODE;

public class Move_Zero {

    public static void zero(int[] nums) {
        int index =0;
        for(int i =0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[index] =nums[i];
                index++;
            }

        }

        for(int i =index; i<nums.length;i++){
            nums[i]=0;
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12};

        zero(nums);

        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}



