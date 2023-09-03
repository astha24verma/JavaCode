//Task 2: WAP to input Number and Term, after Click on a
//        Button Print Table up to specified term using List
//        Component.(Frame,Label, TextField, Button, List)
package SoftwareAWT.src.com.mypack.LearnAwt;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AwtTable extends Frame implements ActionListener {

    Label l1, l2;
    TextField t1, t2;
    Button b1;
    List l;
    AwtTable(){
        setTitle("Table Calculator");
        setSize(260, 500);
        setVisible(true);
        setLayout(new FlowLayout());
        setLocation(300,50);
        setBackground(Color.pink);
        setFont(new Font("Century Gothic",Font.PLAIN,16));

        l1 = new Label("Enter Number :");
        l2 = new Label("Enter Term :");
        t1 = new TextField(8);
        t2 = new TextField(8);
        b1 = new Button("Print Table");
        l = new List(18);

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);

        b1.addActionListener(this);

    }

    public void actionPerformed(ActionEvent ae){
        int n = Integer.parseInt(t1.getText());
        int t = Integer.parseInt(t2.getText());
        l.removeAll();
        if (ae.getSource() == b1){
            for (int i = 1; i <= t; i++ ){
                l.add(String.valueOf(n +" x "+i+" = "+n * i));
            }
            add(l);
        }
    }

    public static void main(String[] args) {
        new AwtTable();
    }
}
