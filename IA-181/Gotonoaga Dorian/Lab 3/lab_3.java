import java.awt.*;
import java.awt.event.*;
import java.lang.annotation.*;
import java.lang.instrument.Instrumentation;
import java.util.*;
import javax.annotation.*;
import javax.swing.*;
public class lab_3 {
    public static void main(String[] arg){
    	MyFrame ff = new MyFrame();
    	ff.setVisible(true);
    }
}

class Time {
	private Date dat;
	Time() {
		this.setTime();
	}
	public void setTime() {
		dat = new Date();
	}
	public Date getTime() {
		return dat;
	}
	public String getPeriod() {
		String str = "noapte";
		int h = dat.getHours();
		if (h > 5 && h<11) str = "dimineata";
		if (h>=11 && h<16) str = "ziua";
		if (h>=16 && h<20) str = "seara";
		
		return str;
	}
}

class File {
	protected String com;
//  private Date dat;
	protected String user;
	protected Time dat;
	protected String dimension;
	
	File() {
		
	}
	
	File(String com, String user, Time dat) {
		this.com=com; 
		this.user=user;
		this.dat=dat;
	}
	
	public String fileDimension(String com, String user, Time dat) {
		String str = "0 KB";
		int dimension;
		File f = new File(com, user, dat);
		
		str = "Size: " + com.length() + user.length();
		
		System.out.println(str);
		return str;
	}
	
}

class MyAnnotation extends File implements Generated {
    
    public MyAnnotation(){
        this.setAnnotation();
    }
    public MyAnnotation(String cCom, String uUser){
        this.setAnnotation(cCom, uUser);
    }
    public void setAnnotation(){
        com = "Introduceti comentariul!";
        user = "Introduceti numele autorul!";
        dat = new Time();
        dimension = fileDimension(com, user, dat);
    }
    public void setAnnotation(String cCom,String uUser){
        com = cCom;
        user = uUser;
        dat = new Time();
        dimension = fileDimension(com, user, dat);
    }
    public String date() {
        return dat.getTime().toString() + ", " + dat.getPeriod();
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
        output += "Dimension: " + dimension + "bytes \n";
        output += "==========================\n";
        return output;
    }
    public Class <? extends Annotation>  annotationType() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
     public String[] value() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

class MyFrame extends JFrame {
	private JTextArea history;
    private JPanel left, center, right;
    private JTextField user;
    private JTextArea com;
    private JLabel dat;
    private MyAnnotation ts;
    
    public MyFrame(){
        this.setTitle("Laborator 3");
        this.setSize(800, 500);
        this.setLocation(300, 300);        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ts = new MyAnnotation();
        user = new JTextField(ts.users(),10);
        left = new JPanel();
        Box b1 = Box.createVerticalBox();
        JButton but = new JButton("Submit");
        but.addActionListener(new ActionListener(){
        	public void actionPerformed(ActionEvent e){
        		System.out.println("aa");                
        		ts.setAnnotation(com.getText(), user.getText());
        		dat.setText("Data: "+ts.date());                
        		history.setText(history.getText()+ts.getAnnotation());
            }  
        });
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
        center.setBackground(Color.LIGHT_GRAY);        
        this.add(center,BorderLayout.CENTER);
        right = new JPanel();
        history = new JTextArea(ts.getAnnotation(),20,20);
        right.add(history);
        this.add(right,BorderLayout.EAST);
    }
}

/*
 * Concluzii: 
 * 
 * Scopul acestei lucraru de laborator a fost de insusire a principiilor clasei, precum si initiere in lucrul cu obiecte grafice.
 * 
 * Programul contine clasa de baza MyAnnotation ce extinde clasa File.
 * 
 * De asemenea, clasa in clasa MyAnnotation se initializeaza un obiect de tip Time,
 * astfel simulandu-se mostenirea multipla.
 * 
 */
