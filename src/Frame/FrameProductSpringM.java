package Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame.FrameGender.GenSpBr;
import Frame.FrameGender.GenSpWm;
import Set.BaseSet;
import Set.MyShop;
import Set.ProductSet;
import Set.Shop;

public class FrameProductSpringM extends JFrame {

	public static class ProSpBrM extends JFrame {
		public ProSpBrM() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// ·Î°íµé
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// »ó´Ü Å¸ÀÌÆ²
			ImageIcon spbr = new ImageIcon("image/product/º½ºê.png");
			JLabel spBright = new JLabel(spbr);
			spBright.setBounds(115, 70, 350, 110);
			frame.add(spBright);

			frame.add(set.getLblSet1());
			frame.add(set.getLblSet2());
			frame.add(set.getLblSet3());
			frame.add(set.getBtnAdd1());
			frame.add(set.getBtnAdd2());
			frame.add(set.getBtnAdd3());
			frame.add(set.getBtnShow1());
			frame.add(set.getBtnShow2());
			frame.add(set.getBtnShow3());

			set.getBtnShow1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set1");
					ImageIcon set1 = new ImageIcon("image/product/male/mº½ºê1.png");
					JLabel brSet1 = new JLabel(set1);
					brSet1.setBounds(25, 25, 485, 485);
					newF.add(brSet1);
					// °¡°Ý ÀÌ¹ÌÁö
					ImageIcon price = new ImageIcon("image/product/price/152.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set2");
					ImageIcon set2 = new ImageIcon("image/product/male/mº½ºê2.png");
					JLabel brSet2 = new JLabel(set2);
					brSet2.setBounds(25, 25, 485, 485);
					newF.add(brSet2);
					// °¡°Ý ÀÌ¹ÌÁö
					ImageIcon price = new ImageIcon("image/product/price/86.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set3");
					ImageIcon set3 = new ImageIcon("image/product/male/mº½ºê3.png");
					JLabel brSet3 = new JLabel(set3);
					brSet3.setBounds(25, 25, 485, 485);
					newF.add(brSet3);
					// °¡°Ý ÀÌ¹ÌÁö
					ImageIcon price = new ImageIcon("image/product/price/93.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spbrm1 = new Shop("Spring Bright Set1(M)", 152,
							new JLabel(new ImageIcon("image/product/mcart/mº½ºê1.png")));
					MyShop.pCount++;
					MyShop.add(spbrm1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spbrm2 = new Shop("Spring Bright Set2(M)", 86,
							new JLabel(new ImageIcon("image/product/mcart/mº½ºê2.png")));
					MyShop.pCount++;
					MyShop.add(spbrm2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spbrm3 = new Shop("Spring Bright Set3(M)", 93,
							new JLabel(new ImageIcon("image/product/mcart/mº½ºê3.png")));
					MyShop.pCount++;
					MyShop.add(spbrm3);
				}
			});

