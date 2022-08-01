package Frame;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class MyShop {

	private static MyShop instance;
	   
	   public static ArrayList<Shop> buylist = new ArrayList<>();
	   
	   public static int count1 = 1;
	   public static int count2 = 1;
	   public static int count3 = 1;
	   public static int count4 = 1;
	   
	   public static MyShop getMyShop() {
	      if (instance == null) {
	         instance = new MyShop();
	      }
	      return instance;
	   }
	   
	   public static void add(Shop s) {
	      buylist.add(s);
	      JOptionPane.showMessageDialog(null, s.getName() + "을(를) 장바구니에 담았습니다.");
	   }
	   
	   public static void clear() {
	      buylist.clear();
	      JOptionPane.showMessageDialog(null, "장바구니를 비웠습니다.");
	   }
	   
	   public static void countmenu1(int c) {
	      count1 = c;
	   }

	   public static void countmenu2(int c) {
	      count2 = c;
	   }

	   public static void countmenu3(int c) {
	      count3 = c;
	   }

	   public static void countmenu4(int c) {
	      count4 = c;
	   }
	   
	   //모든 count 초기화
	   public static void resetcount() {
	      MyShop.count1=1;
	      MyShop.count2=1;
	      MyShop.count3=1;
	      MyShop.count4=1;
	   }

}
