class StringCompress {
    public static int compress(char[] chars) {
        int index = 0;
        int i = 0;

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // count the occurrences of currentChar
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // write the character
            chars[index++] = currentChar;

            // write the count if > 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    System.out.println(c);
                    chars[index++] = c;
                }
            }
        }

        return index; // new length
    }

    public static void main(String[] args) {
        char[] chars = { 'a', 'a', 'b', 'b' };
        System.out.println(compress(chars));
    }
}
