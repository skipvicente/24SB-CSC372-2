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
        JTextField birthDateField = new JTextField(10);
        JButton calcButton = new JButton("Calculate Age");
        JLabel ageLabelYears = new JLabel();
        JLabel ageLabelDays = new JLabel();

        // Add Action when button is clicked
        calcButton.addActionListener(e -> {
            //int age;

            String birthDateString = birthDateField.getText();
            LocalDate birthDate = LocalDate.parse(birthDateString);
            LocalDate now = LocalDate.now(); /* getting current date to compare */
            System.out.println(now); /* current date displays YYYY-MM-DD */
            int ageYears = Period.between(birthDate, now).getYears(); /* we now compare the dates birth year to current year */
            int ageDays = Period.between(birthDate, now).getDays(); /* we now compare the dates */
            ageLabelYears.setText("Your age is approximately " + ageYears + " years old.");
            ageLabelDays.setText("Your age is approximately " + ageDays + " days old.");
        });

        // Add Controls to Panel
        myPanel.add(new JLabel("Enter birth date YYYY-MM-DD): "));
        myPanel.add(birthDateField);
        myPanel.add(calcButton);
        myPanel.add(ageLabelYears);
        myPanel.add(ageLabelDays);

        // Add Panel to JFrame
        jFrame.add(myPanel);
        jFrame.setVisible(true);
    }
}

