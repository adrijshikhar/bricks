
import java.awt.*;
public class Bullet extends Thread{
	int i;
	int x1;
	Bullet(int x1){
		this.x1=x1;
	}
public void run() {
	Button b=new Button();
	MyFrame.contentPane.add(b);
	
	try {
	for(i=641;i>=0;i-=10)
	{
		new Score(x1,i,b);
		Thread.sleep(25);
		b.setBounds(x1, i, 10, 10);
	}
	b.setVisible(false);
}
catch(Exception e1)
{
}
}

}
