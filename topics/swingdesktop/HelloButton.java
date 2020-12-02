package swingdesktop;

import javax.swing.*;

// Modified version of: https://docs.oracle.com/javase/tutorial/uiswing/examples/start/HelloWorldSwingProject/src/start/HelloWorldSwing.java
// More examples here: https://docs.oracle.com/javase/tutorial/uiswing/examples/components/index.html
public class HelloButton {
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        SwingUtilities.invokeLater(() -> {
            createAndShowGUI();
        });
    }

    /**
     * Create the GUI and show it.  For thread safety,
     * this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JButton button = new JButton("Hello World");
        frame.getContentPane().add(button);

        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
}
