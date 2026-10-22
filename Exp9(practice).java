
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HostelForm extends JFrame implements ActionListener {
    JTextField nameField;
    JCheckBox hostelBox;
    JButton submitButton;
    JLabel outputLabel;

    HostelForm() {
        setTitle("Student Form");
        setSize(400, 250);
        setLayout(new FlowLayout());

        add(new JLabel("Student Name:"));
        nameField = new JTextField(15);
        add(nameField);

        hostelBox = new JCheckBox("Hostel required");
        add(hostelBox);

        submitButton = new JButton("Submit");
        add(submitButton);

        outputLabel = new JLabel("");
        add(outputLabel);

        submitButton.addActionListener(this);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String hostel = hostelBox.isSelected() ? "Yes" : "No";

        outputLabel.setText(
            "Name: " + name + ", Hostel required: " + hostel
        );
    }

    public static void main(String[] args) {
        new HostelForm();
    }
}
