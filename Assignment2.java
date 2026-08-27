import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] blacklist = {"badword", "abuse", "spam" , "idiot" ,"deserve", "fools","silly"};

        StringBuilder dailyReport = new StringBuilder();

        System.out.print("Enter number of feedback messages: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter feedback " + i + ":");
            String feedback = sc.nextLine();

            
            int wordCount = 0;
            boolean insideWord = false;

            for (int j = 0; j < feedback.length(); j++) {

                if (feedback.charAt(j) != ' ' && insideWord == false) {
                    wordCount++;
                    insideWord = true;
                }

                if (feedback.charAt(j) == ' ') {
                    insideWord = false;
                }
            }

            
            boolean blacklisted = false;
            String foundWord = "";

            for (int j = 0; j < blacklist.length; j++) {

                if (feedback.toLowerCase().contains(blacklist[j])) {
                    blacklisted = true;
                    foundWord = blacklist[j];
                    break;
                }
            }

            
            StringBuilder reverseMessage = new StringBuilder(feedback);
            reverseMessage.reverse();

            
            dailyReport.append("\nFeedback ").append(i).append("\n");
            dailyReport.append("Original Message: ").append(feedback).append("\n");
            dailyReport.append("Word Count: ").append(wordCount).append("\n");

            if (blacklisted == true) {
                dailyReport.append("Blacklisted Word Found: ")
                           .append(foundWord).append("\n");
            } else {
                dailyReport.append("Blacklisted Word Found: None\n");
            }

            dailyReport.append("Reversed Message: ")
                       .append(reverseMessage).append("\n");

            dailyReport.append("--------------------------\n");
        }

        System.out.println("\n===== DAILY FEEDBACK REPORT =====");
        System.out.println(dailyReport);

        sc.close();
    }
}