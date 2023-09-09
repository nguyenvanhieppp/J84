package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.counterListener;
import model.ngMau;

public class view extends JFrame{
	private ngMau ngmau;
	private JTextField jtext_a;
	private JTextField jtext_b;
	private JTextField jtext_c;

	public view() {
		this.ngmau = new ngMau();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Máy Tính Cá Nhân");
		this.setSize(500, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Font font = new Font("Arial", Font.BOLD, 20);
		JLabel label_a = new JLabel("Giá trị a", JLabel.CENTER);
		label_a.setForeground(Color.PINK);
		label_a.setFont(font);
		JLabel label_b = new JLabel("Giá trị b", JLabel.CENTER);
		label_b.setForeground(Color.PINK);
		label_b.setFont(font);
		JLabel label_c = new JLabel("Kết qủa", JLabel.CENTER);
		label_c.setForeground(Color.PINK);
		label_c.setFont(font);
		//-------------------
		jtext_a = new JTextField(JTextField.CENTER);
		jtext_a.setBackground(Color.GRAY);
		jtext_a.setFont(font);
		
		jtext_b = new JTextField(JTextField.CENTER);
		jtext_b.setBackground(Color.GRAY);
		jtext_b.setFont(font);
		
		jtext_c = new JTextField(JTextField.CENTER);
		jtext_c.setForeground(Color.GREEN);
		jtext_c.setBackground(Color.GRAY);
		jtext_c.setFont(font);
		//--------------------
		JPanel jpanel = new JPanel();
		jpanel.setLayout(new GridLayout(3, 2));
		jpanel.add(label_a);
		jpanel.add(jtext_a);
		jpanel.add(label_b);
		jpanel.add(jtext_b);
		jpanel.add(label_c);
		jpanel.add(jtext_c);
		
		ActionListener ac = new counterListener(this);
		
		Font font2 = new Font("Monaco", Font.BOLD | Font.ITALIC, 25);
		JButton button1 = new JButton("+");
		button1.setForeground(Color.GREEN);
		button1.setFont(font2);
		button1.addActionListener(ac);
		
		JButton button2 = new JButton("-");
		button2.setForeground(Color.GREEN);
		button2.setFont(font2);
		button2.addActionListener(ac);
		
		JButton button3 = new JButton("*");
		button3.setForeground(Color.GREEN);
		button3.setFont(font2);
		button3.addActionListener(ac);
		
		JButton button4 = new JButton("/");
		button4.setForeground(Color.GREEN);
		button4.setFont(font2);
		button4.addActionListener(ac);
		
		JButton button5 = new JButton("^");
		button5.setForeground(Color.GREEN);
		button5.setFont(font2);
		button5.addActionListener(ac);
		
		JButton button6 = new JButton("%");
		button6.setForeground(Color.GREEN);
		button6.setFont(font2);
		button6.addActionListener(ac);
		//--------------------------
		JPanel jpanel2 = new JPanel();
		jpanel2.setLayout(new GridLayout(2, 3));
		jpanel2.add(button1);
		jpanel2.add(button2);
		jpanel2.add(button3);
		jpanel2.add(button4);
		jpanel2.add(button5);
		jpanel2.add(button6);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel, BorderLayout.CENTER);
		this.add(jpanel2, BorderLayout.SOUTH);
	}
	
	//---------Xủ Lý Code------------
	public void cong() {
		// Lấy ra giá trị của JTextField trong Text đưa về số thực
		double a = Double.valueOf(jtext_a.getText());
		double b = Double.valueOf(jtext_b.getText());
		this.ngmau.setA(a);
		this.ngmau.setB(b);
		this.ngmau.cong();
		this.jtext_c.setText(this.ngmau.getC()+""); //Đặt số thành Text
	}
	public void tru() {
		double a = Double.valueOf(jtext_a.getText());
		double b = Double.valueOf(jtext_b.getText());
		this.ngmau.setA(a);
		this.ngmau.setB(b);
		this.ngmau.tru();
		this.jtext_c.setText(this.ngmau.getC()+"");	
	}
	public void nhan() {
		double a = Double.valueOf(jtext_a.getText());
		double b = Double.valueOf(jtext_b.getText());
		this.ngmau.setA(a);
		this.ngmau.setB(b);
		this.ngmau.nhan();
		this.jtext_c.setText(this.ngmau.getC()+"");	
	}
	public void chia() {
		double a = Double.valueOf(jtext_a.getText());
		double b = Double.valueOf(jtext_b.getText());
		this.ngmau.setA(a);
		this.ngmau.setB(b);
		this.ngmau.chia();
		this.jtext_c.setText(this.ngmau.getC()+"");	
	}
	public void pow() {
		double a = Double.valueOf(jtext_a.getText());
		double b = Double.valueOf(jtext_b.getText());
		this.ngmau.setA(a);
		this.ngmau.setB(b);
		this.ngmau.pow();
		this.jtext_c.setText(this.ngmau.getC()+"");
	}
	public void mod() {
		double a = Double.valueOf(jtext_a.getText());
		double b = Double.valueOf(jtext_b.getText());
		this.ngmau.setA(a);
		this.ngmau.setB(b);
		this.ngmau.mod();
		this.jtext_c.setText(this.ngmau.getC()+"");
		
	}
}	
