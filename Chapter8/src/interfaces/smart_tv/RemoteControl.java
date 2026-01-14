package interfaces.smart_tv;

public interface RemoteControl {
	//인터페이스 상수
	public int MAX_VOLUMNE = 10;
	public int MIN_VOLUMNE = 0;
	
	//추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	
	//디폴트 메서드
	default void setMute(boolean mute) {
		System.out.println(mute ? "무음 모드 활성화" : "무음 모드 해제");
	}
	
	//정적 메서드
	static void replaceBattery() {
		System.out.println("배터리를 교환합니다.");
	}
}

