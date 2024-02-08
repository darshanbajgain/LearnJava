
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MovieRentalSystemForm extends JFrame implements ActionListener {
    private JTextField idField, titleField, genreField, languageField, lengthField;
    private JButton okButton;

    public MovieRentalSystemForm() {
        setTitle("Movie Rental System Form");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        JLabel idLabel = new JLabel("ID:");
        idField = new JTextField();
        add(idLabel);
        add(idField);

        JLabel titleLabel = new JLabel("Title:");
        titleField = new JTextField();
        add(titleLabel);
        add(titleField);

        JLabel genreLabel = new JLabel("Genre:");
        genreField = new JTextField();
        add(genreLabel);
        add(genreField);

        JLabel languageLabel = new JLabel("Language:");
        languageField = new JTextField();
        add(languageLabel);
        add(languageField);

        JLabel lengthLabel = new JLabel("Length:");
        lengthField = new JTextField();
        add(lengthLabel);
        add(lengthField);

        okButton = new JButton("OK");
        okButton.addActionListener(this);
        add(okButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == okButton) {
            String id = idField.getText();
            String title = titleField.getText();
            String genre = genreField.getText();
            String language = languageField.getText();
            String length = lengthField.getText();

            // Insert data into the database table
            insertMovie(id, title, genre, language, length);
        }
    }

    private void insertMovie(String id, String title, String genre, String language, String length) {
        try {
            // Establish connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_name", "root", "your@password");

            // Create prepared statement for inserting data into the table
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO Movie (id, Title, Genre, Language, Length) VALUES (?, ?, ?, ?, ?)");
            preparedStatement.setString(1, id);
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, genre);
            preparedStatement.setString(4, language);
            preparedStatement.setString(5, length);

            // Execute the prepared statement
            preparedStatement.executeUpdate();

            // Close the prepared statement and connection
            preparedStatement.close();
            connection.close();

            // Show success message
            JOptionPane.showMessageDialog(this, "Movie added successfully!");
        } catch (SQLException ex) {
            // Handle database errors
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error: Failed to insert movie into the database.");
        }
    }

    public static void main(String[] args) {
        // Create the form
        new MovieRentalSystemForm();
    }
}
