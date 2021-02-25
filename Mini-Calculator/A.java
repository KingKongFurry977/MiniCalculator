import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class A extends Applet implements ActionListener
{
    int k,l;
    Double a,b,c;
    TextField t1;
    String s,s1,s2,s3,s4,s5,s6;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
    Button add,sub,mul,div,mod,clr,eq,un;

    public void init()
    {
        setBackground(Color.blue);
        t1=new TextField(15);
        b0=new Button("0");
        b1=new Button("1");
        b2=new Button("2");
        b3=new Button("3");
        b4=new Button("4");
        b5=new Button("5");
        b6=new Button("6");
        b7=new Button("7");
        b8=new Button("8");
        b9=new Button("9");
        b10=new Button(".");
        add=new Button("+");
        sub=new Button("-");
        mul=new Button("*");
        div=new Button("/");
        mod=new Button("%");
        clr=new Button("CLEAR");
        clr.setForeground(Color.red);
        un=new Button("UNDO");
        un.setBackground(Color.green);
        eq=new Button("=");

        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(mod);
        add(div);
        add(b4);
        add(b5);
        add(b6);
        add(mul);
        add(sub);
        add(b7);
        add(b8);
        add(b9);
        add(add);
        add(eq);
        add(b0);
        add(b10);
        add(clr);
        add(un);

        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        mod.addActionListener(this);
        eq.addActionListener(this);
        clr.addActionListener(this);
        un.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        s=e.getActionCommand();
        if(s.equals(".")||s.equals("0")||s.equals("1")||s.equals("2")||s.equals("3")||s.equals("4")||s.equals("5")||s.equals("6")||s.equals("7")||s.equals("8")||s.equals("9"))
        {
            s1=t1.getText()+s;
            t1.setText(s1);
        }
        if(s.equals("UNDO"))
        {
            l=Integer.parseInt(s1)/10;
            t1.setText(""+l);
        }
        if(s.equals("+"))
        {
            s2=t1.getText();
            t1.setText("");
            s3="+";
        }
        if(s.equals("-"))
        {
            s2=t1.getText();
            t1.setText("");
            s3="-";
        }
        if(s.equals("*"))
        {
            s2=t1.getText();
            t1.setText("");
            s3="*";
        }
        if(s.equals("/"))
        {
            s2=t1.getText();
            t1.setText("");
            s3="/";
        }
        if(s.equals("%"))
        {
            s2=t1.getText();
            t1.setText("");
            s3="%";
        }
        if(s.equals("="))
        {
            s4=t1.getText();
            a=Double.parseDouble(s2);
            b=Double.parseDouble(s4);
            if(s3.equals("+"))
            {
                c=a+b;
            }
            if(s3.equals("-"))
            {
                c=a-b;
            }
            if(s3.equals("*"))
            {
                c=a*b;
            }
            if(s3.equals("/"))
            {
                c=a/b;
            }
            if(s3.equals("%"))
            {
                c=a%b;
            }
            t1.setText(""+c);
        }
        if(s.equals("CLEAR"))
        {
            t1.setText("");
        }
    }
}

/* <applet CODE="A.class" width=150 height=170></applet> */