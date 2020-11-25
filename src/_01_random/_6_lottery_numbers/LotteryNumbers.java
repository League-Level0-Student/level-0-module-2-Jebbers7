package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {
	Random ran = new Random();
	JOptionPane.showMessageDialog(null, ran.nextInt(100) + " " + ran.nextInt(100) + " " + ran.nextInt(100) + " " + ran.nextInt(100) + " " + ran.nextInt(100) + " " + ran.nextInt(100));
	
	
	
	
	
}
}
