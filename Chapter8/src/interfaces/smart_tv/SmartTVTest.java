package interfaces.smart_tv;

import interfaces.remotecontrol.RemoteControl;

public class SmartTVTest {

	public static void main(String[] args) {

		//인터페이스 타입으로 객체 생성
		RemoteControl remocon = new SmartTV();
		WebSearchable searcher = (WebSearchable)remocon;
		
		//리모컨 테스트
		remocon.turnOn();
		remocon.setVolume(7);
		remocon.setVolume(-1);  //최소 볼륨으로 제한
		remocon.setVolume(12);  //최대 볼륨으로 제한
		remocon.setMute(true);
		remocon.setMute(false);
		remocon.turnOff();
		
		//검색 기능 테스트
		searcher.searchWeb("www.youtube.com");
		searcher.searchWeb("www.naver.com");
		
		//배터리 교환
		RemoteControl.replaceBattery();
	}
}
  