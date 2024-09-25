//has A  composition relationship inheritance.

package hasAInheritance;

class person{
	  private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	  
}

class passport {
	  private int passport_no;

	public int getPassport_no() {
		return passport_no;
	}

	public void setPassport_no(int passport_no) {
		this.passport_no = passport_no;
	}
}
public class OneToOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        person p1 =new person();
        p1.setName("Ram");
        
        person p2 = new person();
        p2.setName("Sita");
        
        passport pp1 = new passport();
        pp1.setPassport_no(1234567);
        
        passport pp2 = new passport();
        pp2.setPassport_no(278994735);
        
        //Association between two classes in the main method.
        System.out.println(p1.getName() +" has a US passport whose passport no is : "+pp1.getPassport_no());
        System.out.println(p2.getName() +" has a INDIAN passport whose passport no is :"+pp2.getPassport_no());
	}

}
