import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WordCounter {

    public static void main(String[] args) {
        // Create the JFrame
        JFrame jFrame = new JFrame("Word Counter");
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jFrame.setSize(400, 300);
        jFrame.setLocationRelativeTo(null); // Center the JFrame
        jFrame.setLayout(new BorderLayout(10, 10));


        //Horizontal and Vertical padding(space) between components in the Border-layout
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        //creating some padding(space) between the panel's edge and component inside it.
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        JLabel jLabel = new JLabel("Enter your words:");
        panel.add(jLabel, BorderLayout.NORTH);

        JTextArea textArea = new JTextArea();
        // Both Horizontal and Vertical scroll-pane for text area
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);

        JButton jButton = new JButton("Count");
        panel.add(jButton, BorderLayout.SOUTH);

        // ActionListener for the button
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String words = textArea.getText();
                if (!words.isEmpty()) {
                    String[] text = words.split("\\s");
                    JOptionPane.showMessageDialog(jFrame, "Total words: " + text.length);
                } else {
                    JOptionPane.showMessageDialog(jFrame, "Please enter some words.");
                }
            }
        });

        // Add the panel to the JFrame
        jFrame.add(panel, BorderLayout.CENTER);


    }
}
