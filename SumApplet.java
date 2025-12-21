import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class SumApplet extends Applet implements ActionListener{
    TextField t1,t2,t3;
    Button b;
    Label l1,l2,l3;
    int sum=0;

    public void init(){
        t1=new TextField();
        t2=new TextField();
        t3=new TextField();
        b=new Button("Add");
        l1=new Label("First Number:");
        l2=new Label("Second Number");
        l3=new Label("Sum");
        

        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b);
        b.addActionListener(this);
        
    }

    public void actionPerformed(ActionEvent e){
        int a=Integer.parseInt(t1.getName());
        int b=Integer.parseInt(t2.getName());
        sum = a+b;
        t3.setText(String.valueOf(sum));
    }
}
