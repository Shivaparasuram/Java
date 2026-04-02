package LEETCODE;

public class Majority_Element {
    public static int majorityElement(int[] num) {

        int majority = num[0];
        int vote = 1;

        for (int i = 1; i < num.length; i++) {
            if (vote == 0) {
                majority = num[i];
            }
            else if (majority == num[i]) { //++
                vote++;
            }
            else {
                vote--;
            }
        }
        return majority;
    }

    public static void main(String[] args)
    {
        int[] num = {2, 2, 1, 1, 1, 1, 2};
        System.out.println("Majority Element: " + majorityElement(num));
    }
}