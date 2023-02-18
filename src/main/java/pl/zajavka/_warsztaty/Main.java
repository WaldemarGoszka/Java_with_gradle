package pl.zajavka._warsztaty;

import javax.swing.*;
import javax.swing.plaf.basic.BasicComboBoxUI;
import java.awt.*;


public class Main {

    static{
        new FilteringBag<>();
    }

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Main window = new Main();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public Main() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.GREEN);
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
        JComboBox comboBox = new JComboBox(pet Strings);
        comboBox.setBounds(149, 99, 155, 20);
        comboBox.setOpaque(false);
        //comboBox.setBackground(new Color(0,0,0,0));
        ((JTextField)comboBox.getEditor().getEditorComponent()).setOpaque(false);
        comboBox.setUI(new BasicComboBoxUI(){

            public void paintCurrentValueBackground(Graphics g,Rectangle bounds,boolean hasFocus){}});
        frame.getContentPane().add(comboBox);

    }

}
