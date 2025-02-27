package bank.management.system;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Withdraw extends JFrame implements ActionListener {
    String pin;
    JTextField textField;
    JButton b1, b2;

    Withdraw(String pin) {
        this.pin = pin;

        JLabel l1 = new JLabel("MAXIMUM WITHDRAWAL IS Rs. 10,000");
        l1.setFont(new Font("System", Font.BOLD,14));
        l1.setBounds(460, 180,700,35);
        l1.setForeground(Color.WHITE);
        add(l1);

        JLabel l2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        l2.setFont(new Font("System", Font.BOLD,14));
        l2.setBounds(460, 220,400,35);
        l2.setForeground(Color.WHITE);
        add(l2);




        textField = new JTextField();
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD, 22));
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        add(textField);

        b1 = new JButton("WITHDRAW");
        b1.setBounds(700,362,150,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,30);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);



        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0, 1550, 830);
        add(image);


        setLayout(null);
        setSize(1550, 1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter the amount you want to withdraw");

                } else {
                    Conn c = new Conn();
                    ResultSet rs = c.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (rs.next()) {
                        if (rs.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(rs.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(rs.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance");
                        return;
                    }
                    c.statement.executeUpdate("insert into bank values ('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " debited Successfully");
                    setVisible(false);
                    new main_Class("pin");
                }


            } catch (Exception E) {
                E.printStackTrace();

            }
        }else if(e.getSource() == b2){
            setVisible(false);
            new main_Class(pin);
        }

    }

    public static void main(String[] args) {
        new Withdraw("");

    }
}
