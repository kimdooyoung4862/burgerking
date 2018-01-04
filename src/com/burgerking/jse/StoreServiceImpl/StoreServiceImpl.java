package com.burgerking.jse.StoreServiceImpl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.burgerking.jse.StoreService.StoreService;

public class StoreServiceImpl implements StoreService{
	private Map<String,String> menuMap;
	private Map<String,String> orderMap;
	
	public StoreServiceImpl() {
		menuMap = new HashMap<>();
		orderMap = new HashMap<>();
	}

	@Override
	public void readyMenu(String[] dummy) {
		for(String s : dummy) {
			String[] foo = s.split("/");
			menuMap.put(foo[0], foo[1]);
		}
	}
	@Override
	public String choiceMenu(String a) {
		String[] arr = a.split("/");
		Set<String> keys = menuMap.keySet();
		String price = "";
		for(String key : keys) {
			if(arr[0].equals(key)) {
				price = menuMap.get(key);
			}
		}
		int pay = Integer.parseInt(price) * Integer.parseInt(arr[1]);
		String bar = String.valueOf(pay);
		orderMap.put(bar, bar);
		return "결제금액 :"+ pay+"원";
	}

	@Override
	public String pay(String money) {
		Set<String> keys = orderMap.keySet();
		String pay = ""; 
		for(String key : keys) {
			 pay = key;
		}
		int paymoney = Integer.parseInt(money) - (Integer.parseInt(pay));
		return "잔돈 :"+paymoney;
	}
}
