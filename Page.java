package projet.java;

import java.awt.*;
import javax.swing.*;

public abstract class Page extends JPanel {
    protected JFrame m_window;
    
    public Page(JFrame parent) {
        setLayout(new BorderLayout(10,10));
        m_window = parent;
    }
}
