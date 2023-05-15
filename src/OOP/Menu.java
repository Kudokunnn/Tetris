package OOP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;


import javax.swing.*; 

//hi
	public class Menu extends JFrame {
		private static final long serialVersionUID = 1L;
		
		public void initmenu(){
			JFrame frame = new JFrame("Tetris");
			JLabel jl=new JLabel();
			JPanel panel = new JPanel();
			panel.setLayout(new GridBagLayout());
			JLabel label = new JLabel("Tetris");
			JButton button = new JButton();
			JButton rules=new JButton();
			rules.setText("Rules");
			GridBagConstraints gbc=new GridBagConstraints();
		      
		    gbc.gridx = 0;  
		    gbc.gridy = 0;  
			
		    panel.add(label,gbc);
			
			button.setText("Play");
			gbc.gridx = 0;  
			gbc.gridy = 1;  
			panel.add(button,gbc);
			gbc.gridx = 0;  
			gbc.gridy = 2; 
			panel.add(rules,gbc);
			
			frame.add(panel);
			frame.setSize(400,800);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
			jl.setIcon(new ImageIcon("download.png"));
			validate();
		
			button.addActionListener(new Action());
			rules.addActionListener(new Seerules());
		}		
		static class Seerules implements ActionListener{
			@Override
			public void actionPerformed(ActionEvent b) {
				JOptionPane.showMessageDialog(null,"When the line is full, it disappears and you get 1 point\n\n Press 'left' to move the piece left\n Press 'right' to move the piece right\n Press 'up' to rotate the piece clockwise\n Press 'down' to rotate the piece anticlockwise\n Press'd' to drop the piece to the bottom");
			}
		}
		
		static class Action implements ActionListener{
			@Override
		public void actionPerformed(ActionEvent e) 
		{
			SwingUtilities.invokeLater(new Runnable() 
			{

				@Override
				public void run() 
				{				
					Tetris game = new Tetris();
					
					
					game.setVisible(true);
			
				}
			});	
		}
		}


		public static void main(String[] args) 
		{
			Menu a=new Menu();
			a.initmenu();
		}
	}
