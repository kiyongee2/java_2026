package interfaces.remotecontrol;

public class Television implements RemoteControl{
	private int volume;
	private boolean isPoweredOn;

	@Override
	public void turnOn() {
		if(!isPoweredOn) { //전원이 꺼져 있어 전원을 켬
			isPoweredOn = true;
			System.out.println("TV를 켭니다. 현재 상태: ON");
		}
	}

	@Override
	public void turnOff() {
		if(isPoweredOn) { //전원이 켜 있어 전원을 끔
			isPoweredOn = false;
			System.out.println("TV를 끕니다. 현재 상태: OFF");
		}
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUMNE) { 
			this.volume = RemoteControl.MAX_VOLUMNE; //최대 볼륨 설정
		}else if(volume < RemoteControl.MIN_VOLUMNE) { 
			this.volume = RemoteControl.MIN_VOLUMNE; //최소 볼륨 설정
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
