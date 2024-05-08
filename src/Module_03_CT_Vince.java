import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period; //obtains a quantity or amount of time in terms of years, months and days.

public class Module_03_CT_Vince {
    public static void main(String[] args) {
        // Create my JFrame
        JFrame jFrame = new JFrame("Age Calculator");
        jFrame.setSize(800, 600);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create my Panel
        JPanel myPanel = new JPanel();

        //Create some panel controls
        jTextField birthDateField = new jTextField(10);
        JButton calcButton = new JButton("Calculate Age: )");
        JLabel ageLabel = new JLabel();

        // Add Action when button is clicked
        calcButton.addActionListener(e -> {
            String birthDateString = birthDateField.getText();
            LocalDate birthDate = LocalDate.parse(birthDateString);
            LocalDate now = LocalDate.now();
            int age = Period.between(birthDate, now).getYears();
            ageLabel.setText("Your age is " + age);
        });

        // Add Controls to Panel
        mypanel.add(new JLabel("Enter birth date YYYY-MM-DD): "));
        mypanel.add(birthDateField);
        mypanel.add(calcButton);
        mypanel.add(ageLabel);

        // Add Panel to JFrame
        jFrame.add(panel);
        jFrame.setVisible(true);
    }
}

