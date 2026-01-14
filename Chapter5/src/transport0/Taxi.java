package transport0;

public class Taxi {
	private String taxiBrand;  //택시 브랜드
	private int passenger;
	private int money;
	
	public Taxi(String taxiBrand) {
		this.taxiBrand = taxiBrand;
	}
	
	public void take(int money) {
		this.money += money;
		passenger++;
	}
	
	public void taxiInfo() {
		System.out.println(taxiBrand + " 수입은 " + money + 
				"원이고, 승객 수는 " + passenger + "명 입니다.");
	}
}
