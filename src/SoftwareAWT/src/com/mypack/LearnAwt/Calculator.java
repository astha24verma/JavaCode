package SoftwareAWT.src.com.mypack.LearnAwt;

import java.awt.*;
import java.awt.event.*;

public class Calculator extends Frame implements ActionListener {
    Label l1, l2, l3;
    TextField t1, t2, t3;
    Button b1, b2, b3, b4;

    Calculator() {
        setTitle("Arithmetic Calculator");
        setBackground(Color.ORANGE);
        setLayout(new FlowLayout());
        setLocation(100, 100);
        setSize(300, 500);
        setVisible(true);
        setFont(new Font("Century Gothic", Font.PLAIN, 22));


        l1 = new Label("Value 1 : ");
        l2 = new Label("Value 2 : ");
        l3 = new Label("Result :       ");

        t1 = new TextField(18);
        t2 = new TextField(18);
        t3 = new TextField(18);

        b1 = new Button("Addition");
        b2 = new Button("Subtraction");
        b3 = new Button("Multiplication");
        b4 = new Button("Division");

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);

        add(b1);
        add(b2);
        add(b3);
        add(b4);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double a, b, res;
        a = Double.parseDouble(t1.getText());
        b = Double.parseDouble(t2.getText());

        if (ae.getSource() == b1) {
            res = a + b;
            t3.setText(String.valueOf(res));
            l3.setText(b1.getLabel());
        } else if (ae.getSource() == b2) {
            res = a - b;
            t3.setText(String.valueOf(res));
            l3.setText(b2.getLabel());
        } else if (ae.getSource() == b3) {
            res = a * b;
            t3.setText(String.valueOf(res));
            l3.setText(b3.getLabel());
        } else {
            res = a / b;
            t3.setText(String.valueOf(res));
            l3.setText(b4.getLabel());
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
