import javax.swing.*;
import java.awt.*;
 
public class InventoryManagementSystem {
    public static void createAndShowGUI() {
        // Create and set up the frame
        JFrame frame = new JFrame("Inventory Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        // Set up the content pane
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());
 
        // Add components to the content pane
        JLabel titleLabel = new JLabel("Welcome to Inventory Management System");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        contentPane.add(titleLabel, BorderLayout.NORTH);
 
        // Set up the main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new FlowLayout());
 
        // Add components to the main panel
        JButton addButton = new JButton("Add Product");
        mainPanel.add(addButton);
 
        JButton editButton = new JButton("Edit Product");
        mainPanel.add(editButton);
 
        JButton deleteButton = new JButton("Delete Product");
        mainPanel.add(deleteButton);
 
        contentPane.add(mainPanel, BorderLayout.CENTER);
 
        // Set the content pane
        frame.setContentPane(contentPane);
 
        // Display the window
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
