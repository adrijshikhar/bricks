import java.awt.*;
import java.util.*;

public class Score {
	int xs, ys; Button b;
	Score(){
		
	}
	Score(int xs,int ys,Button b)
{	this.b=b;
		this.xs=xs;
		this.ys=ys;
}

public void score() {
	
	Iterator<Integer> bxs1=MyFrame.bxs.iterator();  
	Iterator<Integer> bys1=MyFrame.bys.iterator();  
	while(bxs1.hasNext()) {
	if (Math.abs((bxs1.next()-xs))<=60 && ys-bys1.next()==60) {
		b.setVisible(false);
		
	}
}
}
}
