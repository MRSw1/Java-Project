import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class MeinFrame extends JFrame implements MouseListener, MouseMotionListener, WindowListener
{
Objects selectedbutton;
Image image1;
Boolean select = false;
panel temppanel;
ImageIcon image;
	int x,y;
	Objects button1 = new Objects("1.png", "braun hinten", "weiß vorne", "grau vorne", "schwarz hinten",1);
	   Objects button2 = new Objects("2.png", "schwarz hinten", "grau vorne", "braun vorne", "weiß hinten",2);
	  Objects button3= new Objects("3.png", "weiß hinten", "grau vorne", "schwarz vorne", "grau hinten",3);
	   Objects button4= new Objects("4.png", "braun vorne", "schwarz hinten", "schwarz vorne", "weiß hinten",4);
	   Objects button5= new Objects("5.png", "grün vorne", "gelb hinten", "schwarz vorne", "weiß hinten",5);
	   Objects button6= new Objects("6.png", "grün vorne", "gelb hinten", "schwarz vorne", "weiß hinten",6);
	   Objects button7= new Objects("7.png", "grün vorne", "gelb hinten", "schwarz vorne", "weiß hinten",7);
	   Objects button8= new Objects("8.png", "grün vorne", "gelb hinten", "schwarz vorne", "weiß hinten",8);
	   Objects button9= new Objects("9.png", "grün vorne", "gelb hinten", "schwarz vorne", "weiß hinten",9);
	   
	   
	   panel panel1;
	   panel panel2;
	   
  public MeinFrame( String title )
  {
   super(title);
   addWindowListener(this);
  
    panel1 = new panel(1);
   this.add(panel1);
   panel2 = new panel(2);
   this.add(panel2);
   panel panel3 = new panel(3);
   this.add(panel3);
   panel panel4 = new panel(4);
   this.add(panel4);
   panel panel5 = new panel(5);
   this.add(panel5);
   panel panel6 = new panel(6);
   this.add(panel6);
   panel panel7 = new panel(7);
   this.add(panel7);
   panel panel8 =new panel(8);
   this.add(panel8);
   panel panel9 = new panel(9);
   this.add(panel9);

   
   button1.addMouseListener(this);
   button1.addMouseMotionListener(this);
   button2.addMouseListener(this);
   button2.addMouseMotionListener(this);
   button3.addMouseListener(this);
   button3.addMouseMotionListener(this);
   button4.addMouseListener(this);
   button4.addMouseMotionListener(this);
   button5.addMouseListener(this);
   button5.addMouseMotionListener(this);
   button6.addMouseListener(this);
   button6.addMouseMotionListener(this);
   button7.addMouseListener(this);
   button7.addMouseMotionListener(this);
   button8.addMouseListener(this);
   button8.addMouseMotionListener(this);
   button9.addMouseListener(this);
   button9.addMouseMotionListener(this);
   

   panel1.add(button1);
   button1.FatherPanel = panel1;
   panel1.SonButton = button1;
   
   panel2.add(button2);
   button2.FatherPanel = panel2;
   panel2.SonButton = button2;
   
   panel3.add(button3);
   button3.FatherPanel = panel3;
   panel3.SonButton = button3;
   
   panel4.add(button4);
   button4.FatherPanel = panel4;
   panel4.SonButton = button4;
   
   panel5.add(button5);
   button5.FatherPanel = panel5;
   panel5.SonButton = button5;
   
   panel6.add(button6);
   button6.FatherPanel = panel6;
   panel6.SonButton = button6;
   
   panel7.add(button7);
   button7.FatherPanel = panel7;
   panel7.SonButton = button7;
   
   panel8.add(button8);
   button8.FatherPanel = panel8;
   panel8.SonButton = button8;
   
   panel9.add(button9);
   button9.FatherPanel = panel9;
   panel9.SonButton = button9;
   
 
   
}
  
  
	  public static BufferedImage rotateImage(BufferedImage imagetorotate) {
		  int widthOfImage = imagetorotate.getWidth();
	        int heightOfImage = imagetorotate.getHeight();
	        int typeOfImage = imagetorotate.getType();
	        
	        BufferedImage newImageFromBuffer = new BufferedImage(widthOfImage, heightOfImage, typeOfImage);

	        Graphics2D graphics2D = newImageFromBuffer.createGraphics();

	        graphics2D.rotate(Math.toRadians(90), widthOfImage / 2, heightOfImage / 2);
	        graphics2D.drawImage(imagetorotate, null, 0, 0);
 
	        return newImageFromBuffer;	
	  }
	  
	  
	  public void turn(Objects O) {
		  try {

	            BufferedImage originalImage = ImageIO.read(new File(O.Path));
O.turned +=1;

if(O.turned == 4)
{
	O.turned = 0;
}
	            BufferedImage subImage = rotateImage(originalImage);

	            File rotatedImageFile = new File(O.Path);

	            ImageIO.write(subImage, "png", rotatedImageFile);
	           
	           
	        	
	            O.setIcon(new ImageIcon(subImage));
	            
	 
	           
	        } catch (IOException h) {
	            h.printStackTrace();
	         
	        }
	  }


	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	
		if(select == false) {
		 if(e.getSource() == button1) {
			 selectedbutton = button1;
//			 button1.setBorder(BorderFactory.createLoweredBevelBorder());
		 }
		 else if(e.getSource() == button2) {
			 selectedbutton = button2;
//			 button2.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else if(e.getSource() == button3) {
			 selectedbutton = button3;			 
//			 button3.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else  if(e.getSource() == button4) {
			 selectedbutton = button4;
//			 button4.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else if(e.getSource() == button5) {
			 selectedbutton = button5;
//			 button5.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else  if(e.getSource() == button6) {
			 selectedbutton = button6;
//			 button6.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else  if(e.getSource() == button7) {
			 selectedbutton = button7;			
//			 button7.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else if(e.getSource() == button8) {
			 selectedbutton = button8;
//			 button8.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 else if(e.getSource() == button9) {
			 selectedbutton = button9;
//			 button9.setBorder(BorderFactory.createLineBorder(Color.red));
		 }
		 selectedbutton.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
			select = true;
		}
		else {
			
			if(e.getSource() == selectedbutton) {
				selectedbutton.FatherPanel.remove(selectedbutton);
				turn(selectedbutton);
				selectedbutton.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.repaint();
				selectedbutton.FatherPanel.revalidate();
				System.out.println(selectedbutton.turned);
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button1) {
				button1.FatherPanel.remove(button1);
				button1.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button1);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button1.FatherPanel;
				button1.FatherPanel = temppanel;
				temppanel = null;
		
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button2) {
				button2.FatherPanel.remove(button2);
				button2.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button2);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button2.FatherPanel;
				button2.FatherPanel = temppanel;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button3) {
				button3.FatherPanel.remove(button3);
				button3.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button3);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button3.FatherPanel;
				button3.FatherPanel = temppanel;
				temppanel = null;
			
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button4) {
				button4.FatherPanel.remove(button4);
				button4.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button4);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button4.FatherPanel;
				button4.FatherPanel = temppanel;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button5) {
				button5.FatherPanel.remove(button5);
				button5.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button5);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button5.FatherPanel;
				button5.FatherPanel = temppanel;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button6) {
				button6.FatherPanel.remove(button6);
				button6.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button6);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button6.FatherPanel;
				button6.FatherPanel = temppanel;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button7) {
				button7.FatherPanel.remove(button7);
				button7.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button7);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button7.FatherPanel;
				button7.FatherPanel = temppanel;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button8) {
				button8.FatherPanel.remove(button8);
				button8.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button8);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button8.FatherPanel;
				button8.FatherPanel = temppanel;
				temppanel = null;
				
			}
			else if(e.getSource() != selectedbutton && e.getSource() == button9) {
				button9.FatherPanel.remove(button9);
				button9.FatherPanel.add(selectedbutton);
				selectedbutton.FatherPanel.remove(selectedbutton);
				selectedbutton.FatherPanel.add(button9);
				temppanel = selectedbutton.FatherPanel;
				selectedbutton.FatherPanel = button9.FatherPanel;
				button9.FatherPanel = temppanel;
				temppanel = null;
				
			}
			
			select = false;
			selectedbutton.setBorder(null);
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
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public void turnback(Objects object)
	{
		while(object.turned!= 0)
		{
			System.out.println("turnback once");
			turn(object);
			
		}
	}


	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		  turnback(button1);
		  turnback(button2);
		  turnback(button3);
		  turnback(button4);
		  turnback(button5);
		  turnback(button6);
		  turnback(button7);
		  turnback(button8);
		  turnback(button9);
		System.exit(0);
	}


	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
		  
	}


	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}

 
	

	