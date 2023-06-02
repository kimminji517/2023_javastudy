package com.ict.edu2;

public class Speaker extends RemoteControl{
	String speaker = "";
	int volume = 0;
	@Override
	public void volumeup() {
		super.volume++;
		System.out.println("스피커 볼륨을 높입니다. 현재볼륨 : ");
	}
	@Override
	public void volumedown() {
		super.volume--;
		System.out.println("스피커 볼륨을 낮춥니다. 현재볼륨 : ");
	}
}
