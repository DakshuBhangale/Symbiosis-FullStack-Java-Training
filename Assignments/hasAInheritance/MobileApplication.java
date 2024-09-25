//has A  Aggrigation relationship inheritance.

package hasAInheritance;

class simCard {
	private String card_no;
	public simCard() {
		 System.out.println("Simcard object constructed");
		 card_no = "New Sim Constructed";
	}
	
	public String toString() {
		return "simCard [ cardNo = " +card_no +"]";
	}
}

class Mobile {
	private simCard mysim = new simCard();
	private String mobileName = "SamSung";
	private int modelNo = 1234;
	
	public String toString() {
		return mysim + " For " + mobileName+ " and Model No: "+modelNo;
	}
}

public class MobileApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Mobile myMobile = new Mobile();
      System.out.println(myMobile);
	}

}
