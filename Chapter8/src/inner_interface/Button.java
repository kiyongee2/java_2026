package inner_interface;

public class Button {
	
	private OnclickListener listener;
	
	//내부 인터페이스
	interface OnclickListener{
		public void onClick();
	}
	
	public void setListener(OnclickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}

}
