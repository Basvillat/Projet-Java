package projet.java;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Header extends JPanel implements ActionListener {
    private JFrame m_window;
    private JButton m_signOutButton;
    private JButton m_scheduleButton;
    private JButton m_summaryButton;
    private JTextField m_targetName;
    private JPanel m_weekIndex;
    private JComboBox m_displayMode;
    
    public Header() {
        setLayout(new BoxLayout(this,BoxLayout.PAGE_AXIS));
        
        JPanel upperPane = new JPanel();
        upperPane.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        m_signOutButton = new JButton("Déconnexion");
        m_signOutButton.addActionListener(this);
        String[] displayModeList = {"Grille","Liste"};
        m_displayMode = new JComboBox(displayModeList);
        m_displayMode.setSelectedIndex(0);
        m_targetName = new JTextField();
        m_targetName.setPreferredSize(new Dimension(140,20));
        upperPane.add(m_signOutButton);
        upperPane.add(m_displayMode);
        upperPane.add(m_targetName);
        
        JPanel middlePane = new JPanel();
        middlePane.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 10));
        m_scheduleButton = new JButton("Emploi du Temps");
        m_summaryButton = new JButton("Récapitulatif des Cours");
        middlePane.add(m_scheduleButton);
        middlePane.add(m_summaryButton);
        
        JPanel bottomPane = new JPanel();
        bottomPane.setLayout(new BoxLayout(bottomPane,BoxLayout.LINE_AXIS));
        int nbWeeks = 12;
        for(int i = 0; i < nbWeeks; i++) {
            JButton weekButton = new JButton(Integer.toString(i + 1));
            weekButton.setMaximumSize(new Dimension(50,50));
            bottomPane.add(weekButton);
        }
        
        upperPane.setBackground(Color.LIGHT_GRAY);
        middlePane.setBackground(Color.LIGHT_GRAY);
        
        add(upperPane);
        add(middlePane);
        add(bottomPane);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == m_signOutButton) {
            m_window.setContentPane(new HomePage(m_window));
            m_window.setVisible(true);
        }
    }
}
