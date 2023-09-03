package SoftwareAWT.src.com.mypack.LearnAwt;

import java.awt.*;

public class AwtComp extends Frame {

    public AwtComp() {
        setTitle("Welcome to Awt components ;");
        setSize(580, 300);
        setLocation(400, 200);
        setVisible(true);
        setLayout(new FlowLayout());
        setBackground(Color.black);
        setForeground(Color.orange);

        TextArea t1 = new TextArea();

        Checkbox c1 = new Checkbox("BCA");
        Checkbox c2 = new Checkbox("MCA");
        Checkbox c3 = new Checkbox("BBA");
        Checkbox c4 = new Checkbox("MBA");

        CheckboxGroup cg = new CheckboxGroup();
        Checkbox m = new Checkbox("Male", cg, false);
        Checkbox f = new Checkbox("Female", cg, false);

        Choice place = new Choice();
        place.add("Lucknow");
        place.add("Kanpur");
        place.add("Delhi");
        place.add("Varanasi");
        place.add("Jhansi");

        List l1 = new List();
        for (int i = 0; i <= 10; i++)
            l1.add("" + i);

        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(l1);
        add(f);
        add(m);
        add(place);
        add(t1);

    }

    public static void main(String[] args) {
        new AwtComp();
    }
}
