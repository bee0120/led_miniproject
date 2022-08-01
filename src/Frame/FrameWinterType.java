package Frame;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Frame.FrameGender.GenWiBr;
import Frame.FrameGender.GenWiCo;
import Frame.FrameGender.GenWiDp;
import Set.BaseSet;

public class FrameWinterType extends JFrame{
   public FrameWinterType() {
      
      // BaseSet °´Ã¼ »ý¼º
      BaseSet frame = new BaseSet();
      
      // °Ü¿ïÅ¸ÀÔ ÀÌ¹ÌÁö
      ImageIcon winter = new ImageIcon("image/frame/°Ü¿ïÅ¸ÀÔ.png");
      JLabel lblWinter = new JLabel(winter);
      lblWinter.setBounds(115,70,350,110);
      frame.add(lblWinter);

      JLabel lblImage = new JLabel();
      JButton lblLED = new JButton(); 
      JButton lblTitle = new JButton();
      frame.logoSet(lblImage, lblLED, lblTitle);
      
      // deep ÆÈ·¹Æ®Ã¢
      ImageIcon info = new ImageIcon("image/info/ÆÈ·¹Æ®.png");
      ImageIcon infoon = new ImageIcon("image/info/ÆÈ·¹Æ®on.png");
      JButton WiDeepPlt = new JButton();
      frame.ButtonSet(WiDeepPlt, info, infoon);
      
      WiDeepPlt.setBounds(460, 250, 40, 40);
      frame.add(WiDeepPlt);
      WiDeepPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame widpPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            widpPlt.setTitle("Winter Deep Palette");
            widpPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon widp = new ImageIcon("image/info/°ÜµöÆÈ.png");
            JLabel dpwiplt = new JLabel(widp);
            dpwiplt.setBounds(0, 150, 550, 550);
            widpPlt.add(dpwiplt);
            widpPlt.setVisible(true);
         }
      });

      // deep ¹öÆ°
      ImageIcon deep = new ImageIcon("image/frame/µö.png");
      ImageIcon deepon = new ImageIcon("image/frame/µöon.png");
      JButton btnDeep = new JButton();
      frame.ButtonSet(btnDeep, deep, deepon);
      btnDeep.setBounds(40, 240, 500, 120);
      frame.add(btnDeep);
      
      btnDeep.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenWiDp();
            frame.dispose();
         }
      });
      
      // cool ÆÈ·¹Æ®Ã¢
      JButton WiCoolPlt = new JButton();
      frame.ButtonSet(WiCoolPlt, info, infoon);
      
      WiCoolPlt.setBounds(460, 420, 40, 40);
      frame.add(WiCoolPlt);
      WiCoolPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame wicoPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            wicoPlt.setTitle("Winter Cool Palette");
            wicoPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon wico = new ImageIcon("image/info/°ÜÄðÆÈ.png");
            JLabel cowiplt = new JLabel(wico);
            cowiplt.setBounds(0, 150, 550, 550);
            wicoPlt.add(cowiplt);
            wicoPlt.setVisible(true);
         }
      });
      
      // cool ¹öÆ°
      ImageIcon cool = new ImageIcon("image/frame/Äð.png");
      ImageIcon coolon = new ImageIcon("image/frame/Äðon.png");
      JButton btnCool = new JButton();
      frame.ButtonSet(btnCool, cool, coolon);
      btnCool.setBounds(40, 410, 500, 120);
      frame.add(btnCool);
      
      btnCool.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenWiCo();
            frame.dispose();
         }
      });
      
      // bright ÆÈ·¹Æ®Ã¢
      JButton WiBrightPlt = new JButton();
      frame.ButtonSet(WiBrightPlt, info, infoon);
      
      WiBrightPlt.setBounds(460, 590, 40, 40);
      frame.add(WiBrightPlt);
      WiBrightPlt.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            JFrame wibrPlt = new JFrame();
            Toolkit tk = Toolkit.getDefaultToolkit();

            wibrPlt.setTitle("Winter Bright Palette");
            wibrPlt.setBounds(((int) tk.getScreenSize().getWidth()) / 2 - 275,
                  ((int) tk.getScreenSize().getHeight()) / 2 - 275, 
                  550, 550);
            ImageIcon wibr = new ImageIcon("image/info/°ÜºêÆÈ.png");
            JLabel brwiplt = new JLabel(wibr);
            brwiplt.setBounds(0, 150, 550, 550);
            wibrPlt.add(brwiplt);
            wibrPlt.setVisible(true);
         }
      });
      
      // bright ¹öÆ°
      ImageIcon bright = new ImageIcon("image/frame/ºê¶óÀÌÆ®.png");
      ImageIcon brighton = new ImageIcon("image/frame/ºê¶óÀÌÆ®on.png");
      JButton btnBright = new JButton();
      frame.ButtonSet(btnBright, bright, brighton);

      btnBright.setBounds(40, 580, 500, 120);
      frame.add(btnBright);
      
      btnBright.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new GenWiBr();
            frame.dispose();
         }
      });
      
      // back ¹öÆ°
      JButton btnBack = new JButton();
      frame.goBack(btnBack);

      btnBack.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            new FrameSeason();
            frame.dispose();
         }
      });
      
      // main ¹öÆ°
      JButton btnMain = new JButton();
      frame.goMain(btnMain);
      
      // ¹è°æÈ¿°ú Ã³¸®
      JLabel effect = new JLabel();
      frame.backEffect(effect);
      
      // ¼¼ÆÃ
      frame.setVisible(true);
      
   }
}