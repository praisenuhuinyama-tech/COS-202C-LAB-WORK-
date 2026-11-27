//EDU/LIS/24/018
//NUHU PRAISE  INYAMA
//LIBRARY AND INFORMATION SCIENCE
//LAB 9
// Task 9.4: Palindromes. Write isPalindrome that ignores case, spaces and punctuation. 
// Test it with "A man, a plan, a canal: Panama".

public class Palindromes {
    public static boolean isPalindrome(String text) {
        // Remove all non-alphanumeric characters and convert to lowercase
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int left = 0;
        int right = cleaned.length() - 1;
        
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String testString = "A man, a plan, a canal: Panama";
        System.out.println("Text: \"" + testString + "\"");
        System.out.println("Is palindrome? " + isPalindrome(testString));
    }
}
