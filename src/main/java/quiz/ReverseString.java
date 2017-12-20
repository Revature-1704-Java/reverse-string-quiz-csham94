package quiz;

public class ReverseString {
    public String reverse(String input) {
        char[] letters = new char[input.length()];
        String reverse = "";
        for (int x = 0; x < input.length(); x++) {
            letters[x] = input.charAt(x);
        }

        for (int i = input.length() - 1; i >= 0; i--) {
            reverse += letters[i];
        }

        return reverse;
    }
}