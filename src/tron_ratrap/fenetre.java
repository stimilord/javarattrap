package tron_ratrap;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class fenetre extends JFrame{
	private player player = new player();
	int x;
	int x2;
	int y;
	int y2;
	boolean playeralive = true;
	boolean playeralive2 = true;
	int vitesseX;
	int vitesseY;
	int p = 0;
	int p2 = 0;
	int a = 0;
	int b = 0;
	int v = 20;
	ArrayList<Integer> t = new ArrayList<Integer>();

	ArrayList<Integer> t2 = new ArrayList<Integer>();
	

	
	public fenetre() {
		this.setTitle("Tron");
		this.setSize(400,600);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.black);
		
		
		this.setContentPane(player);
		this.setVisible(true);
		x = player.getPosX();
		y = player.getPosY();
		x2 = player.getPosX2();
		y2 = player.getPosY2();
		go();
		move();
	
		}
	public void crash() {
		
			
			//if (player.rect[0][player.getPosX()] == 1 && player.rect[1][player.getPosX()] == 1) ;
			
		
	}
	private void move() {
		x = player.getPosX();
		y = player.getPosY();
		
		t.add(0);
		t2.add(0);
		t.add(0);
		t2.add(0);
		
		while(playeralive && playeralive2 == true){
			if(player.getPosX() < 0 || player.getPosY() < 0 || player.getPosX() > 375 || player.getPosY() > 560 )playeralive=false;
			if(player.getPosX2() < 0 || player.getPosY2() < 0 || player.getPosX2() > 375 || player.getPosY2() > 560 )playeralive2=false;
			
			
			for(int i=a;i>0;i--){
				if(t.get(i).equals(player.getPosX()) && t2.get(i).equals(player.getPosY()))
	            {
					playeralive=false;
					System.out.println("mo");
	            }
			}
			for(int i=a;i>0;i--){
				if(t.get(i).equals(player.getPosX2()) && t2.get(i).equals(player.getPosY2()))
	            {
					playeralive2=false;
					System.out.println("mo");
	            }
			}
			
			t.add(player.getPosX());
			t2.add(player.getPosY());
			t.add(player.getPosX2());
			t2.add(player.getPosY2());
			
			//if(t.get(a).equals(player.getPosX()) && t2.get(a) == t2.get(a))playeralive=false;
			
			
			a++;
			
			/*t1[player.getPosX()] = 1;
			t2[player.getPosY()] = 1;
			*/
		
		if( p == 0){
			try {
				Thread.sleep(v);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			player.setPosY(y = y-2);
			player.repaint();
			
		}
		if( p == 1){
			try {
				Thread.sleep(v);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			player.setPosX(x = x+2);
			player.repaint();
		}
		if( p == 2){
			try {
				Thread.sleep(v);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			player.setPosY(y = y+2);
			player.repaint();
		}
		if( p == 3){
			try {
				Thread.sleep(v);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			player.setPosX(x = x-2);
			player.repaint();
		}
		
		if( p2 == 0){
			try {
				Thread.sleep(v);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			player.setPosY2(y2 = y2-2);
			player.repaint();
		}
		if( p2 == 1){
			try {
				Thread.sleep(v);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			player.setPosX2(x2 = x2+2);
			player.repaint();
		}
		if( p2 == 2){
			try {
				Thread.sleep(v);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			player.setPosY2(y2 = y2+2);
			player.repaint();
		}
		if( p2 == 3){
			try {
				Thread.sleep(v);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			player.setPosX2(x2 = x2-2);
			player.repaint();
		}
		
	} 
		if(playeralive == false){
		JOptionPane mess = new JOptionPane();
		JOptionPane.showMessageDialog(null,"Victoire du bleue","Victoire",JOptionPane.INFORMATION_MESSAGE);
}else if(playeralive2 == false){
	JOptionPane mess = new JOptionPane();
	JOptionPane.showMessageDialog(null,"Victoire du rouge","Victoire",JOptionPane.INFORMATION_MESSAGE);
}}
	private void go(){
		 
		
		
		addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (playeralive && playeralive2 == true){
					if (e.getKeyCode() == KeyEvent.VK_LEFT) {
						if( p == 0){
							p=3;
							
						}
						else if( p == 1){
							p--;
						
						}
						else if( p == 2){
							p--;
						
						}
						else if( p == 3){
							p--;
							
						}
					}
					else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
						if( p == 0){
							p++;	
						}
						else if( p == 1){
							p++;
							
						}
						else if( p == 2){
							p++;
						
						}
						else if( p == 3){
							p=0;
						
						}
						
					}
					if (e.getKeyCode() == KeyEvent.VK_Q) {
						if( p2 == 0){
							p2=3;
							
						}
						else if( p2 == 1){
							p2--;
						
						}
						else if( p2 == 2){
							p2--;
						
						}
						else if( p2 == 3){
							p2--;
							
						}
					}
					else if (e.getKeyCode() == KeyEvent.VK_D) {
						if( p2 == 0){
							p2++;	
						}
						else if( p2 == 1){
							p2++;
							
						}
						else if( p2 == 2){
							p2++;
						
						}
						else if( p2 == 3){
							p2=0;
						
						}
						
					}
					
				}
			}
			
			//public void keyReleased(KeyEvent e) {
			//}
		});
	
		
		}

}
