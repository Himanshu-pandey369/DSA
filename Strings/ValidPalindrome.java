public class ValidPalindrome {
    boolean alphanumeric(char ch) {
        if ((ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9')) {
            return true;
        }
        return false;
    }

    boolean Checkvalid(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {

            if (!alphanumeric(s.charAt(i))) {
                i++;
                continue;
            }

            if (!alphanumeric(s.charAt(j))) {
                j--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();
        System.out.println(obj.Checkvalid("A man, a plan, a canal: Panama"));
    }
}