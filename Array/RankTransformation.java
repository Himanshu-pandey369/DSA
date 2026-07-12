import java.util.*;

class RankTransformation {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;

        // Assign ranks to unique elements
        for (int num : sorted) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Replace each element with its rank
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        RankTransformation obj = new RankTransformation();
        int[] nums = {32,5,65,21,12};
        System.out.println(Arrays.toString(obj.arrayRankTransform(nums)));
    }
}