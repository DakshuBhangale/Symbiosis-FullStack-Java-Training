package hasAinheritance_1;

public class BidirectionalManyToMany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Person p1 = new Person();
       p1.setName("Nisha");
       
       Person p2 = new Person();
       p2.setName("Nitin");
       
       Address a1 = new Address();
       a1.setState("Maharashtra");
       a1.setCity("Nashik");
       a1.setZipcode(12345);
       
       Address a2 = new Address();
       a2.setState("Maharashtra");
       a2.setCity("Pune");
       a2.setZipcode(67890);
       
       System.out.println(p1.getName()+ " Lives at address " + a1.getCity() +", "+a1.getState()+", "+a1.getZipcode()+" but she has also address at " +a2.getCity() +", "+a2.getState()+", "+a2.getZipcode() );
       System.out.println(p2.getName()+ " Lives at address " + a2.getCity() +", "+a2.getState()+", "+a2.getZipcode()+" but he has also address at " +a1.getCity() +", "+a1.getState()+", "+a1.getZipcode() );
	}

}
