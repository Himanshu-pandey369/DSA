public class RemoveOccurance {
    public String removeOccurrences(String s, String part) {
        while (s.contains(part)) {
            s = s.replaceFirst(part, "");
        }
        return s;
    }public static void main(String[] args) {
        RemoveOccurance obj = new RemoveOccurance();
        System.out.println(obj.removeOccurrences("daabcbaabcbc", "abc"));
    }
}
