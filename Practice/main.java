class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        StringBuilder result = new StringBuilder();
        
        // Count the frequency of each character in the input string
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Process each character in ascending order
        for (char c : s.toCharArray()) {
            count[c - 'a']--; // Decrement the frequency of the current character
            
            // Skip if the character has already been visited
            if (visited[c - 'a']) {
                continue;
            }
            
            // Remove smaller characters from the result if they occur later
            while (result.length() > 0 && result.charAt(result.length() - 1) < c && count[result.charAt(result.length() - 1) - 'a'] > 0) {
                visited[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }
            
            // Append the current character to the result and mark it as visited
            result.append(c);
            visited[c - 'a'] = true;
        }
        
        return result.toString();
    }
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String inputString = scanner.nextLine();

        String result = removeDuplicateLetters(inputString);

        System.out.println( result);

        scanner.close();
    }

    public static String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] visited = new boolean[26];
        StringBuilder result = new StringBuilder();

        // Count the frequency of each character in the input string
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        // Process each character in ascending order
        for (char c : s.toCharArray()) {
            count[c - 'a']--; // Decrement the frequency of the current character

            // Skip if the character has already been visited
            if (visited[c - 'a']) {
                continue;
            }

            // Remove smaller characters from the result if they occur later
            while (result.length() > 0 && result.charAt(result.length() - 1) < c && count[result.charAt(result.length() - 1) - 'a'] > 0) {
                visited[result.charAt(result.length() - 1) - 'a'] = false;
                result.deleteCharAt(result.length() - 1);
            }

            // Append the current character to the result and mark it as visited
            result.append(c);
            visited[c - 'a'] = true;
        }

        return result.toString();
    }
}

