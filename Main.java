import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TimesTablesGUI gui = new TimesTablesGUI();
            gui.setVisible(true);
        });
    }
}