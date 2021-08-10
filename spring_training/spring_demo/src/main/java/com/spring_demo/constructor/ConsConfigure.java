package com.spring_demo.constructor;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsConfigure {

	public static void main(String[] args) {		
		ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("constr_exe.xml");
		Player sach = cpx.getBean("sachin", Player.class);
		System.out.println(sach.getName() + " " + sach.getAge() + " " + sach.getPlyNum());
		Game game = cpx.getBean("cricket",Game.class);
		System.out.println(game.getName() + " " + game);
		Player virat = cpx.getBean("virat", Player.class);
		System.out.println(virat);
		Game cVi = cpx.getBean("gameVirat", Game.class);
		System.out.println(cVi);
		Game cD = cpx.getBean("gameDravid", Game.class);
		System.out.println(cD);
		cpx.close();
	}

}