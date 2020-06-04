package projet.java;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class HomePage extends Page implements ActionListener{
    private final JLabel m_photo;
    private JLabel m_logo;
    private JLabel m_labelEmail;
    private JLabel m_labelPassword;
    private JTextField m_email;
    private JPasswordField m_password;
    private JButton m_signInButton;
    
    public HomePage(JFrame parent) {
        super(parent);
        
        ImageIcon photo = new ImageIcon("campus.jpg");
        m_photo = new JLabel(photo);
        add(m_photo, BorderLayout.CENTER);
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setPreferredSize(new Dimension(250, HEIGHT));
        m_labelEmail = new JLabel("email:");
        m_email = new JTextField();
        m_email.setMaximumSize(new Dimension(400, 20));
        m_labelPassword = new JLabel("password:");
        m_password = new JPasswordField();
        m_password.setMaximumSize(new Dimension(400, 20));
        m_signInButton = new JButton("sign in");
        m_signInButton.addActionListener(this);
        panel.add(Box.createRigidArea(new Dimension(0,15)));
        panel.add(m_labelEmail);
        panel.add(m_email);
        panel.add(Box.createRigidArea(new Dimension(0,15)));
        panel.add(m_labelPassword);
        panel.add(m_password);
        panel.add(Box.createRigidArea(new Dimension(0,15)));
        panel.add(m_signInButton);
        add(panel, BorderLayout.EAST);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == m_signInButton) {
            //controle de l'identité
            boolean isRegistered = true;
            
            if(isRegistered) {
                m_window.setContentPane(new SchedulePage(m_window));
                m_window.setVisible(true);
            }
        }
    }
}
