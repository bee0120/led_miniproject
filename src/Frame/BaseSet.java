package Frame;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BaseSet extends JFrame {

	JLabel lblImage;
	JButton lblLED;
	JButton lblTitle;

	public BaseSet() {

		// �ػ�
		Toolkit tk = Toolkit.getDefaultToolkit();

		// �⺻ JFrame ȯ�漳��
		setTitle("PCSR");
		setLayout(null);
		setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 300, 
				((int) tk.getScreenSize().getHeight()) / 2 - 450,
				600, 900); // ���� ������

		getContentPane().setBackground(new Color(226, 224, 222));

	}// ������
	
	public void backEffect(JLabel effect) {
		ImageIcon backEffect = new ImageIcon("image/frame/���ȿ��.png");
		effect = new JLabel(backEffect);
		effect.setBounds(0, 0, 600, 900);
		add(effect);
	}

	public void logoSet(JLabel lblImage, JButton lblLED, JButton lblTitle) {
		// �ʷΰ�
		ImageIcon imageLogo = new ImageIcon("image/frame/�ΰ��.png");
		lblImage = new JLabel(imageLogo);
		lblImage.setSize(70, 70);
		lblImage.setLocation(30, 20);
		add(lblImage);
		
		// ���ΰ�
		ImageIcon teamLogo = new ImageIcon("image/frame/���ΰ�.png");
		ImageIcon teamLogoon = new ImageIcon("image/frame/���ΰ�on.png");
		lblLED = new JButton();
		ButtonSet(lblLED, teamLogo, teamLogoon);
		lblLED.setSize(70, 80);
		lblLED.setLocation(480, 20);
		add(lblLED);
		
		// Ÿ��Ʋ�ΰ�
		ImageIcon titleLogo = new ImageIcon("image/frame/Ÿ��Ʋ�ΰ�.png");
		ImageIcon titleLogoon = new ImageIcon("image/frame/Ÿ��Ʋ�ΰ�on.png");
		lblTitle = new JButton();
		ButtonSet(lblTitle, titleLogo, titleLogoon);
		lblTitle.setSize(140, 60);
		lblTitle.setLocation(220, 780);
		add(lblTitle);
	}
	
	public void ButtonSet(JButton btn, ImageIcon stateIcon, ImageIcon overIcon) {
		btn.setBorderPainted(false);
		btn.setContentAreaFilled(false);
		btn.setFocusPainted(false);
		btn.setBorder(null);
		btn.setIcon(stateIcon);
		btn.setRolloverIcon(overIcon);
		btn.setPressedIcon(overIcon);
	}

	public void goMain(JButton btnMain) {
		ImageIcon main = new ImageIcon("image/frame/main.png");
		ImageIcon mainon = new ImageIcon("image/frame/mainon.png");
		ButtonSet(btnMain, main, mainon);
		btnMain.setSize(120, 60);
		btnMain.setLocation(440, 740);
		add(btnMain);
		btnMain.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameStart();
				dispose();
			}
		});
	}

	public void goBack(JButton btnBack) {
		ImageIcon back = new ImageIcon("image/frame/back.png");
		ImageIcon backon = new ImageIcon("image/frame/backon.png");
		ButtonSet(btnBack, back, backon);

		btnBack.setSize(120, 60);
		btnBack.setLocation(30, 740);
		add(btnBack);
	}
	
	public void backSp(JButton btnBack) {
		ImageIcon back = new ImageIcon("image/frame/back.png");
		ImageIcon backon = new ImageIcon("image/frame/backon.png");
		ButtonSet(btnBack, back, backon);
		btnBack.setSize(120, 60);
		btnBack.setLocation(30, 740);
		add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameSpringType();
				dispose();
			}
		});
	}
	
	public void backSu(JButton btnBack) {
		ImageIcon back = new ImageIcon("image/frame/back.png");
		ImageIcon backon = new ImageIcon("image/frame/backon.png");
		ButtonSet(btnBack, back, backon);
		btnBack.setSize(120, 60);
		btnBack.setLocation(30, 740);
		add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameSummerType();
				dispose();
			}
		});
	}
	
	public void backAu(JButton btnBack) {
		ImageIcon back = new ImageIcon("image/frame/back.png");
		ImageIcon backon = new ImageIcon("image/frame/backon.png");
		ButtonSet(btnBack, back, backon);
		btnBack.setSize(120, 60);
		btnBack.setLocation(30, 740);
		add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameAutumnType();
				dispose();
			}
		});
	}
	
	public void backWi(JButton btnBack) {
		ImageIcon back = new ImageIcon("image/frame/back.png");
		ImageIcon backon = new ImageIcon("image/frame/backon.png");
		ButtonSet(btnBack, back, backon);
		btnBack.setSize(120, 60);
		btnBack.setLocation(30, 740);
		add(btnBack);

		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new FrameWinterType();
				dispose();
			}
		});
	}

	@Override
	public int getDefaultCloseOperation() {
		// TODO Auto-generated method stub
		return super.getDefaultCloseOperation();
	}

}
