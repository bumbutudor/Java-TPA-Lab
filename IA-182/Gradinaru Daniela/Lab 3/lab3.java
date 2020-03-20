package danielatap3;
import java.awt.*; 
import javax.swing.*; 
import java.awt.event.*; 
class Lucrator
{
  String nume,prenume;double salariu;
  public Lucrator(String nume, String prenume,double salariu)
  {
    this.nume=nume;
    this.prenume=prenume;
    this.salariu=salariu;
  }
  
}

class Politist extends Lucrator
{
  int stagiu;
  public Politist(String nume, String prenume,double salariu,int stagiu)
  {
    super(nume,prenume,salariu);
    this.stagiu=stagiu;
  }
  public double salariufinal()
  {
    double salariufinal=salariu;
    for(int i=0;i<stagiu;i++)
    {
      salariufinal+=salariu*0.05;
    }
    return salariufinal;
  }
  
}
class Profesor extends Lucrator
{
  int stagiu;
  public Profesor(String nume, String prenume,double salariu,int stagiu)
  {
    super(nume,prenume,salariu);
    this.stagiu=stagiu;
  }
  public double salariufinal()
  {
    double salariufinal=salariu;
    for(int i=0;i<stagiu;i++)
    {
      salariufinal+=salariu*0.04;
    }
    return salariufinal;
  }
  
}

class Medic extends Lucrator
{
  int stagiu;
  public Medic(String nume, String prenume,double salariu,int stagiu)
  {
    super(nume,prenume,salariu);
    this.stagiu=stagiu;
  }
  public double salariufinal()
  {
    double salariufinal=salariu;
    for(int i=0;i<stagiu;i++)
    {
      salariufinal+=salariu*0.07;
    }
    return salariufinal;
  }
}
class Demo extends JFrame { 
  
    // Declaration of object of JRadioButton class. 
    JRadioButton jRadioButton1; 
  
    // Declaration of object of JRadioButton class. 
    JRadioButton jRadioButton2; 
    JRadioButton jRadioButton3; 
    // Declaration of object of JButton class. 
    JButton jButton;
    JButton jButton1;
  
    // Declaration of object of ButtonGroup class. 
    ButtonGroup G1; 
  
    // Declaration of object of  JLabel  class. 
    JLabel L1; 
    JLabel o1;
    JLabel o2;
    JLabel o3;
    JLabel o4;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
     JTextArea com;
  
