package projet.java;

import java.awt.*;
import javax.swing.*;

public class SchedulePage extends Page {
    private Header m_header;
    
    public SchedulePage(JFrame parent) {
        super(parent);
        
        m_header = new Header();
        add(m_header, BorderLayout.NORTH);
    }
}
