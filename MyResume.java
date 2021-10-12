import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MyResume extends JResume{
  
 JLabel label1,label2,label3,label4,label5;
 JTextField t1,t2;
 JRadioButton male,female;
 JComboBox day,month,year;
 JTextArea ta1;
 JButton submit;
 JLabel msg;


  MyResume(){
    setTitle("Resume of Applay Form");
    setSize(700,500);
    setLocationRelativeTo(null);
    setDefultCloseOperation(EXIT_ON_CLOSE);
    Container c=getContentPane();
    c.setLayout(null);

    labell=new JLabel("Name");
    labell.setBound(20,50,100,20);
    c.add(labell);

    t1=new JTextFied();
    t1.setBounds(130,50,100,20);
    c.add(t1);
   
    labell=new JLabel("Mobile");
    labell.setBound(20,100,100,20);
    c.add(label2);

    t1=new JTextFied();
    t1.setBounds(130,50,100,20);
    c.add(t2);

    label3=new JLabel("Gander");
    label3.setBound(20,150);
    c.add(label3);

    male=new JRadioButton("Male");
    female=new JRadioBoutton("Female");
    
    male.setBound(130,150,80,20);
    female.setBound(220,150,80,20);
    male.setSelectes(true);
    
    c.add(male);
    c.add(female);

    ButtonGroup gen=new ButtonGroup();
    gen.add(male);
    gen.add(female);
    
    label4=new JLabel("DOB");
    label4.setBounds(20,200,100,20);
    c.add(label4);
    
    String days[]=("1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23",
     "24","25","26","27","28","29","30","31");
    String months[]={"Jan","Feb","Mar","Apr","May","Jun","July","Aug","Sep","Oct","Nov","Dec"};
    String years[]=("2021","2020","2019","2018","2017","2016","2015","2014","2013","2012","2011","2010","2009","2008","2007","2006","2005","2004","2003","2002","2001","2000","1999","1998","1997","1996","1995","1994","1993");

    day=new JComboBox(days);
    month=new JComboBox(months);
    year=new JComboBox(years);  

    day.setBounds(130,200,50,20);
    month.setBounds(190,200,50,20);
    year.setBounds(250,200,60,20);

    f.add(day);
    f.add(month);
    f.add(year);

    label5=new JLabel("Address");
    label5.setBound(20,250,100,20);
    c.add(label5);
    
    ta1=new JTextArea();
    ta1.setBounds(50,300,250,20);
    c.add(ta1);
   
     setVisible(true);
    
   }
}