    // Constructor of Demo class. 
    public Demo() 
    { 
  
        // Setting layout as null of JFrame. 
        this.setLayout(null); 
  
        // Initialization of object of "JRadioButton" class. 
        jRadioButton1 = new JRadioButton(); 
  
        // Initialization of object of "JRadioButton" class. 
        jRadioButton2 = new JRadioButton(); 
        jRadioButton3 = new JRadioButton(); 
  
        // Initialization of object of "JButton" class. 
        jButton = new JButton("Click"); 
  
        // Initialization of object of "ButtonGroup" class. 
        G1 = new ButtonGroup(); 
  
        // Initialization of object of " JLabel" class. 
        L1 = new JLabel("Alegeti profesia"); 
  
        
        jRadioButton1.setText("Medic"); 
  
        
        jRadioButton2.setText("Politist"); 
  
        jRadioButton3.setText("Profesor"); 
        // Setting Bounds of "jRadioButton2". 
        jRadioButton1.setBounds(120, 30, 120, 50); 
  
        // Setting Bounds of "jRadioButton4". 
        jRadioButton2.setBounds(250, 30, 80, 50); 
        jRadioButton3.setBounds(380, 30, 150, 50); 
  
        // Setting Bounds of "jButton". 
        jButton.setBounds(125, 90, 80, 30); 
        
  
        // Setting Bounds of JLabel "L2". 
        L1.setBounds(20, 30, 150, 50); 
  
        // "this" keyword in java refers to current object. 
        // Adding "jRadioButton2" on JFrame. 
        this.add(jRadioButton1); 
  
        // Adding "jRadioButton4" on JFrame. 
        this.add(jRadioButton2); 
        this.add(jRadioButton3); 
  
        // Adding "jButton" on JFrame. 
        
  
        // Adding JLabel "L2" on JFrame. 
        this.add(L1); 
  
        // Adding "jRadioButton1" and "jRadioButton3" in a Button Group "G2". 
        G1.add(jRadioButton1); 
        G1.add(jRadioButton2); 
        G1.add(jRadioButton3);
       
    o1=new JLabel("Nume");
    o2=new JLabel("Prenume");
    o3=new JLabel("Stagiu");
    t1 = new JTextField(5); 
    t2 = new JTextField(5);
    t3 = new JTextField(5);
     o1.setBounds(20, 150, 50, 25);
     t1.setBounds(80, 150, 60, 25); 
    this.add(o1);
    this.add(t1);
    
     o2.setBounds(150, 150, 70, 25); 
     t2.setBounds(210, 150, 60, 25); 
    this.add(o2);
    this.add(t2);
    
     o3.setBounds(280, 150, 50, 25); 
     t3.setBounds(350, 150, 60, 25); 
    this.add(o3);
    this.add(t3);
    
    jButton1=new JButton("Calculeaza");
    jButton1.setBounds(20, 200, 200, 30);
    this.add(jButton1);
    com=new JTextArea("");
    com.setBounds(20,240,500,300);
    this.add(com);
        // Adding Listener to JButton. 
        
        
        jButton1.addActionListener(new ActionListener() { 
            // Anonymous class. 
  
            public void actionPerformed(ActionEvent e) 
            { 
                // Override Method 
  
                // Declaration of String class Objects. 
                String qual = " "; 
                String a1=t1.getText();
                String b1=t2.getText();
                
              
                int c=Integer.parseInt(t3.getText());
  
                // If condition to check if jRadioButton2 is selected. 
                if (jRadioButton1.isSelected()) { 
             
           Medic med=new Medic(a1,b1,7000,c);
           
           com.selectAll();
         com.replaceSelection("");
         com.append("\nMedic\n");
           com.append("Nume=");
           com.append(med.nume);
           com.append("\nPrenume=");
           com.append(med.prenume);
           
         com.append("\nSalariu initial=");
          
           com.append(Double.toString(7000));
           com.append("\n Salariu final=");
           com.append(Double.toString(med.salariufinal()));
                    
                } 
  
                else if (jRadioButton2.isSelected()) { 
                     Politist pol=new Politist(a1,b1,6000,c);
                       
                       com.selectAll();
                     com.replaceSelection("");
                     com.append("\nPolitist\n");
                       com.append("Nume=");
                       com.append(pol.nume);
                       com.append("\nPrenume=");
                       com.append(pol.prenume);
                       
                     com.append("\nSalariu initial=");
                      
                       com.append(Double.toString(6000));
                       com.append("\n Salariu final=");
                       com.append(Double.toString(pol.salariufinal()));
                   
                } 
                else { 
                     Profesor prof=new Profesor(a1,b1,6500,c);
                       
                       com.selectAll();
                     com.replaceSelection("");
                     com.append("\nProfesor\n");
                       com.append("Nume=");
                       com.append(prof.nume);
                       com.append("\nPrenume=");
                       com.append(prof.prenume);
                       
                     com.append("\nSalariu initial=");
                      
                       com.append(Double.toString(6500));
                       com.append("\n Salariu final=");
                       com.append(Double.toString(prof.salariufinal()));
                
                } 
  
                // MessageDialog to show information selected radion buttons. 
               
            }
        });
    } 
} 
public class labtap3 {

      // Driver code. 
      public static void main(String args[]) 
      { // Creating object of demo class. 
          Demo f = new Demo(); 
    
          // Setting Bounds of JFrame. 
          f.setBounds(100, 100, 800, 700); 
    
          // Setting Title of frame. 
          f.setTitle("RadioButtons"); 
    
          // Setting Visible status of frame as true. 
          f.setVisible(true); 
      } 
}
