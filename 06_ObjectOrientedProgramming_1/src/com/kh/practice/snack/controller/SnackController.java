package com.kh.practice.snack.controller;

import com.kh.practice.snack.model.vo.Snack;

public class SnackController {
	
	private Snack snackVo = new Snack();
	
	public SnackController() {
		
	}
	
	public String saveData(String kind,String name,String flavor,
							int numOf,int price) {
		
		snackVo.setKind(kind);
		snackVo.setName(name);
		snackVo.setFlavor(flavor);
		snackVo.setNumOf(numOf);
		snackVo.setPrice(price);
		
		
		return "저장 완료되었습니다.";
	}
	
	public String confirmData() {
		// 저장된 데이터 값 반환
		return snackVo.information();
	}
}
