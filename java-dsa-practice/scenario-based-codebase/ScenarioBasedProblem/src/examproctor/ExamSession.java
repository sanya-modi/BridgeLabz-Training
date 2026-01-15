package examproctor;

import java.util.HashMap;
import java.util.Stack;

class ExamSession {

    private Stack<Integer> navigationStack;
    private HashMap<Integer, String> studentAnswers;

    ExamSession() {
        navigationStack = new Stack<>();
        studentAnswers = new HashMap<>();
    }

    void visitQuestion(Question q) {
        navigationStack.push(q.id);
        q.display();
    }

    void answerQuestion(int qId, String answer) {
        studentAnswers.put(qId, answer.toUpperCase());
        System.out.println("Answer saved");
    }

    void goBack() {
        if (!navigationStack.isEmpty()) {
            int last = navigationStack.pop();
            System.out.println("Back from Question " + last);
        } else {
            System.out.println("No previous question!");
        }
    }

    // FUNCTION: evaluate score
    int evaluateScore(QuestionBank qb) {
        int score = 0;

        for (int qId : qb.questions.keySet()) {
            Question q = qb.getQuestion(qId);
            if (q.correctAnswer.equals(studentAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}