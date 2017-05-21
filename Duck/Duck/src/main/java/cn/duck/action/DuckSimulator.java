package cn.duck.action;

import cn.duck.dao.impl.Duck;
import cn.duck.dao.impl.FlyWithRocket;
import cn.duck.dao.impl.FlyWithWings;
import cn.duck.dao.impl.MallardDuck;
import cn.duck.dao.impl.MuteQuack;
import cn.duck.dao.impl.Quack;
import cn.duck.dao.impl.RubberDuck;
import cn.duck.dao.impl.Squack;

public class DuckSimulator {
	
	public static void main(String[] args){
		Duck mallard = new MallardDuck();
		Duck rubber = new RubberDuck();
		//野生鸭子的各个属性及输出
		String M_display = mallard.display();
		mallard.setQuackBehavior(new MuteQuack());
		String a = mallard.performQuack();
		mallard.setFlyBehavior(new FlyWithWings());
		String b = mallard.performFly();
		System.out.println("它是" + a +  b + mallard.swim() +  M_display);
		//橡胶鸭子的各个属性及输出
		String R_display = rubber.display();
		rubber.setQuackBehavior(new Squack());
		String c = rubber.performQuack();
		rubber.setFlyBehavior(new FlyWithRocket());
		String d = rubber.performFly();
		System.out.println("它是" + c + d + mallard.swim()+ R_display);
	}
}
