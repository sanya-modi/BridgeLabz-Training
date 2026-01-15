package examproctor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        QuestionBank qb = new QuestionBank();
        ExamSession exam = new ExamSession();

        int choice;

        do {
            System.out.println("\n--- Online Exam Menu ---");
            System.out.println("1. Visit Question");
            System.out.println("2. Answer Question");
            System.out.println("3. Go Back");
            System.out.println("4. Submit Exam");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Question ID (1-" + qb.totalQuestions() + "): ");
                    int qId = sc.nextInt();
                    Question q = qb.getQuestion(qId);
                    if (q != null) {
                        exam.visitQuestion(q);
                    } else {
                        System.out.println("Invalid Question ID");
                    }
                    break;

                case 2:
                    System.out.print("Enter Question ID: ");
                    int ansId = sc.nextInt();
                    System.out.print("Enter Answer (A/B/C/D): ");
                    String ans = sc.next();
                    exam.answerQuestion(ansId, ans);
                    break;

                case 3:
                    exam.goBack();
                    break;

                case 4:
                    int score = exam.evaluateScore(qb);
                    System.out.println("\n Exam Submitted");
                    System.out.println("Final Score: " + score + "/" + qb.totalQuestions());
                    break;

                default:
                    System.out.println(" Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}