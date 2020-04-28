package com.kh.homework.chap02.ex2.model.vo;

public class LgAP extends AllinOnePrinter implements Fax{

	@Override
	public void print() {
		System.out.println("1440p 초고화질");
	}

	@Override
	public void powerOn() {
		System.out.println("음성인식으로 전원이 켜짐");
	}

	@Override
	public void powerOff() {
		System.out.println("음석인식으로 전원이 꺼짐");
	}

	@Override
	public void scan() {
		System.out.println("빠르게 스캔");
	}

	@Override
	public void fax() {
		System.out.println("팩스를 주고받을 수 있음");
	}
	
}
