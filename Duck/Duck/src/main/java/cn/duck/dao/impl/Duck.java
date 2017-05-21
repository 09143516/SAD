package cn.duck.dao.impl;

import cn.duck.dao.FlyBehavior;
import cn.duck.dao.QuackBehavior;

public abstract class Duck {
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;
	
	public void setQuackBehavior(QuackBehavior behavior) {
	      this.quackBehavior = behavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior){
		this.flyBehavior = flyBehavior;
	}
	public String  performQuack(){
		return quackBehavior.quack();
	}
	public String performFly(){
		return flyBehavior.fly();
	}
	public String swim(){
		return "在水里游";
	}
	public String display(){
		return "鸭子";
	}
}
