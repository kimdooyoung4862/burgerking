package com.burgerking.jse.StoreController;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;

import com.burgerking.jse.StoreService.StoreService;
import com.burgerking.jse.StoreServiceImpl.StoreServiceImpl;
import com.burgerking.jse.constant_pool.value;

public class StoreController {
	public static void main(String[] args) {
		StoreService service = new StoreServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog(value.MENU)) {
			case "0" :
				JOptionPane.showMessageDialog(null, "종료");
				return;
			case "1" :
				String[] dummy = {
						"햄버거/5500",
						"콜라/1200",
						"감자/1500",
						"커피/1100"
						};
				service.readyMenu(dummy);
				break;
			case "2" :
				JOptionPane.showMessageDialog(null, service.choiceMenu(JOptionPane.showInputDialog("메뉴/갯수 입력")));
				break;
			case "3" :
				JOptionPane.showMessageDialog(null, service.pay(JOptionPane.showInputDialog("계산할 금액입력")));
				break;
			case "4" :
				JOptionPane.showMessageDialog(null, new SimpleDateFormat("yyyy-MM-dd-hh-mm").format(new Date()));
				break;
			case "5" :
				break;
			}
		}
	}
}
