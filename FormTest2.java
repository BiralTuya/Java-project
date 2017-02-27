import javax.swing.*;
import java.awt.*;

class FormTest2 extends JFrame{
    JLabel namelabel5, namelabel6, namelabel7, namelabel8,namelabel9;
    JTextField text2,text3,text4;
    JPasswordField pf2;
    JButton btn3;
    public FormTest2(Point p){

        this.setLocation(p);

        namelabel5 = new JLabel("Sign up for free!");
        namelabel5.setBounds(20, 50, 300, 50);
        this.add(namelabel5);

        namelabel6 = new JLabel("First Name:");
        namelabel6.setBounds(20, 110, 300, 50);
        this.add(namelabel6);

        text2 = new JTextField();
        text2.setBounds(20, 150, 300, 28);
        this.add(text2);

        namelabel7 = new JLabel("Last Name:");
        namelabel7.setBounds(20, 200, 300, 50);
        this.add(namelabel7);

        text3 = new JTextField();
        text3.setBounds(20, 240, 300, 28);
        this.add(text3);

        namelabel8 = new JLabel("UserName:");
        namelabel8.setBounds(20, 290, 300, 50);
        this.add(namelabel8);

        text4 = new JTextField();
        text4.setBounds(20, 330, 300, 28);
        this.add(text4);

        namelabel9 = new JLabel("Password:");
        namelabel9.setBounds(20, 380, 300, 50);
        this.add(namelabel9);

        pf2 = new JPasswordField();
        pf2.setBounds(20, 420, 300, 28);
        this.add(pf2);

        btn3 = new JButton("Done!");
        btn3.setBounds(220, 470, 100, 30);
        this.add(btn3);

        btn3.addActionListener(e->
        {


            if(text2.getText().isEmpty() || text3.getText().isEmpty()||text4.getText().isEmpty()||pf2.getText().isEmpty())

            {
                //JOptionPane option =new JOptionPane("All fields are not filled");
                JOptionPane.showMessageDialog(this,"All fields are not filled");

            }
            else {
                FormTest.username=text4.getText();
                new FormTest3(this.getLocation());
                this.setVisible(false);
            }
            DBMethod.signup(text2.getText(),text3.getText(),text4.getText(),pf2.getText());


        });


        this.setSize(800,600);
        this.setLayout(null);
        this.setVisible(true);

    }

}