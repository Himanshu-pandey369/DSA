public class StringCompression {

    public static int compress(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char current = chars[read];
            int count = 0;

            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }

            chars[write++] = current;

            if (count > 1) {
                String cnt = String.valueOf(count);
                for (char c : cnt.toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

    public static void main(String[] args) {
        char[] chars = {'a','a','a','b','b','c','c','c'};

        int len = compress(chars);

        for (int i = 0; i < len; i++) {
            System.out.print(chars[i] + " ");
        }
    }
}