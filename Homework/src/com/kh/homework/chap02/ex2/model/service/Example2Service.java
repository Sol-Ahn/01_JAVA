package com.kh.homework.chap02.ex2.model.service;

import com.kh.homework.chap02.ex2.model.vo.AllinOnePrinter;
import com.kh.homework.chap02.ex2.model.vo.KoreaElectronics;
import com.kh.homework.chap02.ex2.model.vo.LgAP;
import com.kh.homework.chap02.ex2.model.vo.SamsungAP;
import com.kh.homework.chap02.ex2.model.vo.SmartPhone;

public class Example2Service {
	public void example1() {
		AllinOnePrinter[] ap = new AllinOnePrinter[2];
		
		ap[0] = new SamsungAP("»ï¼º", "»ï¼º1È£");
		ap[1] = new LgAP();
		
		for(int i = 0; i < ap.length; i++) {
			ap[i].powerOn();
		}
		
		
		KoreaElectronics[] ke = new KoreaElectronics[3];
		
		ke[0] = new SmartPhone();
		ke[1] = new SamsungAP();
		ke[2] = new LgAP();
		
		
	}
}
