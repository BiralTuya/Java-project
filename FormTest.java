import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.Statement;

class FormTest extends JFrame {
    static String username;
    JLabel namelabel1, namelabel2, namelabel3, namelabel4;
    JTextField text1;
    JButton btn1, btn2;
    JPasswordField pf;

    public FormTest() {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        // Determine the new location of the window
        int w = this.getSize().width;
        int h = this.getSize().height;
        int x = (dim.width-w)/2;
        int y = (dim.height-h)/2;

        // Move the window
        this.setLocation(x, y);


        namelabel1 = new JLabel("Welcome to The World of Traveling");
        namelabel1.setBounds(20, 100, 600, 20);
        this.add(namelabel1);

        namelabel2 = new JLabel("username:");
        namelabel2.setBounds(20, 180, 100, 20);
        this.add(namelabel2);

        text1 = new JTextField();
        text1.setBounds(20, 220, 300, 28);
        this.add(text1);

        namelabel3 = new JLabel("password:");

        this.add(namelabel3);
        namelabel3.setBounds(20, 270, 100, 20);

        pf = new JPasswordField();
        pf.setBounds(20, 310, 300, 28);
        this.add(pf);

        namelabel4 = new JLabel("Don't have an account yet? Creat now!");
        namelabel4.setBounds(20, 410, 300, 20);
        this.add(namelabel4);
        btn1 = new JButton("Sign In");
        btn1.addActionListener(e->
        {
            DBMethod.login(text1.getText(),pf.getText());

            if (DBMethod.login(text1.getText(),pf.getText())==true) {
                username=text1.getText();
                new FormTest3(this.getLocation());
                this.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "Username or Password incorrect");
            }

        });

        btn1.setBounds(210, 360, 100, 40);
        this.add(btn1);

        btn2 = new JButton("Sign Up");
        btn2.setBounds(20, 440, 100, 40);
        this.add(btn2);
        btn2.addActionListener(e->
        {
            new FormTest2(this.getLocation());

            this.setVisible(false);
        });

        this.setSize(800, 600);
        this.setLayout(null);
        this.setVisible(true);

    }
    public static void main(String[] args) {
        new FormTest();
        //Connection con=DB.getConnection();
        //Statement statement;

    }
}