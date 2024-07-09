import java.awt.event.*;

public class ResetButton implements ActionListener {
    private TimesTablesGUI gui;

    public ResetButton(TimesTablesGUI gui) {
        this.gui = gui;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        gui.nameField.setEnabled(true);
        gui.startButton.setEnabled(true);
        gui.instructionLabel.setText("Enter your name and click Start:");
        gui.resultLabel.setText("");
        gui.nameField.setText("");
        gui.answerField.setText("");
        gui.disableQuestionSection();
    }
}