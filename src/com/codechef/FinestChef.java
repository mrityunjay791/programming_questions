package com.codechef;

import java.util.ArrayList;
import java.util.List;

public class FinestChef {

	public static void main(String[] args) {
		
		List<Integer> fiber = new ArrayList<Integer>();
		List<Integer> fat = new ArrayList<Integer>();
		List<Integer> carb = new ArrayList<Integer>();
		
//		String str[] = {"FATOil","FIBERSpinach","CARBRice","FATCheese","FIBERBeans"};
		String str[] = {"FATOil","FATCheese","FATEgg","FIBERSpinach", "CARBRice","FIBERBeans"};
		
		for(int i = 0; i < str.length; i++) {
			
			if(str[i].contains("FAT")) {
				
				fat.add(i);
				
				if(fat.size() == 2) {
					if(fat.size() < i) {
						
						if(fiber.contains(fat.get(0) + 1)) {
							fiber.remove(0);
						}
						
						if(carb.contains(fat.get(0) + 1)) {
							carb.remove(0);
						}
						
						
						
					} else {
						
						if(fiber.contains(fat.get(fat.size() - 1) + 1)) {
							fiber.remove(0);
						} else if(carb.contains(fat.get(fat.size() - 1) + 1)) {
							carb.remove(0);
						} else {
							i++;
							System.out.print("0");
						}
						
					}
					System.out.print("1");
					fat.clear();
				} else {
					System.out.print("0");
				}
				
				
				
			}
			
			if(str[i].contains("FIBER")) {
				fiber.add(i);
				
				if(fiber.size() == 2) {
					
					if(fiber.size() < i) {
						
						if(fat.contains(fiber.get(0) + 1)) {
							fat.remove(0);
						}
						
						if(carb.contains(fiber.get(0) + 1)) {
							carb.remove(0);
						}
						
						
						
					} else {
						
						if(fat.contains(fiber.get(fiber.size() - 1) + 1)) {
							fat.remove(0);
						} else
						
						if(carb.contains(fiber.get(fiber.size() - 1) + 1)) {
							carb.remove(0);
						} else {
							i++;
							System.out.print("0");
						}
						
					}
					
					System.out.print("1");
					fiber.clear();
					
				} else {
					System.out.print("0");
				}
				
				
			}
			
			if(str[i].contains("CARB")) {
				
				carb.add(i);
				
				
				if(carb.size() == 2) {
					if(carb.size() < i) {
						
						if(fiber.contains(carb.get(0) + 1)) {
							fiber.remove(0);
						}
						
						if(fat.contains(carb.get(0) + 1)) {
							fat.remove(0);
						}
						
						
						
					} else {
						
						if(fiber.contains(carb.get(carb.size() - 1) + 1)) {
							fiber.remove(0);
						} else
						
						if(fat.contains(carb.get(carb.size() - 1) + 1)) {
							fat.remove(0);
						} else {
							i++;
							System.out.print("0");
						}
						
					}
					System.out.print("1");
					carb.clear();
				} else {
					System.out.print("0");
				}
				
				
			}
			
			
			
		}
		
		
		System.out.println(fat);
		System.out.println(fiber);
		System.out.println(carb);
		
	}

}
