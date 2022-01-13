public class Pro1_64010009 {

	final static int SEC_PER_BIRTH = 7;
	final static int SEC_PER_DEATH = 13;
	final static int SEC_PER_IMMIGRANT = 45;
	final static int CURRENT_POPULATION = 312032486;

	static int population = CURRENT_POPULATION;

	public static void main(String args[]) {

		Pro1_64010009.processPopulation(5);

		System.out.println(population);
	}

	static void processPopulation(int years) {

		int days = years * 365;
		int hours = days * 24;
		int minutes = hours * 60;
		int seconds = minutes * 60;

		double births = (float)seconds / (float)SEC_PER_BIRTH;
		double deaths = (float)seconds / (float)SEC_PER_DEATH;
		double immigrants = (float)seconds / (float)SEC_PER_IMMIGRANT;
		double total = births - deaths + immigrants;

		population += total;
	}
}