//Problem: https://www.hackerrank.com/challenges/apple-and-orange/problem
//Solution:
public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
    /* Initialize variables for the distances of the apples and oranges from the tree and the
       counts of apples and oranges falling on the house (desired range) */
    int distanceApple = a;
    int distanceOrange = b;
    int countApple = 0;
    int countOrange = 0;
    // Iterate through each apple in the list
    for(int i=0;i<apples.size();i++){
        // Calculate the distance the apple falls from the tree
        distanceApple = distanceApple + apples.get(i);
        // If the apple falls on the house, increment the count of apples
        if(distanceApple>=s && distanceApple<=t){countApple++;}
        // Set the new distance in the list and reset the distance to the tree
        apples.set(i, distanceApple);
        distanceApple = a;    
    }
    // Iterate through each orange in the list
    for(int i=0;i<oranges.size();i++){
        // Calculate the distance the orange falls from the tree
        distanceOrange = distanceOrange + oranges.get(i);
        // If the orange falls on the house, increment the count of oranges
        if(distanceOrange>=s && distanceOrange<=t){countOrange++;}
        // Set the new distance in the list and reset the distance to the tree
        oranges.set(i, distanceOrange);
        distanceOrange = b;    
    }
    // Print the counts of apples and oranges that fell on the house
    System.out.println(countApple);
    System.out.println(countOrange);
}
//Complexity:
/* The time complexity is O(n), where n is the total number of apples and oranges. This is because
 the code iterates through each apple and orange in the list exactly once. The space complexity
 is O(1), because the code only uses a constant amount of extra space to store the variables for
 the distances of the apple and orange trees and the counts of apples and oranges. */
}