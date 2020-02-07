package Views;

import javax.swing.*;
import java.awt.event.ActionListener;

public class BuddyInfoMenu extends JMenu {
    private ActionListener listener;

    public void setListener(ActionListener al) {
        this.listener = al;
    }

    public void init() {
        this.setText("App.BuddyInfo");

        JMenuItem create = new JMenuItem("Add");
        create.addActionListener(this.listener);
        this.add(create);
    }
}