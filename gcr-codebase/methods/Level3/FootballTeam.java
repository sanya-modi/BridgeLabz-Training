public class FootballTeam{

    // Method to generate random heights
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
        // Random 3-digit height between 150 and 250
        heights[i] = (int) (Math.random() * 101) + 150;
        }
        return heights;
    }

    // Method to find sum of heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
        sum += h;
        }
        return sum;
    }

    // Method to find mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find shortest height
    public static int findShortest(int[] heights){
        int min = heights[0];
        for (int h : heights){
        if (h < min){
        min = h;
        }
        }
        return min;
    }

    // Method to find tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
        if (h > max) {
        max = h;
        }
        }
        return max;
    }

    public static void main(String[] args) {
        // Football team of 11 players
        int[] heights = generateHeights(11);

        //Display result
        System.out.println("Heights of players (in cm):");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println("\nShortest Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Height: " + findTallest(heights) + " cm");
        System.out.println("Mean Height: " + findMean(heights) + " cm");
    }
}
