//Problem: https://www.hackerrank.com/challenges/kangaroo/problem
//Solution:
public static String kangaroo(int x1, int v1, int x2, int v2) {
    // If both kangaroos have the same starting position and rate of hopping, they will always meet
    if (x1 == x2 && v1 == v2) {
        return "YES";
    }
    // If one kangaroo starts behind the other and has a slower rate of hopping, they will never meet
    if (x1 < x2 && v1 <= v2 || x2 < x1 && v2 <= v1) {
        return "NO";
    }
    // Simulate the hops of the kangaroos until they meet or one of them passes the other
    while (x1 != x2) {
        x1 += v1;
        x2 += v2;
        if (x1 == x2) {
            return "YES";
        }
        // If one kangaroo has passed the other, they will never meet
        if (x1 < x2 && v1 <= v2 || x2 < x1 && v2 <= v1) {
            return "NO";
        }
    }
    return "YES";
}
//Complexity:
/* The time complexity of this solution is O(N), where N is the maximum number of hops required for
 the kangaroos to meet or for one of them to pass the other. In the worst case, the kangaroos will
 never meet, so the loop will run N times, where N is the maximum value of (x2 - x1) / (v1 - v2) or
 (x1 - x2) / (v2 - v1), depending on which kangaroo starts ahead.
 The space complexity of this solution is O(1), as it only uses a constant amount of extra space to
 store the variables used in the loop. */