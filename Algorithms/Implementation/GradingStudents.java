// Problem: https://www.hackerrank.com/challenges/grading/problem
//Solution:
public class GradingSrudents{
    //Solution:
     public static List<Integer> gradingStudents(List<Integer> grades) {
    // Iterate through each grade in the list
    for(int i=0; i<grades.size();i++){
        // Check if the grade is less than 38, if so, continue to the next iteration
        if(grades.get(i)<38){continue;}
        // Check if the grade is within 2 points of the next multiple of 5, if so, continue to the next iteration
        else if(grades.get(i)%5==0 || grades.get(i)%5==1|| grades.get(i)%5==2){continue;}
       /* If the grade is not less than 38 and is not within 2 points of the next multiple of 5,
        calculate the difference between the grade and the next multiple of 5 and round the grade
        up to the next multiple of 5 by adding the difference to the grade and setting the new
        value in the list. */
        else if(grades.get(i)%5==3||grades.get(i)%5==4){
            grades.set(i, grades.get(i)+(5-(grades.get(i)%5)));
        }
    }
    // Return the list of rounded grades
    return grades;
}
//Complexity:
/* The time complexity of your algorithm is O(n), where n is the number of grades in the list. This is
because the code iterates through each grade in the list exactly once. The space complexity of your
algorithm is also O(n), because the code creates a new list of the same size as the input list to
store the rounded grades. */
}