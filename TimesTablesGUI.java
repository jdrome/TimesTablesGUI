import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Random;

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
    }
}