public class CustomSelectionSort2 {

    public static void main(String[] args) {
        String input = "ArfsDE TYhv  RET";
        String sorted = customSort(input);
        System.out.println(sorted); 
    }

    public static String customSort(String input) {
        char[] chars = input.toCharArray();
        int n = chars.length;

        // Custom selection sort logic
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (compare(chars[j], chars[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Swap the characters
            char temp = chars[i];
            chars[i] = chars[minIndex];
            chars[minIndex] = temp;
        }

        return new String(chars);
    }

    // Custom comparator: Capital letters < spaces < small letters
    public static int compare(char a, char b) {
        if (Character.isUpperCase(a) && !Character.isUpperCase(b)) {
            return -1;
        } else if (!Character.isUpperCase(a) && Character.isUpperCase(b)) {
            return 1;
        } else if (a == ' ' && b != ' ') {
            return -1;
        } else if (a != ' ' && b == ' ') {
            return 1;
        } else {
            return Character.compare(Character.toLowerCase(a), Character.toLowerCase(b));
        }
    }
}
