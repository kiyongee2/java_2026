package interfaces.remotecontrol;

public class RemoteControlTest {

	public static void main(String[] args) {
		//인터페이스(부모) 형으로 객체 생성(자동 형변환)
		RemoteControl recomon = new Television();
		
		//기능 테스트
		recomon.turnOn();
		recomon.setVolume(7);
		recomon.setVolume(-1);  //최소 볼륨으로 제한
		recomon.setVolume(12);  //최대 볼륨으로 제한
		recomon.setMute(true);
		recomon.setMute(false);
		recomon.turnOff();
		
		RemoteControl.replaceBattery();
	}
}

