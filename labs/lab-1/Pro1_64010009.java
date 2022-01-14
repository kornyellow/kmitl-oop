public class Pro1_64010009 {

	public static void main(String[] args) {

		final int BIRTHS_PER_SECOND = 7;
		final int DEATHS_PER_SECOND = 13;
		final int IMMIGRANTS_PER_SECOND = 45;

		int current_population = 312032486;

		int days_per_year = 365;
		int hours_per_year = days_per_year * 24;
		int minutes_per_year = hours_per_year * 60;
		int seconds_per_year = minutes_per_year * 60;

		double new_births_per_year = (double) seconds_per_year / (double) BIRTHS_PER_SECOND;
		double new_deaths_per_year = (double) seconds_per_year / (double) DEATHS_PER_SECOND;
		double new_immigrants_per_year = (double) seconds_per_year / (double) IMMIGRANTS_PER_SECOND;
		int new_total_per_year = (int) (new_births_per_year - new_deaths_per_year + new_immigrants_per_year);

		System.out.println("After 0 year: " + current_population);

		current_population += new_total_per_year;
		System.out.println("After 1 year: " + current_population);

		current_population += new_total_per_year;
		System.out.println("After 2 year: " + current_population);

		current_population += new_total_per_year;
		System.out.println("After 3 year: " + current_population);

		current_population += new_total_per_year;
		System.out.println("After 4 year: " + current_population);

		current_population += new_total_per_year;
		System.out.println("After 5 year: " + current_population);
	}
}