			// back¹öÆ°
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenSpBr();
					frame.dispose();
				}
			});
			// main¹öÆ°
			JButton btnMain = new JButton();
			frame.goMain(btnMain);
			// ¹è°æÈ¿°ú Ã³¸®
			JLabel effect = new JLabel();
			frame.backEffect(effect);

			frame.setVisible(true);
		}
	}

	public static class ProSpWmM extends JFrame {
		public ProSpWmM() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// ·Î°íµé
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// »ó´Ü Å¸ÀÌÆ²
			ImageIcon spwm = new ImageIcon("image/product/º½¿ú.png");
			JLabel spWarm = new JLabel(spwm);
			spWarm.setBounds(115, 70, 350, 110);
			frame.add(spWarm);

			frame.add(set.getLblSet1());
			frame.add(set.getLblSet2());
			frame.add(set.getLblSet3());
			frame.add(set.getBtnAdd1());
			frame.add(set.getBtnAdd2());
			frame.add(set.getBtnAdd3());
			frame.add(set.getBtnShow1());
			frame.add(set.getBtnShow2());
			frame.add(set.getBtnShow3());

			set.getBtnShow1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set1");
					ImageIcon set1 = new ImageIcon("image/product/male/mº½¿ú1.png");
					JLabel wmSet1 = new JLabel(set1);
					wmSet1.setBounds(25, 25, 485, 485);
					newF.add(wmSet1);
					// °¡°Ý ÀÌ¹ÌÁö
					ImageIcon price = new ImageIcon("image/product/price/79.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set2");
					ImageIcon set2 = new ImageIcon("image/product/male/mº½¿ú2.png");
					JLabel wmSet2 = new JLabel(set2);
					wmSet2.setBounds(25, 25, 485, 485);
					newF.add(wmSet2);
					// °¡°Ý ÀÌ¹ÌÁö
					ImageIcon price = new ImageIcon("image/product/price/116.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set3");
					ImageIcon set3 = new ImageIcon("image/product/male/mº½¿ú3.png");
					JLabel wmSet3 = new JLabel(set3);
					wmSet3.setBounds(25, 25, 485, 485);
					newF.add(wmSet3);
					// °¡°Ý ÀÌ¹ÌÁö
					ImageIcon price = new ImageIcon("image/product/price/108.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spwmm1 = new Shop("Spring Warm Set1(M)", 79,
							new JLabel(new ImageIcon("image/product/mcart/mº½¿ú1.png")));
					MyShop.pCount++;
					MyShop.add(spwmm1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spwmm2 = new Shop("Spring Warm Set2(M)", 116,
							new JLabel(new ImageIcon("image/product/mcart/mº½¿ú2.png")));
					MyShop.pCount++;
					MyShop.add(spwmm2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spwmm3 = new Shop("Spring Warm Set3(M)", 108,
							new JLabel(new ImageIcon("image/product/mcart/mº½¿ú3.png")));
					MyShop.pCount++;
					MyShop.add(spwmm3);
				}
			});

			// back¹öÆ°
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenSpWm();
					frame.dispose();
				}
			});
			// main¹öÆ°
			JButton btnMain = new JButton();
			frame.goMain(btnMain);
			// ¹è°æÈ¿°ú Ã³¸®
			JLabel effect = new JLabel();
			frame.backEffect(effect);

			frame.setVisible(true);
		}
	}

	public static class ProSpLtM extends JFrame {
		public ProSpLtM() {
			BaseSet frame = new BaseSet();
			ProductSet set = new ProductSet();
			// ·Î°íµé
			JLabel lblImage = new JLabel();
			JButton lblLED = new JButton();
			JButton lblTitle = new JButton();
			frame.logoSet(lblImage, lblLED, lblTitle);
			// »ó´Ü Å¸ÀÌÆ²
			ImageIcon splt = new ImageIcon("image/product/º½¶ó.png");
			JLabel spLight = new JLabel(splt);
			spLight.setBounds(115, 70, 350, 110);
			frame.add(spLight);

			frame.add(set.getLblSet1());
			frame.add(set.getLblSet2());
			frame.add(set.getLblSet3());
			frame.add(set.getBtnAdd1());
			frame.add(set.getBtnAdd2());
			frame.add(set.getBtnAdd3());
			frame.add(set.getBtnShow1());
			frame.add(set.getBtnShow2());
			frame.add(set.getBtnShow3());

			set.getBtnShow1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set1");
					ImageIcon set1 = new ImageIcon("image/product/male/mº½¶ó1.png");
					JLabel ltSet1 = new JLabel(set1);
					ltSet1.setBounds(25, 25, 485, 485);
					newF.add(ltSet1);
					// °¡°Ý ÀÌ¹ÌÁö
					ImageIcon price = new ImageIcon("image/product/price/93.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set2");
					ImageIcon set2 = new ImageIcon("image/product/male/mº½¶ó2.png");
					JLabel ltSet2 = new JLabel(set2);
					ltSet2.setBounds(25, 25, 485, 485);
					newF.add(ltSet2);
					// °¡°Ý ÀÌ¹ÌÁö
					ImageIcon price = new ImageIcon("image/product/price/134.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnShow3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					JFrame newF = new JFrame();
					set.newFrame(newF);
					newF.setTitle("Set3");
					ImageIcon set3 = new ImageIcon("image/product/male/mº½¶ó3.png");
					JLabel ltSet3 = new JLabel(set3);
					ltSet3.setBounds(25, 25, 485, 485);
					newF.add(ltSet3);
					// °¡°Ý ÀÌ¹ÌÁö
					ImageIcon price = new ImageIcon("image/product/price/125.png");
					JLabel lblPrice = new JLabel(price);
					lblPrice.setBounds(80, 530, 350, 100);
					newF.add(lblPrice);
					newF.setVisible(true);
				}
			});
			set.getBtnAdd1().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spltm1 = new Shop("Spring Light Set1(M)", 93,
							new JLabel(new ImageIcon("image/product/mcart/mº½¶ó1.png")));
					MyShop.pCount++;
					MyShop.add(spltm1);
				}
			});
			set.getBtnAdd2().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spltm2 = new Shop("Spring Light Set2(M)", 134,
							new JLabel(new ImageIcon("image/product/mcart/mº½¶ó2.png")));
					MyShop.pCount++;
					MyShop.add(spltm2);
				}
			});
			set.getBtnAdd3().addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					Shop spltm3 = new Shop("Spring Light Set3(M)", 125,
							new JLabel(new ImageIcon("image/product/mcart/mº½¶ó3.png")));
					MyShop.pCount++;
					MyShop.add(spltm3);
				}
			});

			// back¹öÆ°
			JButton btnBack = new JButton();
			frame.goBack(btnBack);

			btnBack.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					new GenSpBr();
					frame.dispose();
				}
			});
			// main¹öÆ°
			JButton btnMain = new JButton();
			frame.goMain(btnMain);
			// ¹è°æÈ¿°ú Ã³¸®
			JLabel effect = new JLabel();
			frame.backEffect(effect);

			frame.setVisible(true);
		}
	}
}