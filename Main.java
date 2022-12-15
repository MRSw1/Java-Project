import java.awt.* ;
import javax.swing.*;
import java.awt.event.*;


public class Main 
{
 

	 public static void main ( String[] args )
	  {
	MeinFrame frame = new MeinFrame("TestS");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   frame.setSize(750,750);
	   frame.setVisible(true);
	   frame.setResizable(false);
	   GridLayout mylayout = new GridLayout(3,3);
	   frame.setLayout(mylayout);
	  }
	}
