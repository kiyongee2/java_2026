package basic_class.object;

public class MemberEqualTest {

	public static void main(String[] args) {
		
		Member member1 = new Member("강감찬");
		Member member2 = new Member("강감찬");
		Member member3 = new Member("이성계");
		
		if(member1.equals(member2)) {
			System.out.println("member1과 member2는 일치합니다.");
		}else {
			System.out.println("member1과 member2는 다릅니다.");
		}
		
		if(member1.equals(member3)) {
			System.out.println("member1과 member3은 일치합니다.");
		}else {
			System.out.println("member1과 member3은 다릅니다.");
		}
	}

}
