import javax.swing.*;
import javax.swing.border.Border;

public class Vince_Sample_GUI {
    public static void main(String[] args) {
        JFrame myFrame = new JFrame("Vince Sample Frame for GUI");

        /* closes application operation once closed */
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        /* We set the frame size here */
        myFrame.setSize(350, 200);

        /* Creates panel inside frame */
        JPanel panel = new JPanel();

        /* Dashed border around panel */
        Border border = BorderFactory.createDashedBorder(null);
        panel.setBorder(border);

        /* Label inside panel */
        JLabel myPanelLabel = new JLabel("Sample Panel Text 1 ");
        panel.add(myPanelLabel);

        /* Label for button inside frame */
        JButton button = new JButton("Sample Button 1 to Click");
        panel.add(button);

        /* Label inside panel */
        JLabel myPanelLabel2 = new JLabel("Sample Panel Text 2");
        panel.add(myPanelLabel2);

        /* Label for button inside frame */
        JButton button2 = new JButton("Sample Button  2 to Click");
        panel.add(button2);

        /*Adds panel to frame */
        myFrame.add(panel);

        /* Centers frame */
        myFrame.setLocationRelativeTo(null);

        /* Makes frame visible */
        myFrame.setVisible(true);
    }
}