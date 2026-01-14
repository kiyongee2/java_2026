package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1);
		System.out.println(myCompany2);
		
		//결국 인스턴스는 1개이다.
		System.out.println(myCompany1 == myCompany2);
	}

}
