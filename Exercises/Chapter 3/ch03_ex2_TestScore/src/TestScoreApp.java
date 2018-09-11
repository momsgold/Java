import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Scanner;

public class TestScoreApp {

    public static void main(String[] args) {
        // display operational messages
        System.out.println("Enter test scores that range from 0 to 100.");
        System.out.println("To end the program, enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
       
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        // if you put min and max inside the while loop, the values will always be 0 and 100
        int minScore = 100; // start with a high number for min
        int maxScore = 0;	// start with a low number for max

        // get a series of test scores from the user
        while (testScore != 999)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            // accumulate score count and score total
            if (testScore <= 100)
            {
                scoreCount += 1; // = scoreCount + 1;
                scoreTotal += testScore; // = scoreTotal + testScore;
                maxScore = Math.max(maxScore, testScore);
                minScore = Math.min(minScore, testScore);
            }
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
        }

        // display the score count, score total, and average score
        double averageScore = (double) scoreTotal / scoreCount;
        
        // double averageScore = (double) Math.round((scoreTotal / scoreCount) * 10) / 10;
       
        NumberFormat avg = NumberFormat.getNumberInstance();
        avg.setMaximumFractionDigits(2);
       
        // BigDecimal st = new BigDecimal(scoreTotal);
        // BigDecimal scc = new BigDecimal(scoreCount);       
        // double averageScore = st.divide(scc).doubleValue();
      
        // BigDecimal st = new BigDecimal(scoreTotal);
        // BigDecimal scc = new BigDecimal(scoreCount);  
        // BigDecimal averageScoreBD = st.divide(scc).setScale(1, RoundingMode.HALF_UP);
        // double averageScore = averageScoreBD.doubleValue();
        
        String message = "\n"
                + "Score count:   " + scoreCount   + "\n"
                + "Score total:   " + scoreTotal   + "\n"
                + "Average score: " + avg.format(averageScore) + "\n"
                + "Lowest score: "  + minScore     + "\n"
                + "Highest score: " + maxScore     + "\n";
        System.out.println(message);
        sc.close();
    }
}