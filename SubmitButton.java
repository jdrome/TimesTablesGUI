import java.awt.event.*;
import javax.swing.JOptionPane;

public class SubmitButton implements ActionListener {
    private TimesTablesGUI gui;

    public SubmitButton(TimesTablesGUI gui) {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String answerText = gui.answerField.getText();
        try {
            int answer = Integer.parseInt(answerText);
            int correctAnswer = gui.questions[gui.currentQuestionIndex][2];
            if (answer == correctAnswer) {
                gui.correctCount++;
            } else {
                gui.wrongList.add(gui.currentQuestionIndex + 1);
            }
            gui.currentQuestionIndex++;
            if (gui.currentQuestionIndex < 5) {
                gui.showNextQuestion();
            } else {
                gui.showResults();
                gui.disableQuestionSection();
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(gui, "Please enter a valid integer.");
        }
    }
}