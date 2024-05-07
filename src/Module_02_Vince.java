import javax.swing.*;
import java.awt.*;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Module_02_Vince {
    public static void main(String[] args) {

    JFrame myFrame = new JFrame("My Test Sample Frame UI");
        myFrame.setSize(800,600);

    //  Define Menu
    JMenuBar menuBar = new JMenuBar();
        myFrame.setJMenuBar(menuBar);

    // Define Menu Items
    JMenuItem menuItem1 = new JMenuItem("Print Date/Time");
    JMenuItem menuItem2 = new JMenuItem("Write to File");
    JMenuItem menuItem3 = new JMenuItem("Change Background  ");

    JMenuItem menuItem4 = new JMenuItem("   Exit");
    //menuItem4.setMargin(new Insets(10,10,10, 10));

    // Add Menu Items to Menu
        menuBar.add(menuItem1);
        menuBar.add(menuItem2);
        menuBar.add(menuItem3);
        //menuBar.add(new JMenu("|"));
        //menuBar.add(new JSeparator());
        //menuBar.add( Box.createHorizontalStrut( 30 ) );
        //menuBar.addSeparator();
        menuBar.add(menuItem4);

    JTextArea textArea = new JTextArea("", 10, 1);
        myFrame.add(textArea, BorderLayout.CENTER);

    // Menu Items Actions
        menuItem1.addActionListener(e -> textArea.append(LocalDateTime.now().toString() + "\n"));
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