package week13;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IndepClassListener extends JFrame {
	public IndepClassListener() {
		setTitle("Action �̺�Ʈ ������ ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn = new JButton("Action");
		btn.addActionListener(new MyActionListener()); 
		c.add(btn);
		
		setSize(250,120);
		setVisible(true);		
	}
	public static void main(String [] args) {
		new IndepClassListener();
	}
} 

class MyActionListener implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource(); 
		if(e.getActionCommand().equals("Action"))
			b.setText("�׼�");
		else
			b.setText("Action");			
	}
}