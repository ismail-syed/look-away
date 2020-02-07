package Views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class AddressBookMenu extends JMenu {
    private ActionListener listener;

    public void setListener(ActionListener al) {
        this.listener = al;
    }

    public void init() {
        setText("App.AddressBook");

        JMenuItem create = new JMenuItem("Create");
        create.addActionListener(this.listener);
        this.add(create);

        JMenuItem display = new JMenuItem("Read");
        display.addActionListener(this.listener);
        this.add(display);
    }
}