package lab3;

import java.awt.*;
import java.awt.event.*;
import java.lang.annotation.*;
import java.util.*;
import java.util.concurrent.TimeUnit;
import javax.annotation.*;
import javax.swing.*;

public class lab3 {
    public static void main(String[] arg){
        MyFrame ff = new MyFrame();
        ff.setVisible(true);
    }}

class MyAnnotation implements Generated {
    public MyAnnotation(){
        this.setAnnotation();
    }
    public MyAnnotation(String cCom, String uUser){
        this.setAnnotation(cCom, uUser);
    }
    public void setAnnotation(){
        com = "I like quarantine!";
        user = "Gabi";
        dat = new Date();
    }
    public void setAnnotation(String cCom, String uUser){
        com = cCom;
        user = uUser;
        dat = new Date();
    }
    public String date() {
        return dat.toString();
    }
    public String comments() {
        return com;
    }
    public String users(){
        return user;
    }
    public String getAnnotation(){
        String output;
        output = "Autor: " + user + "\n";
        output += "Text: " + com + "\n";
        output += "Data: " + date() + "\n";
        return output;
    }
    private String com;
    private Date dat;
    private String user;
    public Class <? extends Annotation>  annotationType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public String[] value() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class Extindere extends MyAnnotation {
    private long lStartTime = new Date().getTime();
    @Override
    public void setAnnotation() {
        super.setAnnotation();
        try {
            calculation();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void setAnnotation(java.lang.String cCom, java.lang.String uUser) {
        super.setAnnotation(cCom, uUser);
        try {
            calculation();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public long time() {
        long lEndTime = new Date().getTime();
        return (lEndTime - lStartTime)/1000;
    }
    @Override
    public String getAnnotation(){
        String output = "Time from previous modification in sec: " + time() + "\n";
        output += "====================================\n";
        return output;
    }
    private static void calculation() throws InterruptedException {
        //Sleep 2 seconds
        TimeUnit.SECONDS.sleep(2);
    }
}

class MyFrame extends JFrame {
    public MyFrame(){
        this.setTitle("LBJ2");
        this.setSize(600, 500);
        this.setLocation(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ts = new MyAnnotation();
        Extindere tin = new Extindere();
        user = new JTextField(ts.users(),10);
        left = new JPanel();
        Box b1 = Box.createVerticalBox();
        JButton but = new JButton("Submit");
        but.addActionListener(new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.out.println("aa");
                        ts.setAnnotation(com.getText(), user.getText());
                        dat.setText("Data: "+ts.date());
                        history.setText(history.getText()+ ts.getAnnotation()+tin.getAnnotation());
                    }  });
        user = new JTextField(ts.users(),5);
        dat = new JLabel("Data: "+ts.date());
        b1.add(new JLabel("Autor:"));
        b1.add(user);
        b1.add(dat);
        b1.add(but);
        left.add(b1);
        this.add(left,BorderLayout.WEST);
        center = new JPanel();
        com = new JTextArea(ts.comments(),20,20);
        center.add(com);
        center.setBackground(Color.red);
        this.add(center,BorderLayout.CENTER);
        right = new JPanel();
        history = new JTextArea(ts.getAnnotation(),20,20);
        right.add(history);
        this.add(right,BorderLayout.EAST);
    }
    private JTextArea history;
    private JPanel left, center, right;
    private JTextField user;
    private JTextArea com;
    private JLabel dat;
    private MyAnnotation ts;
}

/* In aceasta lucrare de laborator am avut ca sarcina sa modific clasa MyAnnotation in asa mod ca la rulare sa se
calculeze diferenta de timp de la fiecare modificare. Initial nu-mi prea reusea. Deoarece nu cunosteam cum sa calculez
timpul( aveam idei, dar nu stiam cum s-o implementez) + mi-a luat ceva timp sa inteleg programul.
Dar la final am indeplinit sarcina destul de bine, cred eu. Am lucrat cu suprascriere si cu principiile de mostenire.
 */