import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;
import java.applet.*;
public class LoginFrame extends JFrame implements ActionListener {
    JTextField usernameField;
    JTextField BalanceField;
    JButton loginButton;
    public LoginFrame() {
        setTitle("Log-In Frame");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        // pack();
        setBackground(new Color(0, 102, 204));
        JLabel usernameLabel = new JLabel("User Name");
        usernameLabel.setBounds(20, 20, 100, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(120, 20, 150, 25);
        add(usernameField);

        JLabel BalanceLabel = new JLabel("Balance : ");
        BalanceLabel.setBounds(20, 50, 100, 25);
        // BalanceLabel.setBackground(Color.green);
        // BalanceLabel.setOpaque(true);
        add(BalanceLabel);
        BalanceLabel.setVisible(true);

        BalanceField = new JTextField();
        BalanceField.setBounds(120, 50, 150, 25);
        add(BalanceField);

        loginButton = new JButton("LOG IN");
        loginButton.setBounds(100, 100, 120, 25);
        loginButton.addActionListener(this);
        add(loginButton);
    }

    public void actionPerformed(ActionEvent e) {
        String username = usernameField.getText();
        int Balance = Integer.parseInt(BalanceField.getText());
        main.Balance = Balance;
        main.UserName = username;
        dispose();
        new HomePage().setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                LoginFrame loginFrame = new LoginFrame();
                loginFrame.setVisible(true);
            }
   });
    }
}