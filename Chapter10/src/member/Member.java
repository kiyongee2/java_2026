package member;

//회원 클래스 정의
public class Member {
	private int memberId;
	private String name;
	
	public Member(int memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	//toString() 재정의
	@Override
	public String toString() {
		return name + " 회원님의 아이디는 " + memberId + "입니다.";
	}

	//hashCode() 재정의
//	@Override
//	public int hashCode() {
//		return memberId;
//	}

	//equals() 재정의
//	@Override
//	public boolean equals(Object obj) {
//		if(obj instanceof Member) {
//			Member member = (Member)obj;
//			if(this.memberId == member.memberId)
//				return true;
//		}
//		return false;
//	}
}






