package week1.day2;

public class EmployeeInfo {

	public void printCompanyAddress() {
		System.out.println("Chennai");
	}

	public String getCompanyAddress() {
		System.out.println("Giving company Address");
		return "600090 Chennai";
	}
	
	
	public static void main(String[] args) {
		
		EmployeeInfo ei = new EmployeeInfo();
		
		ei.printCompanyAddress();
		String Address = ei.getCompanyAddress();
		System.out.println(Address);
	}

}
