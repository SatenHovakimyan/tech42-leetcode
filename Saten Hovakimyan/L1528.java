public class L1528 {
    public String restoreString(String s, int[] indices) {
        char[] shuffledString = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            shuffledString[indices[i]] = s.charAt(i);
        }
        return String.valueOf(shuffledString);
    }
}
