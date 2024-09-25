package EnumExample;

enum days{
	Sunday(1), Monday(2), Tuesday(3);

	days(int i) {
		// TODO Auto-generated constructor stub
		this.Myno = i;
	} 
	int Myno;
	 public int getMyno() {
		 return Myno;
	 }
}

enum Tvs{
	SonyTV(80000), LGTV(90000), SamsungTV(70000);
	Tvs(int i) {
		// TODO Auto-generated constructor stub
		this.price = i;
	}

	int price;
	
	public int getPrice() {
		 return price;
	 }
}

public class enumExample {
    private int no;
    public String name;
    
    public void show() {
    	days mydays[] = days.values();
    	for(days dd : mydays) {
    		System.out.println(dd);
    	}
    	
    	for(days dd : days.values()) {
    		System.out.println(dd.ordinal());
    	}
    }
    
    public void showTvs() {
    	Tvs tvlist[] = Tvs.values();
    	for(Tvs tv : tvlist) {
    		 System.out.println("Price of " +tv+ " is "+tv.getPrice());
    	}
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Enum Example");
        enumExample num = new enumExample();
        num.show();
        days d = days.Monday;
        System.out.println(d);
        num.showTvs();
	}

}
