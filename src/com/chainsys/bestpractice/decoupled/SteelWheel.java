package com.chainsys.bestpractice.decoupled;

public class SteelWheel implements Iwheel
{
	public String location;
 public void rotate()
 {
	 System.out.println("Steel Wheel rotating");
 }
 public void stopRotation()
 {
	 System.out.println("Steel Wheel stopped");
 }
}