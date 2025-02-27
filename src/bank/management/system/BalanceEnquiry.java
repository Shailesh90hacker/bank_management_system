package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    JLabel l2;
    JButton b1;
    String pin;

    BalanceEnquiry(String pin){
        this.pin = pin;

        JLabel l1 = new JLabel("Your Current Balance is Rs. ");
        l1.setFont(new Font("System", Font.BOLD,14));
        l1.setBounds(430, 180,700,35);
        l1.setForeground(Color.WHITE);
        add(l1);

        JLabel l2 = new JLabel();
        l2.setFont(new Font("System", Font.BOLD,14));
        l2.setBounds(430, 220,400,35);
        l2.setForeground(Color.WHITE);
        add(l2);

        b1 = new JButton("BACK");
        b1.setBounds(700,406,150,30);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        int balance = 0;
        try{
            Conn c = new Conn();
            ResultSet rs = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");
            while(rs.next()) {
                if (rs.getString("type").equals("Deposit")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        l2.setText(""+balance);




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
        setVisible(false);
        new main_Class(pin);

    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
