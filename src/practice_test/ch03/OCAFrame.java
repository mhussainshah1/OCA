package practice_test.ch03;

import java.awt.*;
import java.awt.event.*;

/**
 * Sample application using Frame.
 *
 * @author
 * @version 1.00 17/12/27
 */
public class OCAFrame extends Frame {

    /**
     * The constructor.
     */
    public OCAFrame() {

        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu();
        MenuItem menuFileExit = new MenuItem();

        menuFile.setLabel("File");
        menuFileExit.setLabel("Exit");

        // Add action listener.for the menu button
        menuFileExit.addActionListener(
                new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                OCAFrame.this.windowClosed();
            }
        }
        );
        menuFile.add(menuFileExit);
        menuBar.add(menuFile);

        setTitle("OCA");
        setMenuBar(menuBar);
        setSize(new Dimension(400, 400));

        // Add window listener.
        this.addWindowListener(
                new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                OCAFrame.this.windowClosed();
            }
        }
        );
    }

    /**
     * Shutdown procedure when run as an application.
     */
    protected void windowClosed() {

        // TODO: Check if it is safe to close the application
        // Exit application.
        System.exit(0);
    }
}
