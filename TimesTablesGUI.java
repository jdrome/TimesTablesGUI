import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;


// Creates Frame for GUI
public class TimesTablesGUI extends JFrame {
    private JTextField nameField;
    private JButton startButton, submitButton, resetButton;
    private JLabel instructionLabel, questionLabel, resultLabel;
    private JTextField answerField;
    private int correctCount;
    private ArrayList<Integer> wrongList;
    private int[][] questions;
    private int currentQuestionIndex;
    private String name;

    public TimesTablesGUI() {
        setTitle("Times Tables Practice");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8, 1));

        instructionLabel = new JLabel("Enter your name and click start:");
        add(instructionLabel);
    }
}