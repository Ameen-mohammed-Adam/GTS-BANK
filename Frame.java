import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
public class Frame extends JFrame implements ActionListener{
    

    JPanel panle = new JPanel();

    JButton button = new JButton("GO BACK HOME");
    JTextField textField = new JTextField();

    JLabel lable = new JLabel("What do you want to do ??");
    ImageIcon img = new ImageIcon("Briliantmove.png");
    JPanel Name = new JPanel();
    
    
    Frame(){
        setTitle("Transaztion Completed");
        setBounds(0, 0, 420,420);
        // setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setIconImage(img.getImage());
        setLocationRelativeTo(null);
        add(lable);


        // Name.add(lable);
        // Name.setBackground(Color.GRAY);
        // Name.setBounds(0, 0, 150, 150);
        // String s = "Hi how are you";

        lable.setText("MR." + main.UserName +" Your Balance is " + main.Balance );
        // lable.setText("Hello World");
        lable.setBackground(Color.green);
        // lable.add(textField);
        lable.add(button);
        lable.setHorizontalTextPosition(JLabel.CENTER);
        lable.setVerticalTextPosition(JLabel.TOP);
        lable.setVerticalAlignment(JLabel.CENTER);
        lable.setHorizontalAlignment(JLabel.CENTER);
        lable.setForeground(Color.GREEN);
        lable.setFont(new Font("Hello World", Font.BOLD ,20));
        lable.setBackground(new Color(0, 102, 204));
        lable.setOpaque(true);

        // textField.setBounds(0 , 0 , 60, 40);
        button.setBounds(100,351,200,30);
        button.addActionListener(this);
        // button.setBackground(Color.gray);
        button.setForeground(Color.black);
        // button.setBorder(BorderFactory.createLineBorder(Color.GREEN));
        
        


    }

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button){
            dispose();
            new HomePage().setVisible(true);
        }
    }





}


