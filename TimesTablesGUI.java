import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;


// Creates Frame for GUI
public class TimesTablesGUI extends JFrame {
    JTextField nameField;
    JButton startButton, submitButton, resetButton;
    JLabel instructionLabel, questionLabel, resultLabel;
    JTextField answerField;
    int correctCount;
    ArrayList<Integer> wrongList;
    int[][] questions;
    int currentQuestionIndex;
    String name;

    public TimesTablesGUI() {
        setTitle("Times Tables Practice");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 1));

        // Provides instructions to user
        instructionLabel = new JLabel("Enter your name and click start:");
        add(instructionLabel);

        // Provide text field for user to add their name.
        nameField = new JTextField();
        add(nameField);

        // Start button will initiate times tables program
        startButton = new JButton("Start");
        add(startButton);
        startButton.addActionListener(new StartButton(this));

        // Question label to hold question for the user
        questionLabel = new JLabel();
        add(questionLabel);

        // Answer field where user can type answer to question
        answerField = new JTextField();
        add(answerField);

        // Submit button for user to submit their answer(s)
        submitButton = new JButton("Submit");
        add(submitButton);
        submitButton.addActionListener(new SubmitButton(this));

        // Reset button for user to reset the game
        resetButton = new JButton("Reset");
        add(resetButton);
        resetButton.addActionListener(new ResetButton(this));

        // Result label to show the user their results
        resultLabel = new JLabel();
        add(resultLabel);

        disableQuestionSection();
    }

    // Enables the question for the user
    void enableQuestionSection() {
        questionLabel.setEnabled(true);
        answerField.setEnabled(true);
        submitButton.setEnabled(true);
    }

    // Disables the questions for the user
    void disableQuestionSection() {
        questionLabel.setEnabled(false);
        answerField.setEnabled(false);
        submitButton.setEnabled(false);
    }

    // Generates the next question for the user
    void showNextQuestion() {
        int[] question = questions[currentQuestionIndex];
        questionLabel.setText((currentQuestionIndex + 1) + ". " + question[0] + " X " + question[1] + " = ");
        answerField.setText("");
    }

    // Displays the users results
    void showResults() {
        StringBuilder results = new StringBuilder();
        results.append("You got ").append(correctCount).append(" correct out of 5.");
        if (!wrongList.isEmpty()) {
            results.append(" You got the following questions incorrect: ").append(wrongList);
        } else {
            results.append(" Congratulations, you got 100%!");
        }
        resultLabel.setText(results.toString());
    }

    // Generates random multiplication questions for the user
    int[][] generateQuestions() {
        int[][] questions = new int[5][3];
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            int num1 = 1 + rand.nextInt(12);
            int num2 = 1 + rand.nextInt(12);
            questions[i][0] = num1;
            questions[i][1] = num2;
            questions[i][2] = num1 * num2;
        }
        return questions;
    }
}