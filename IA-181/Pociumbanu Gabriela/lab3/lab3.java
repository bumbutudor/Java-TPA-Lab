/*
5.Annotation, astfel încât să se poată deduce timpul in secunde de la ultima modificare a  annotaţiei.
 */

package lab3;

import javax.annotation.Generated;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class lab3 {
    public static void main(String[] arg){
        MyFrame ff = new MyFrame();
        ff.setVisible(true);
    }
}

class MyAnnotation implements Generated {
    private String com;
    private Date dat;
    private String user;

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
        output += "  \n";
        return output;
    }
    public Class <? extends Annotation>  annotationType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    public String[] value() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

//Clasa Annotation extinde clasa MyAnnotation, si adauga timpul de la ultima modificare a anotatiei
class Annotation extends MyAnnotation {
    private long lStartTime;
    private long lEndTime;

    @Override
    public void setAnnotation() {
        lStartTime = new Date().getTime();
    }
    @Override
    public void setAnnotation(String cCom, String uUser) {
        lStartTime = new Date().getTime();
    }

    @Override
    public String getAnnotation(){
        lEndTime = new Date().getTime();
        String output = "Time from previous modification in sec: " + ((lEndTime - lStartTime)/1000) + "\n";
        output += "====================================\n";
        lStartTime = new Date().getTime();
        return output;
    }

}

class MyFrame extends JFrame {
    private JTextArea history;
    private JPanel left, center, right;
    private JTextField user;
    private JTextArea com;
    private JLabel dat;
    private MyAnnotation ts;
    private Annotation tin;

    public MyFrame(){
        this.setTitle("Lab_3");
        this.setSize(600, 500);
        this.setLocation(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ts = new MyAnnotation();
        tin = new Annotation();
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
}

/*
In aceasta lucrare de laborator am avut ca sarcina sa modific clasa MyAnnotation in asa mod ca la rulare sa se
calculeze diferenta de timp de la fiecare modificare. Initial nu-mi prea reusea. Deoarece nu cunosteam cum sa calculez
timpul( aveam idei, dar nu stiam cum s-o implementez) + mi-a luat ceva timp sa inteleg programul.
Dar la final am indeplinit sarcina destul de bine, cred eu. Am lucrat cu suprascriere si cu principiile de mostenire.
 */