package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JButton next;
    JTextField textName, textFName,textEmail, textAdd, textCity, textPin, textState;
    JDateChooser dateChooser;
    JRadioButton r1, r2, m1, m2, m3;

    Random rand = new Random();
    long first4 = (rand.nextLong() % 9000L) + 1000L ;
    String first = " " + Math.abs(first4);

    Signup(){
        super("Application Form");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("page 1");
        label2.setFont(new Font("Raleway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal details");
        label3.setFont(new Font("Raleway", Font.BOLD, 22));
        label3.setBounds(290, 90, 600, 30);
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setBounds(100, 150, 100, 30);
        add(labelName);

        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 150, 400, 30);
        add(textName);

        JLabel labelFName = new JLabel("Father's Name :");
        labelFName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelFName.setBounds(100, 200, 200, 30);
        add(labelFName);

        textFName = new JTextField();
        textFName.setFont(new Font("Raleway", Font.BOLD, 14));
        textFName.setBounds(300, 200, 400, 30);
        add(textFName);

        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 250, 200, 30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 250, 400, 30);
        add(dateChooser);

        JLabel g = new JLabel("Gender :");
        g.setFont(new Font("Raleway", Font.BOLD, 20));
        g.setBounds(100, 300, 200, 30);
        add(g);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD, 14));
        r1.setBackground(new Color(222, 255, 223));
        r1.setBounds(300, 300, 90, 30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD, 14));
        r2.setBackground(new Color(222, 255, 223));
        r2.setBounds(450, 300, 90, 30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel labelEmail = new JLabel("Email Adress :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setBounds(100, 350, 200, 30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 350, 400, 30);
        add(textEmail);

        JLabel labelMs = new JLabel("Martial Status :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setBounds(100, 400, 200, 30);
        add(labelMs);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway", Font.BOLD, 14));
        m1.setBackground(new Color(222, 255, 223));
        m1.setBounds(300, 400, 100, 30);
        add(m1);

        m2 = new JRadioButton("UnMarried");
        m2.setFont(new Font("Raleway", Font.BOLD, 14));
        m2.setBackground(new Color(222, 255, 223));
        m2.setBounds(450, 400, 100, 30);
        add(m2);

        m3 = new JRadioButton("Others");
        m3.setFont(new Font("Raleway", Font.BOLD, 14));
        m3.setBackground(new Color(222, 255, 223));
        m3.setBounds(635, 400, 100, 30);
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);



        JLabel labelAdd = new JLabel("Adress :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setBounds(100, 450, 200, 30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 450, 400, 30);
        add(textAdd);

        JLabel labelCity = new JLabel("City :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setBounds(100, 500, 200, 30);
        add(labelCity);

        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 500, 400, 30);
        add(textCity);

        JLabel labelPin = new JLabel("Pin Code :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setBounds(100, 550, 200, 30);
        add(labelPin);

        textPin = new JTextField();
        textPin.setFont(new Font("Raleway", Font.BOLD, 14));
        textPin.setBounds(300, 550, 400, 30);
        add(textPin);

        JLabel labelstate = new JLabel("State :");
        labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
        labelstate.setBounds(100, 600, 200, 30);
        add(labelstate);

        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 600, 400, 30);
        add(textState);

        next = new JButton("NEXT >");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 650, 100, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = textName.getText();
        String fname = textFName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

        String gender = null;
        if(r1.isSelected()) gender = "Male";
        else if (r2.isSelected()) gender = "Female";

        String email = textEmail.getText();

        String martial = null;
        if(m1.isSelected()) martial = "married";
        else if (m2.isSelected()) martial = "unmarried";
        else if (m3.isSelected()) martial = "others";

        String adress = textAdd.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try{
            if(textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "fill all the field");
            }
            else{
                Conn conn1 = new Conn();
                String q = "Insert into signup values('"+formNo+"', '"+name+"','"+fname+"', '"+dob+"','"+gender+"','"+email+"','"+martial+"','"+adress+"','"+city+"','"+pincode+"','"+state+"')";
                conn1.statement.executeUpdate(q);
                new Signup2(formNo);
                setVisible(false);
            }

        }catch(Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup();
    }
}
