import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class wordChange extends JFrame{
	String s = "Love Java";
	private JLabel la = new JLabel(s);
	
	public wordChange() {
		setTitle("�ѹ��ھ� ���� ȸ���ϱ�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		la.addKeyListener(new MyKeyListener());
		la.setLocation(200,200);
		la.setSize(100,20);
		la.setFont(new Font("", Font.BOLD, 15));	//���� ��Ʈ ũ�⸦ �ߺ��̰� �ϱ� ���� ��Ʈ ��ü�� �����ؼ� ����, 15 ������� ���־���.
		
		c.add(la);
		setSize(500,500);
		setVisible(true);
		c.setBackground(new Color(255,209,241));	
		
		la.setFocusable(true);
		la.requestFocus();	
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) { // e.getSource()�� �ʿ���� ������ la, s�� ��������� �ؼ� ��밡���ϱ� ����
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				s = s.substring(1) + s.substring(0,1);	//1��ġ���� ������ �ڸ� ���ڿ� + 0���� 1���� �ڸ� ���ڿ�
				la.setText(s);
				
			}
		}
	}
	
	public static void main(String [] args) {
		new wordChange();
	}
}
