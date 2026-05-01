import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDate;

public class MedicalReportGUI {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Medical Report System");
        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // ===== TITLE =====
        JLabel title = new JLabel("CITY CARE HOSPITAL", JLabel.CENTER);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(title, BorderLayout.NORTH);

        // ===== FORM PANEL =====
        JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40));

        JTextField nameField = new JTextField();
        JTextField ageField = new JTextField();
        JTextField genderField = new JTextField();
        JTextField patientIdField = new JTextField();
        JTextField testField = new JTextField();
        JTextField resultField = new JTextField();
        JTextField doctorField = new JTextField();
        JTextField diagnosisField = new JTextField();

        formPanel.add(new JLabel("Patient Name:"));
        formPanel.add(nameField);

        formPanel.add(new JLabel("Age:"));
        formPanel.add(ageField);

        formPanel.add(new JLabel("Gender:"));
        formPanel.add(genderField);

        formPanel.add(new JLabel("Patient ID:"));
        formPanel.add(patientIdField);

        formPanel.add(new JLabel("Test Name:"));
        formPanel.add(testField);

        formPanel.add(new JLabel("Result:"));
        formPanel.add(resultField);

        formPanel.add(new JLabel("Doctor Name:"));
        formPanel.add(doctorField);

        formPanel.add(new JLabel("Diagnosis:"));
        formPanel.add(diagnosisField);

        frame.add(formPanel, BorderLayout.CENTER);

        // ===== BUTTON =====
        JButton generateBtn = new JButton("Generate Report");
        generateBtn.setFont(new Font("Arial", Font.BOLD, 14));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(generateBtn);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // ===== OUTPUT =====
        JTextArea output = new JTextArea(10, 50);
        output.setFont(new Font("Monospaced", Font.PLAIN, 13));
        output.setEditable(false);

        JScrollPane scroll = new JScrollPane(output);
        frame.add(scroll, BorderLayout.EAST);

        // ===== BUTTON ACTION =====
        generateBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String report =
                        "=========================================\n" +
                        "          CITY CARE HOSPITAL\n" +
                        "=========================================\n" +
                        "Date: " + LocalDate.now() + "\n\n" +

                        "PATIENT DETAILS\n" +
                        "-----------------------------\n" +
                        "Name       : " + nameField.getText() + "\n" +
                        "Age        : " + ageField.getText() + "\n" +
                        "Gender     : " + genderField.getText() + "\n" +
                        "Patient ID : " + patientIdField.getText() + "\n\n" +

                        "TEST DETAILS\n" +
                        "-----------------------------\n" +
                        "Test Name  : " + testField.getText() + "\n" +
                        "Result     : " + resultField.getText() + "\n\n" +

                        "DOCTOR REMARKS\n" +
                        "-----------------------------\n" +
                        "Doctor     : " + doctorField.getText() + "\n" +
                        "Diagnosis  : " + diagnosisField.getText() + "\n\n" +

                        "Signature  : ______________________\n\n" +
                        "**** Computer Generated Report ****";

                output.setText(report);
            }
        });

        frame.setVisible(true);
    }
}