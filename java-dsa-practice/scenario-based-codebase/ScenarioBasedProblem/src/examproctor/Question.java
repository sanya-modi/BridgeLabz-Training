package examproctor;

class Question {
    int id;
    String questionText;
    String[] options;
    String correctAnswer;

    Question(int id, String questionText, String[] options, String correctAnswer) {
        this.id = id;
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    void display() {
        System.out.println("\nQ" + id + ". " + questionText);
        System.out.println("A. " + options[0]);
        System.out.println("B. " + options[1]);
        System.out.println("C. " + options[2]);
        System.out.println("D. " + options[3]);
    }
}