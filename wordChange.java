import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class wordChange extends JFrame{
	String s = "Love Java";
	private JLabel la = new JLabel(s);
	
	public wordChange() {
		setTitle("한문자씩 글자 회전하기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		la.addKeyListener(new MyKeyListener());
		la.setLocation(200,200);
		la.setSize(100,20);
		la.setFont(new Font("", Font.BOLD, 15));	//라벨의 폰트 크기를 잘보이게 하기 위해 폰트 객체를 생성해서 볼드, 15 사이즈로 해주었다.
		
		c.add(la);
		setSize(500,500);
		setVisible(true);
		c.setBackground(new Color(255,209,241));	
		
		la.setFocusable(true);
		la.requestFocus();	
	}

	class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) { // e.getSource()가 필요없는 이유는 la, s를 멤버변수로 해서 사용가능하기 때문
			if(e.getKeyCode() == KeyEvent.VK_LEFT) {
				s = s.substring(1) + s.substring(0,1);	//1위치부터 끝까지 자른 문자열 + 0부터 1까지 자른 문자열
				la.setText(s);
				
			}
		}
	}
	
	public static void main(String [] args) {
		new wordChange();
	}
}
