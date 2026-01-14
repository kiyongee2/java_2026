package inner_interface;

public class ButtonTest {

	public static void main(String[] args) {
		
		Button button = new Button();
		
		//CallListener 객체 생성
		button.setListener(new CallListener());
		button.touch();
		
		//MessageListener 객체 생성
		button.setListener(new MessageListener());
		button.touch();
	}
}
