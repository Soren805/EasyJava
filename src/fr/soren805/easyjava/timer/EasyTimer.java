package fr.soren805.easyjava.timer;

import java.util.Timer;
import java.util.TimerTask;

public class EasyTimer {
	
	public void createTimer(String outputName, long delay, Integer stopDelay) {
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			
			private int stopdel = stopDelay;
			
			@Override
			public void run() {
				System.out.println(outputName);
				
				if(stopdel == 0) {
					cancel();
				}
				
				stopdel--;
			}
			
		}, delay);
	}
	
	public void createTimerWithPeriod(String outputName, long delay, long period, Integer stopDelay) {
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			
			private int stopdel = stopDelay;
			
			@Override
			public void run() {
				System.out.println(outputName);
				
				if(stopdel == 0) {
					cancel();
				}
				
				stopdel--;
			}
			
		}, delay, period);
	}
	
	public void createInfiniteTimer(String outputName, long delay) {
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(outputName);
			}
			
		}, delay);
	}
	
	public void createInfiniteTimerWithPeriod(String outputName, long delay, long period) {
		Timer t = new Timer();
		t.schedule(new TimerTask() {
			
			@Override
			public void run() {
				System.out.println(outputName);
			}
			
		}, delay, period);
	}

}
