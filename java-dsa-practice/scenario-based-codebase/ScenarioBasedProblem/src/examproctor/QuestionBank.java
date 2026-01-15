package examproctor;

import java.util.HashMap;

class QuestionBank {

    HashMap<Integer, Question> questions = new HashMap<>();

    QuestionBank() {
        questions.put(1, new Question(
                1,
                "Which data structure follows LIFO?",
                new String[]{"Queue", "Stack", "Array", "Linked List"},
                "B"
        ));

        questions.put(2, new Question(
                2,
                "Which collection allows key-value pairs?",
                new String[]{"List", "Set", "Map", "Stack"},
                "C"
        ));

        questions.put(3, new Question(
                3,
                "Which is NOT a linear data structure?",
                new String[]{"Array", "Tree", "Stack", "Queue"},
                "B"
        ));
    }

    Question getQuestion(int id) {
        return questions.get(id);
    }

    int totalQuestions() {
        return questions.size();
    }
}