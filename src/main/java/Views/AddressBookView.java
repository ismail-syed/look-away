package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class AddressBookView extends JFrame {
    private ActionListener listener;
    private ArrayList<JMenu> menus;

    public void setListener(ActionListener al) {
        this.listener = al;
    }

    public void setMenus(ArrayList<JMenu> menus) {
        this.menus = menus;
    }

    public void showMessage(String msg) {
        JOptionPane.showMessageDialog(new JTextArea(), msg);
    }

    public String inputDialog(String msg) {
        return JOptionPane.showInputDialog(msg);
    }

    public void init() {
        JMenuBar bar = new JMenuBar();
        for (JMenu m: this.menus) {
            bar.add(m);
        }
        setJMenuBar(bar);

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(new Dimension(600, 400));

        setVisible(true);
        setState(Frame.NORMAL);
    }
}