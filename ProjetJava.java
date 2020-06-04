package projet.java;

import javax.swing.JFrame;


public class ProjetJava {

    public static void main(String[] args) {
        JFrame window = new JFrame("MyWindow");
        window.setSize(1080, 720);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        HomePage hp = new HomePage(window);
        
        window.add(hp);
        window.setVisible(true);
    }
    
}
