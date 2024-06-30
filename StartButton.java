import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class StartButton implements ActionListener {
    private TimesTablesGUI gui;

    public StartButton(TimesTablesGUI gui) {
        this.gui = gui;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        gui.name = gui.nameField.getText();
        if (!gui.name.isEmpty()) {
            gui.nameField.setEnabled(false);
            gui.startButton.setEnabled(false);
            gui.instructionLabel.setText("Hello, " + gui.name + "! Answer the following questions:");
            gui.correctCount = 0;
            gui.wrongList = new ArrayList<>();
            gui.questions = gui.generateQuestions();
            gui.currentQuestionIndex = 0;
            gui.showNextQuestion();
            gui.enableQuestionSection();
        } else {
            JOptionPane.showMessageDialog(gui, "Please enter your name.");
        }
    }
}