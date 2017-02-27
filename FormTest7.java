import javax.swing.*;
import java.awt.*;

class FormTest7 extends JFrame{
    JLabel name1,name2,name3,name4,name5,name6,name7;
    JButton b;
    public FormTest7(Point p){
        setLocation(p);
        name1 = new JLabel("Here You Go!");
        name1.setBounds(350, 20, 300, 50);
        this.add(name1);

        name2 = new JLabel("Name: "+FormTest.username);
        name2.setBounds(20, 100, 500, 50);
        this.add(name2);

        name3 = new JLabel("Selected Place: "+FormTest3.district);
        name3.setBounds(20, 150, 500, 50);
        this.add(name3);

        name4 = new JLabel("Selected Spot: "+FormTest4.spotname);
        name4.setBounds(20, 200, 500, 50);
        this.add(name4);

        name5 = new JLabel("Selected Hotel: "+FormTest5.hotel);
        name5.setBounds(20, 250, 500, 50);
        this.add(name5);

        name6 = new JLabel("Distance: "+DBMethod.distance());
        name6.setBounds(20, 300, 500, 50);
        this.add(name6);

        System.out.println(FormTest6.noOfPerson+" "+Integer.valueOf(DBMethod.busFare()));
        int totalFare=Integer.valueOf(FormTest5.hotelfare)+FormTest6.noOfPerson*Integer.valueOf(DBMethod.busFare());
        name7 = new JLabel("Total Cost: "+totalFare);
        name7.setBounds(20, 350, 500, 50);
        this.add(name7);

        b = new JButton("Finish!");
        b.setBounds(320, 510, 100, 30);
        this.add(b);
        b.addActionListener(e->
        {
            this.dispose();

        });

        this.setSize(800, 600);
        this.setLayout(null);
        this.setVisible(true);
    }
}