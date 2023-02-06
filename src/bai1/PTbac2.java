package bai1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JSplitPane;
import java.awt.FlowLayout;
import javax.swing.SpringLayout;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PTbac2 extends JFrame {

	private JPanel contentPane;
	private JTextField txtPhuongTrinhBac;
	private JPanel panel;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JTextField Ketqua;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PTbac2 frame = new PTbac2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PTbac2() {
		setTitle("^-^");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPhuongTrinhBac = new JTextField();
		txtPhuongTrinhBac.setBounds(5, 5, 426, 60);
		txtPhuongTrinhBac.setBackground(new Color(128, 255, 255));
		txtPhuongTrinhBac.setHorizontalAlignment(SwingConstants.CENTER);
		txtPhuongTrinhBac.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtPhuongTrinhBac.setText("PHUONG TRINH BAC HAI");
		txtPhuongTrinhBac.setPreferredSize(new Dimension(30,60));
		contentPane.add(txtPhuongTrinhBac);
		txtPhuongTrinhBac.setColumns(10);
		
		panel = new JPanel();
		panel.setBounds(5, 198, 426, 60);
		panel.setPreferredSize(new Dimension(10,60));
		panel.setBorder(new TitledBorder(null, "Chon tac vu", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		
		a = new JTextField();
		a.setBounds(108, 75, 253, 19);
		contentPane.add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setColumns(10);
		b.setBounds(108, 104, 253, 19);
		contentPane.add(b);
		
		c = new JTextField();
		c.setColumns(10);
		c.setBounds(108, 133, 253, 19);
		contentPane.add(c);
		
		JLabel lblNewLabel = new JLabel("Nhap a:");
		lblNewLabel.setBounds(31, 78, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhapB = new JLabel("Nhap b:");
		lblNhapB.setBounds(31, 107, 45, 13);
		contentPane.add(lblNhapB);
		
		JLabel lblNhapC = new JLabel("Nhap c:");
		lblNhapC.setBounds(31, 136, 45, 13);
		contentPane.add(lblNhapC);
		
		JLabel lblKetQua = new JLabel("Ket qua:");
		lblKetQua.setBounds(31, 163, 51, 13);
		contentPane.add(lblKetQua);
		
		Ketqua = new JTextField();
		Ketqua.setDisabledTextColor(new Color(0, 0, 0));
		Ketqua.setEnabled(false);
		Ketqua.setEditable(false);
		Ketqua.setColumns(10);
		Ketqua.setBounds(108, 162, 253, 19);
		contentPane.add(Ketqua);
		JButton Giai = new JButton("Giai");
		Giai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double num1 = Double.parseDouble(a.getText());
				double num2 = Double.parseDouble(b.getText());
				double num3 = Double.parseDouble(c.getText());
				double sum=num1+num2+num3;
				Ketqua.setText(String.valueOf(sum));
			}
		});
		Giai.setFont(new Font("Tahoma", Font.PLAIN, 13));
		Giai.setBounds(100, 21, 85, 29);
		panel.add(Giai);
		
		JButton xoarong = new JButton("Xoa rong");
		xoarong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a.setText("");
				b.setText("");
				c.setText("");
				Ketqua.setText("");
			}
		});
		xoarong.setFont(new Font("Tahoma", Font.PLAIN, 13));
		xoarong.setBounds(200, 21, 85, 29);
		panel.add(xoarong);
		
		JButton thoat = new JButton("Thoat");
		thoat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(ABORT);
			}
		});
		thoat.setFont(new Font("Tahoma", Font.PLAIN, 13));
		thoat.setBounds(295, 21, 85, 29);
		panel.add(thoat);
	}
}
