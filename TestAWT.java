import java.awt.*;
public class TestAWT
{
TestAWT()
{
	Frame f=new Frame("sycs");
	Label l=new Label(" Welcome To Java");
	f.add(l);
	f.setSize(200,300);
	f.setVisible(true);
}
public static void main(String args[])
{
	TestAWT a=new TestAWT();
}
}
