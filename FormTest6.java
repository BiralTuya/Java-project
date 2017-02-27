import javax.swing.*;
import java.awt.*;

class FormTest6 extends JFrame{
    static int noOfPerson;
    JLabel namelabel17,namelabel18,namelabel19,namelabel20;
    JComboBox cm1;
    JButton btn10,btn11;
    public FormTest6(Point p){
        setLocation(p);

        namelabel17 = new JLabel("Buy Tickets");
        namelabel17.setBounds(350, 20, 300, 50);
        this.add(namelabel17);


        namelabel18 = new JLabel("Fare per person(By Bus): ");
        namelabel18.setBounds(20, 100, 300, 50);
        this.add(namelabel18);

        namelabel20 = new JLabel(DBMethod.busFare()+"/=  ");
        namelabel20.setBounds(200, 100, 300, 50);
        this.add(namelabel20);

        namelabel19 = new JLabel("Select Person:  ");
        namelabel19.setBounds(20, 150, 300, 50);
        this.add(namelabel19);

        cm1= new JComboBox();
        this.add(cm1);
        cm1.setBounds(20,200,300,30);

        int i;
        for(i=1;i<=5;i++){
            cm1.addItem(i);
        }

        btn10 = new JButton("Back");
        btn10.setBounds(20, 510, 100, 30);
        this.add(btn10);
        btn10.addActionListener(e->
        {
            new FormTest5(this.getLocation());
            this.setVisible(false);

        });


        btn11 = new JButton("Next");
        btn11.setBounds(600, 510, 100, 30);
        this.add(btn11);
        btn11.addActionListener(e->
        {
            //System.out.println(cm1.getSelectedItem());
            noOfPerson= (int) cm1.getSelectedItem();
            //System.out.println(noOfPerson);
                new FormTest7(this.getLocation());
                this.setVisible(false);



        });


        this.setSize(800, 600);
        this.setLayout(null);
        this.setVisible(true);

    }
}