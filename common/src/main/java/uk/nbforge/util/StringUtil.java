package uk.nbforge.util;

public class StringUtil {
    public static String titleCase(String input) {
        String[] words = input.split("_");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // capitalize first letter, and then concatenate everything after
            String capitalized = word.substring(0, 1).toUpperCase()
                     + word.substring(1);

            result.append(capitalized).append(" ");
        }

        return result.toString().trim();
    }
}
