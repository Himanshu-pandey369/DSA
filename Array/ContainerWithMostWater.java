public class ContainerWithMostWater {
    int MostWater(int[] heights) {
        int lp = 0, rp = heights.length - 1, MaxWater = 0;
        while (lp < rp) {
            int width = rp - lp;
            int height = Math.min(heights[lp], heights[rp]);
            int currentWater = width * height;
            MaxWater = Math.max(MaxWater, currentWater);
            if (heights[lp] < heights[rp]) {
                lp++;
            } else {
                rp--;
            }
        }
        return MaxWater;
    }

    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int[] nums = { 7, 1, 3, 5, 6, 4 };
        int result = obj.MostWater(nums);
        System.out.println("Maximum Water stored: " + result);
    }
}
