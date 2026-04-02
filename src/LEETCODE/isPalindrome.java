package LEETCODE;

public class isPalindrome {
    static void main(String[] args) {
        String s="Madam";

        System.out.println(isPalindrome( s));
    }
    static boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        int left = 0;
        int right = cleaned.length() - 1;

        while (left < right)
        {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false; // Not a palindrome if any mismatch occurs
            }
            left++;
            right--;
        }

        return true; // String is a palindrome
    }
}




















//        int n = nums.length;
//        int ans[] = new int[n];
//        int prodL = 1;
//        int prodR = 1;
//
//        for(int i = n-1; i > 0; i--){
//            ans[i] = prodR;
//            prodR = prodR * nums[i];
//        }
//        for(int i = 0; i < n; i++){
//            ans[i] = ans[i] * prodL;
//            prodL = prodL * nums[i];
//        }
//        return ans;
//    }
//}