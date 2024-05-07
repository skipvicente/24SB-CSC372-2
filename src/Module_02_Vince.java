import javax.swing.*;
import java.awt.*;
import java.io.FileWriter; //to write to file
import java.io.IOException; //for exception error
import java.time.LocalDateTime; //to pull system time

public class Module_02_Vince {
    public static void main(String[] args) {

    JFrame myFrame = new JFrame("Module 02 Sample Frame UI");
        myFrame.setSize(800,600);

    //  Defined Menu
    JMenuBar menuBar = new JMenuBar();
        myFrame.setJMenuBar(menuBar);

    // Defined Menu Items
    JMenuItem menuItem1 = new JMenuItem("Display Date/Time");
    JMenuItem menuItem2 = new JMenuItem("Write to File");
    JMenuItem menuItem3 = new JMenuItem("Background Color  ");

    JMenuItem menuItem4 = new JMenuItem("  Exit");


    // Add Menu Items to Menu
        menuBar.add(menuItem1);
        menuItem1.add(new JSeparator());
        menuBar.add(menuItem2);
        menuItem2.add(new JSeparator());
        menuBar.add(menuItem3);
        menuItem3.add(new JSeparator());
        menuBar.add(menuItem4);
        menuItem4.add(new JSeparator());

    JTextArea textArea = new JTextArea("", 20, 1);
        myFrame.add(textArea, BorderLayout.CENTER);

    // Menu Items Actions
        menuItem1.addActionListener(e -> textArea.append(LocalDateTime.now() + "\n"));
        menuItem2.addActionListener(e -> {
        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write(textArea.getText());
            JOptionPane.showMessageDialog(myFrame, "Text written to file");
        }

        catch (IOException ioException) {
            ioException.printStackTrace();
        }
    });

        // Color changes randomly
        menuItem3.addActionListener(e -> {
        Color randomColor = new Color((int)(Math.random() * 256), (int)(Math.random() * 256), (int)(Math.random() * 256));
        textArea.setBackground(randomColor);
    });

        // Exit button action
        menuItem4.addActionListener(e -> System.exit(0));

        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
}
}