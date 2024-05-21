
// import javax.swing.*;
// import java.awt.*;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// public class GUI2{
//     JFrame jf = new JFrame("My Frame");
//     JPanel jp1 = new JPanel();
//     JPanel jp2 = new JPanel();
//     JTextArea jta1 = new JTextArea(10,20);
//     JTextArea jta2 = new JTextArea(10,20);
//     pubilc GUI2(){

//     }
//     public static void main(String[] args) {
        
//     }
// }
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class GUI2 {
    private JFrame frame;
    private JPanel mainPanel;
    private JButton showFormButton;
    private JButton showDetailsButton;
    private JTextField nameField;
    private JTextField emailField;
    private JTextArea detailsTextArea;
    private JLabel dateLabel;

    public GUI2() {
        frame = new JFrame("Simple Form Example");

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        mainPanel = new JPanel(new BorderLayout());
        JPanel inputPanel = new JPanel(new GridLayout(3, 2));

        nameField = new JTextField(20);
        emailField = new JTextField(20);
        detailsTextArea = new JTextArea(10, 20);
        detailsTextArea.setEditable(false);

        inputPanel.add(new JLabel("Name:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Email:"));
        inputPanel.add(emailField);

        showFormButton = new JButton("Show Form");
        showDetailsButton = new JButton("Show Details");

        mainPanel.add(inputPanel, BorderLayout.NORTH);

        dateLabel = new JLabel("Date: ");
        mainPanel.add(dateLabel, BorderLayout.SOUTH);

        showFormButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                detailsTextArea.setText(""); // Clear the details
                mainPanel.remove(detailsTextArea);
                mainPanel.add(inputPanel, BorderLayout.NORTH);
                frame.revalidate();
            }
        });

        showDetailsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();

                // Get the current date and format it
                LocalDate currentDate = LocalDate.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String formattedDate = currentDate.format(formatter);

                String details = "Name: " + name + "\nEmail: " + email + "\nDate: " + formattedDate;
                detailsTextArea.setText(details);
                mainPanel.remove(inputPanel);
                mainPanel.add(new JScrollPane(detailsTextArea), BorderLayout.NORTH);
                frame.revalidate();
            }
        });

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(showFormButton);
        buttonPanel.add(showDetailsButton);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);

        frame.add(mainPanel);
        frame.setSize(400, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        GUI2 gui = new GUI2();
    }
}
