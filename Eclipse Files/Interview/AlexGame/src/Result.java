import java.util.ArrayList;
import java.util.List;

public class Result {

	public static int maximumPoints(int k, List<Integer> costs) {
        int n = costs.size();
        int totalCost = 0;
        int minCost = Integer.MAX_VALUE;

        for (int cost : costs) {
            totalCost += cost;
            minCost = Math.min(minCost, cost);
        }

        int maxPoints = Math.min(n, k / minCost);
        int maxPointsWithSkip = maxPoints;

        for (int i = 0; i < n; i++) {
            if (k >= totalCost - costs.get(i)) {
                maxPointsWithSkip = Math.max(maxPointsWithSkip, i);
            }
        }

        return maxPointsWithSkip;
    }
	
	public static void main(String[] args) {
        // Example usage
        int k = 14;
        List<Integer> costs = new ArrayList<>();
        costs.add(5);
        costs.add(2);
        costs.add(3);
        costs.add(1);
        costs.add(4);

        int maxPoints = Result.maximumPoints(k, costs);
        System.out.println(maxPoints); // Output: 4
    }
	
	
}
