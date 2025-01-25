import java.util.Scanner;

public class CustomSelectionSort {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string");
        String input=sc.nextLine();
        String sorted = customSort(input);
        System.out.println(sorted); 
    }

    public static String customSort(String input) {
        StringBuilder uppercase = new StringBuilder();
        StringBuilder spaces = new StringBuilder();
        StringBuilder lowercase = new StringBuilder();

        // Separate characters into groups
        for (char c : input.toCharArray()) {
            if (Character.isUpperCase(c)) {
                uppercase.append(c);
            } else if (c == ' ') {
                spaces.append(c);
            } else if (Character.isLowerCase(c)) {
                lowercase.append(c);
            }
        }

        // Sort each group
        sortStringBuilder(uppercase);
        sortStringBuilder(lowercase);

        // Combine groups
        return uppercase.toString() + spaces.toString() + lowercase.toString();
    }

    // Helper method to sort characters in a StringBuilder
    private static void sortStringBuilder(StringBuilder sb) {
        for (int i = 0; i < sb.length() - 1; i++) {
            for (int j = i + 1; j < sb.length(); j++) {
                if (sb.charAt(i) > sb.charAt(j)) {
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                }
            }
        }
    }
}
