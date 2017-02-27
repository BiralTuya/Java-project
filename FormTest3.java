import javax.swing.*;
import java.awt.*;

class FormTest3 extends JFrame{
    static String district;
    JLabel namelabel10;
    JRadioButton rb1,rb2,rb3,rb4,rb5;
    JRadioButton rb6,rb7,rb8,rb9,rb10;
    JRadioButton rb11,rb12,rb13,rb14,rb15;
    JRadioButton rb16,rb17,rb18,rb19,rb20;
    JRadioButton rb21,rb22,rb23,rb24,rb25;
    JRadioButton rb26,rb27,rb28,rb29,rb30;
    JRadioButton rb31,rb32,rb33,rb34,rb35;
    JRadioButton rb36,rb37,rb38,rb39,rb40;
    JRadioButton rb41,rb42,rb43,rb44,rb45;
    JRadioButton rb46,rb47,rb48,rb49,rb50;
    JRadioButton rb51,rb52,rb53,rb54,rb55;
    JRadioButton rb56,rb57,rb58,rb59,rb60;
    JRadioButton rb61,rb62,rb63,rb64;
    JButton btn4,btn5;
    public FormTest3(Point p){
        this.setLocation(p);
        namelabel10 = new JLabel("Choose for Travel");
        namelabel10.setBounds(20, 50, 300, 50);
        this.add(namelabel10);

        ButtonGroup bg = new ButtonGroup();
        rb1 = new JRadioButton("DHAKA");
        rb1.setBounds(20, 100, 100, 20);
        this.add(rb1);
        bg.add(rb1);

        rb2 = new JRadioButton("RAJBARI");
        rb2.setBounds(150, 100, 100, 20);
        this.add(rb2);
        bg.add(rb2);

        rb3 = new JRadioButton("CHANDPUR");
        rb3.setBounds(300, 100, 100, 20);
        this.add(rb3);
        bg.add(rb3);

        rb4 = new JRadioButton("KUSHTIA");
        rb4.setBounds(450, 100, 100, 20);
        this.add(rb4);
        bg.add(rb4);

        rb5 = new JRadioButton("RANGPUR");
        rb5.setBounds(600, 100, 100, 20);
        this.add(rb5);
        bg.add(rb5);

        rb6 = new JRadioButton("FARIDPUR");
        rb6.setBounds(20, 130, 100, 20);
        this.add(rb6);
        bg.add(rb6);

        rb7 = new JRadioButton("SHARIATPUR");
        rb7.setBounds(150, 130, 100, 20);
        this.add(rb7);
        bg.add(rb7);

        rb8 = new JRadioButton("COMILLA");
        rb8.setBounds(300, 130, 100, 20);
        this.add(rb8);
        bg.add(rb8);

        rb9 = new JRadioButton("MAGURA");
        rb9.setBounds(450, 130, 100, 20);
        this.add(rb9);
        bg.add(rb9);

        rb10 = new JRadioButton("DINAJPUR");
        rb10.setBounds(600, 130, 100, 20);
        this.add(rb10);
        bg.add(rb10);

        rb11 = new JRadioButton("GAZIPUR");
        rb11.setBounds(20, 160, 100, 20);
        this.add(rb11);
        bg.add(rb11);

        rb12 = new JRadioButton("SHERPUR");
        rb12.setBounds(150, 160, 100, 20);
        this.add(rb12);
        bg.add(rb12);

        rb13 = new JRadioButton("COX'S BAZAR");
        rb13.setBounds(300, 160, 100, 20);
        this.add(rb13);
        bg.add(rb13);

        rb14 = new JRadioButton("MEHERPUR");
        rb14.setBounds(450, 160, 100, 20);
        this.add(rb14);
        bg.add(rb14);

        rb15 = new JRadioButton("GAIBANDHA");
        rb15.setBounds(600, 160, 100, 20);
        this.add(rb15);
        bg.add(rb15);

        rb16 = new JRadioButton("GOPALGANJ");
        rb16.setBounds(20, 190, 100, 20);
        this.add(rb16);
        bg.add(rb16);

        rb17 = new JRadioButton("TANGAIL");
        rb17.setBounds(150, 190, 100, 20);
        this.add(rb17);
        bg.add(rb17);

        rb18 = new JRadioButton("FENI");
        rb18.setBounds(300, 190, 100, 20);
        this.add(rb18);
        bg.add(rb18);

        rb19 = new JRadioButton("NARAIL");
        rb19.setBounds(450, 190, 100, 20);
        this.add(rb19);
        bg.add(rb19);

        rb20 = new JRadioButton("KURIGRAM");
        rb20.setBounds(600, 190, 100, 20);
        this.add(rb20);
        bg.add(rb20);

        rb21 = new JRadioButton("JAMALPUR");
        rb21.setBounds(20, 220, 100, 20);
        this.add(rb21);
        bg.add(rb21);

        rb22 = new JRadioButton("BARISHAL");
        rb22.setBounds(150, 220, 100, 20);
        this.add(rb22);
        bg.add(rb22);

        rb23 = new JRadioButton("KHAGRACHHARI");
        rb23.setBounds(300, 220, 100, 20);
        this.add(rb23);
        bg.add(rb23);

        rb24 = new JRadioButton("SHATKHIRA");
        rb24.setBounds(450, 220, 100, 20);
        this.add(rb24);
        bg.add(rb24);

        rb25 = new JRadioButton("KISHOREGANJ");
        rb25.setBounds(600, 220, 100, 20);
        this.add(rb25);
        bg.add(rb25);

        rb26 = new JRadioButton("BARGUNA");
        rb26.setBounds(20, 250, 100, 20);
        this.add(rb26);
        bg.add(rb26);

        rb27 = new JRadioButton("LAKSHMIPUR");
        rb27.setBounds(150, 250, 100, 20);
        this.add(rb27);
        bg.add(rb27);

        rb28 = new JRadioButton("RAJSHAHI");
        rb28.setBounds(300, 250, 100, 20);
        this.add(rb28);
        bg.add(rb28);

        rb29 = new JRadioButton("LALMONIRHAT");
        rb29.setBounds(450, 250, 100, 20);
        this.add(rb29);
        bg.add(rb29);

        rb30 = new JRadioButton("NILPHAMARI");
        rb30.setBounds(600, 250, 100, 20);
        this.add(rb30);
        bg.add(rb30);

        rb31 = new JRadioButton("MADARIPUR");
        rb31.setBounds(20, 280, 100, 20);
        this.add(rb31);
        bg.add(rb31);

        rb32 = new JRadioButton("BHOLA");
        rb32.setBounds(150, 280, 100, 20);
        this.add(rb32);
        bg.add(rb32);

        rb33 = new JRadioButton("NOAKHALI");
        rb33.setBounds(300, 280, 100, 20);
        this.add(rb33);
        bg.add(rb33);

        rb34 = new JRadioButton("BOGRA");
        rb34.setBounds(450, 280, 100, 20);
        this.add(rb34);
        bg.add(rb34);

        rb35 = new JRadioButton("PANCHAGARH");
        rb35.setBounds(600, 280, 100, 20);
        this.add(rb35);
        bg.add(rb35);

        rb36 = new JRadioButton("MANIKGANJ");
        rb36.setBounds(20, 310, 100, 20);
        this.add(rb36);
        bg.add(rb36);

        rb37 = new JRadioButton("JHALOKATI");
        rb37.setBounds(150, 310, 100, 20);
        this.add(rb37);
        bg.add(rb37);

        rb38 = new JRadioButton("RANGAMATI");
        rb38.setBounds(300, 310, 100, 20);
        this.add(rb38);
        bg.add(rb38);

        rb39 = new JRadioButton("CHAPAINABANGANJ");
        rb39.setBounds(450, 310, 100, 20);
        this.add(rb39);
        bg.add(rb39);

        rb40 = new JRadioButton("THAKURGAON");
        rb40.setBounds(600, 310, 100, 20);
        this.add(rb40);
        bg.add(rb40);

        rb41 = new JRadioButton("MUNSHIGANJ");
        rb41.setBounds(20, 340, 100, 20);
        this.add(rb41);
        bg.add(rb41);

        rb42 = new JRadioButton("PATUAKHALI");
        rb42.setBounds(150, 340, 100, 20);
        this.add(rb42);
        bg.add(rb42);

        rb43 = new JRadioButton("KHULNA");
        rb43.setBounds(300, 340, 100, 20);
        this.add(rb43);
        bg.add(rb43);

        rb44 = new JRadioButton("JOYPURHAT");
        rb44.setBounds(450, 340, 100, 20);
        this.add(rb44);
        bg.add(rb44);

        rb45 = new JRadioButton("SYLHET");
        rb45.setBounds(600, 340, 100, 20);
        this.add(rb45);
        bg.add(rb45);

        rb46 = new JRadioButton("MYMENSINGH");
        rb46.setBounds(20, 370, 100, 20);
        this.add(rb46);
        bg.add(rb46);

        rb47 = new JRadioButton("PIROJPUR");
        rb47.setBounds(150, 370, 100, 20);
        this.add(rb47);
        bg.add(rb47);

        rb48 = new JRadioButton("BAGERHAT");
        rb48.setBounds(300, 370, 100, 20);
        this.add(rb48);
        bg.add(rb48);

        rb49 = new JRadioButton("PABNA");
        rb49.setBounds(450, 370, 100, 20);
        this.add(rb49);
        bg.add(rb49);

        rb50 = new JRadioButton("HABIGANJ");
        rb50.setBounds(600, 370, 100, 20);
        this.add(rb50);
        bg.add(rb50);

        rb51 = new JRadioButton("NARAYANGANJ");
        rb51.setBounds(20, 400, 100, 20);
        this.add(rb51);
        bg.add(rb51);

        rb52 = new JRadioButton("CHITTAGONG");
        rb52.setBounds(150, 400, 100, 20);
        this.add(rb52);
        bg.add(rb52);

        rb53 = new JRadioButton("CHUADANGA");
        rb53.setBounds(300, 400, 100, 20);
        this.add(rb53);
        bg.add(rb53);

        rb54 = new JRadioButton("NAOGAON");
        rb54.setBounds(450, 400, 100, 20);
        this.add(rb54);
        bg.add(rb54);

        rb55 = new JRadioButton("MAULVIBAZAR");
        rb55.setBounds(600, 400, 100, 20);
        this.add(rb55);
        bg.add(rb55);

        rb56 = new JRadioButton("NARSHINGDI");
        rb56.setBounds(20, 430, 100, 20);
        this.add(rb56);
        bg.add(rb56);

        rb57 = new JRadioButton("BANDARBAN");
        rb57.setBounds(150, 430, 100, 20);
        this.add(rb57);
        bg.add(rb57);

        rb58 = new JRadioButton("JESSORE");
        rb58.setBounds(300, 430, 100, 20);
        this.add(rb58);
        bg.add(rb58);

        rb59 = new JRadioButton("NATORE");
        rb59.setBounds(450, 430, 100, 20);
        this.add(rb59);
        bg.add(rb59);

        rb60 = new JRadioButton("SUNAMGANJ");
        rb60.setBounds(600, 430, 100, 20);
        this.add(rb60);
        bg.add(rb60);

        rb61 = new JRadioButton("NETROKONA");
        rb61.setBounds(20, 460, 100, 20);
        this.add(rb61);
        bg.add(rb61);

        rb62 = new JRadioButton("BANDARBAR");
        rb62.setBounds(150, 460, 100, 20);
        this.add(rb62);
        bg.add(rb62);

        rb63 = new JRadioButton("JHENAIDAH");
        rb63.setBounds(300, 460, 100, 20);
        this.add(rb63);
        bg.add(rb63);

        rb64 = new JRadioButton("SHIRAJGANJ");
        rb64.setBounds(450, 460, 100, 20);
        this.add(rb64);
        bg.add(rb64);

        btn4 = new JButton("Back");
        btn4.setBounds(20, 510, 100, 30);
        this.add(btn4);
        btn4.addActionListener(e->
        {
            new FormTest2(this.getLocation());
            this.setVisible(false);

        });

        btn5 = new JButton("Next");
        btn5.setBounds(600, 510, 100, 30);
        this.add(btn5);
        btn5.addActionListener(e->

        {
            System.out.println(this.getLocation().getX()+" "+this.getLocation().getY());
            if(rb1.isSelected()) {
                district=rb1.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);
            }
            else if(rb2.isSelected())
            {
                district=rb2.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb3.isSelected())
            {
                district=rb3.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb4.isSelected())
            {
                district=rb4.getText();
                new FormTest4(this.getLocation());

                this.setVisible(false);

            }
            else if(rb5.isSelected())
            {
                district=rb5.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb6.isSelected())
            {
                district=rb6.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb7.isSelected())
            {
                district=rb7.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb8.isSelected())
            {
                district=rb8.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb9.isSelected())
            {
                district=rb9.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb10.isSelected())
            {
                district=rb10.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb11.isSelected())
            {
                district=rb11.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb12.isSelected())
            {
                district=rb12.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb13.isSelected())
            {
                district=rb13.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb14.isSelected())
            {
                district=rb14.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb15.isSelected())
            {
                district=rb15.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }else if(rb16.isSelected())
            {
                district=rb16.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }else if(rb17.isSelected())
            {
                district=rb17.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb18.isSelected())
            {
                district=rb18.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb19.isSelected())
            {
                district=rb19.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb20.isSelected())
            {
                district=rb20.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb21.isSelected())
            {
                district=rb21.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb22.isSelected())
            {
                district=rb22.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb23.isSelected())
            {
                district=rb23.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb24.isSelected())
            {
                district=rb24.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb25.isSelected())
            {
                district=rb25.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb26.isSelected())
            {
                district=rb26.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb27.isSelected())
            {
                district=rb27.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb28.isSelected())
            {
                district=rb28.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb29.isSelected())
            {
                district=rb29.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb30.isSelected())
            {
                district=rb30.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb31.isSelected())
            {
                district=rb31.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb32.isSelected())
            {
                district=rb32.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb33.isSelected())
            {
                district=rb33.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb34.isSelected())
            {
                district=rb34.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb35.isSelected())
            {
                district=rb35.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb36.isSelected())
            {
                district=rb36.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb37.isSelected())
            {
                district=rb37.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb38.isSelected())
            {
                district=rb38.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb39.isSelected())
            {
                district=rb39.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb40.isSelected())
            {
                district=rb40.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb41.isSelected())
            {
                district=rb41.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb42.isSelected())
            {
                district=rb42.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb43.isSelected())
            {
                district=rb43.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb44.isSelected())
            {
                district=rb44.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb45.isSelected())
            {
                district=rb45.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb46.isSelected())
            {
                district=rb46.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb47.isSelected())
            {
                district=rb47.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb48.isSelected())
            {
                district=rb48.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb49.isSelected())
            {
                district=rb49.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb50.isSelected())
            {
                district=rb50.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb51.isSelected())
            {
                district=rb51.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb52.isSelected())
            {
                district=rb52.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb53.isSelected())
            {
                district=rb53.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb54.isSelected())
            {
                district=rb54.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb55.isSelected())
            {
                district=rb55.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb56.isSelected())
            {
                district=rb56.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb57.isSelected())
            {
                district=rb57.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb58.isSelected())
            {
                district=rb58.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb59.isSelected())
            {
                district=rb59.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb60.isSelected())
            {
                district=rb60.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb61.isSelected())
            {
                district=rb61.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb62.isSelected())
            {
                district=rb62.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb63.isSelected())
            {
                district=rb63.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

            }
            else if(rb64.isSelected())
            {
                district=rb64.getText();
                new FormTest4(this.getLocation());
                this.setVisible(false);

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