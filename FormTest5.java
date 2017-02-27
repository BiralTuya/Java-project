import javax.swing.*;
import java.awt.*;

class FormTest5 extends JFrame{
    static String hotel,hotelfare;
    JLabel namelabel13,namelabel14,namelabel15,namelabel16;
    JButton btn8,btn9;
    public FormTest5(Point p ){
        setLocation(p);
        System.out.println(FormTest4.spotname);
        namelabel13 = new JLabel(FormTest4.spotname);
        namelabel13.setBounds(350, 20, 300, 50);
        this.add(namelabel13);

        namelabel14 = new JLabel("Recommended Hotel");
        namelabel14.setBounds(20, 50, 300, 50);
        this.add(namelabel14);
        String[] rs=DBMethod.hotel();
        //String[] rs2=DBMethod.hotel();
        namelabel15 = new JLabel();
        namelabel15.setBounds(20, 160, 300, 20);
        namelabel15.setText(rs[0]);
        hotel=rs[0];
        this.add(namelabel15);

        namelabel16 = new JLabel();
        namelabel16.setBounds(200, 160, 100, 20);
        namelabel16.setText(rs[1]+"/=");
        hotelfare=rs[1];
        this.add(namelabel16);

        namelabel15 = new JLabel();
        namelabel15.setBounds(20, 160, 100, 20);
        namelabel15.setText(rs[0]);
        this.add(namelabel15);

        btn8 = new JButton("Back");
        btn8.setBounds(20, 510, 100, 30);
        this.add(btn8);
        btn8.addActionListener(e->
        {
            new FormTest4(this.getLocation());
            this.setVisible(false);

        });

        btn9 = new JButton("Next");
        btn9.setBounds(600, 510, 100, 30);
        this.add(btn9);
        btn9.addActionListener(e->
        {

                new FormTest6(this.getLocation());
                this.setVisible(false);


        });

        this.setSize(800,600);
        this.setLayout(null);
        this.setVisible(true);
    }
}