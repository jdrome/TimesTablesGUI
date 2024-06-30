import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
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
    }
}