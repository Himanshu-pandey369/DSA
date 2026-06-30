public class ReverseStr {
    void Reverse(char[] str) {
        int i = 0;
        int j = str.length - 1;
        while (i < j) {
            char temp = str[i];
            str[i] = str[j];
            str[j] = temp;
            i++;
            j--;
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        char[] str = "abcde".toCharArray();
        ReverseStr obj = new ReverseStr();
        obj.Reverse(str);
    }
}
