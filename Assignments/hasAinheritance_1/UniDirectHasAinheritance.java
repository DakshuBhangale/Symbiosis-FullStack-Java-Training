package hasAinheritance_1;

public class UniDirectHasAinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Football football = new  Football("Association Football", "68-70 cm", "420gm");
        FootballPlayer fbp = new FootballPlayer("Yash", football);
        System.out.println("Player "+fbp.getPlayerName()+" plays with "+fbp.getFootball().getType()  );
	}

}
