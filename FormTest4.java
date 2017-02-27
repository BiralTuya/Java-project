import javax.swing.*;
import java.awt.*;


class FormTest4 extends JFrame{
    static String spotname;
    JLabel namelabel11,namelabel12;
    JRadioButton r1,r2,r3;
    JButton btn6,btn7;
    public FormTest4(Point p){


        this.setLocation(p);
        namelabel12 = new JLabel(FormTest3.district);
        //spotname=r1.getText();

        namelabel12.setBounds(350, 20, 300, 50);
        this.add(namelabel12);

        namelabel11 = new JLabel("Which Place do you want to visit??");
        namelabel11.setBounds(20, 50, 300, 50);
        this.add(namelabel11);
        String[] rs=DBMethod.place();
        ButtonGroup bg1 = new ButtonGroup();
        r1 = new JRadioButton();
        r1.setText(rs[0]);
        r1.setBounds(20, 110, 300, 20);
        this.add(r1);
        bg1.add(r1);

        r2 = new JRadioButton();
        r2.setBounds(20, 160, 300, 20);
        r2.setText(rs[1]);
        this.add(r2);
        bg1.add(r2);

        r3 = new JRadioButton();
        r3.setBounds(20, 210, 300, 20);
        r3.setText(rs[2]);
        this.add(r3);
        bg1.add(r3);

        btn6 = new JButton("Back");
        btn6.setBounds(20, 510, 100, 30);
        this.add(btn6);
        btn6.addActionListener(e->
        {
            new FormTest3(this.getLocation());
            this.setVisible(false);

        });

        btn7 = new JButton("Next");
        btn7.setBounds(600, 510, 100, 30);
        this.add(btn7);
        btn7.addActionListener(e->
        {

            if(r1.isSelected())
            {   spotname=r1.getText();
                new FormTest5(this.getLocation());

                this.setVisible(false);

            }
            else if(r2.isSelected())
            {   spotname=r2.getText();
                new FormTest5(this.getLocation());

                this.setVisible(false);
            }
            else if(r3.isSelected())
            {   spotname=r3.getText();
                new FormTest5(this.getLocation());

                this.setVisible(false);
                //javac -cp .;./connector.jar test2.java
                //java -cp .;./connector.jar test2
            }
            else
               {
                   JOptionPane.showMessageDialog(this,"All fields are not filled");
                }
        });

        this.setSize(800,600);
        this.setLayout(null);
        this.setVisible(true);
    }
}