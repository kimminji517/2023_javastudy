package com.ict.edu2;

public class Tv extends RemoteControl{
	@Override
	public void volumeup() {
		System.out.println("TV 볼륨을 높입니다. 현재볼륨 : ");
	}
	@Override
	public void volumedown() {
		System.out.println("TV 볼륨을 낮춥니다. 현재볼륨 : ");
	}
}
