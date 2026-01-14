package inner_interface;

public class MessageListener implements Button.OnclickListener{

	@Override
	public void onClick() {
		System.out.println("문자를 보냅니다.");
	}

}
