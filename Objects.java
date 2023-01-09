import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

 class Objects extends JButton implements MouseListener, MouseMotionListener {
	 
	 panel FatherPanel;
	 ImageIcon image1;
	 int num;
	 int turned = 0;
	
	     String Oben;
		String Unten;
		String Rechts;
		String Links ;
		
		
	    String Path;
	    
	    public Objects() {
	    	
	    }
public Objects(String path, String oben, String unten, String rechts, String links, int n){
	super();
	this.num = n;
	image1 = new ImageIcon(path);
	image1.setImage(image1.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT));
	 Path = path;
	 Oben = oben;
	 Unten = unten;
	 Rechts= rechts;
	 Links = links;
	this.setBorder(BorderFactory.createLineBorder(Color.gray));
	this.setSize(250,250);
	this.setIcon(image1);
	this.addMouseListener(this);
	this.addMouseMotionListener(this);
}
@Override
public void mouseClicked(MouseEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource().getClass() == this.getClass()) {
	this.setBackground(Color.black);
	
	
	}
}
@Override
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
}
@Override
public void mouseDragged(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void mouseMoved(MouseEvent e) {
	// TODO Auto-generated method stub
	
}
 }
