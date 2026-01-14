package singleton;

class Connection{
	private static Connection _inst;
	private int count;
	
	private Connection() {
		count = 0;
	}
	
	public static Connection getInstance() {
		if(_inst == null) {
			_inst = new Connection();
		}
		return _inst;
	}
	
	public void count() {
		count++;
	}
	
	public int getCount() {
		return count;
	}
}

public class ConnectionTest {

	public static void main(String[] args) {
		Connection conn1 = Connection.getInstance();
		conn1.count();
		Connection conn2 = Connection.getInstance();
		conn2.count();
		Connection conn3 = Connection.getInstance();
		conn3.count();
		conn1.count();
		System.out.println(conn1.getCount());
	}

}
