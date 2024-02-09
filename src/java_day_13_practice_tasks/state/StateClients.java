package java_day_13_practice_tasks.state;

public class StateClients {

    public static void main(String[] args) {

        Virginia Virginia = new Virginia("Virginia","VA",
                "Democratic Party", "Glenn Youngkin","Mark Warner",  8_000_000);


        System.out.println(Virginia.getName());
        System.out.println(Virginia.getAbbreviation());
        System.out.println(Virginia.getPoliticalParty());
        System.out.println(Virginia.getGovernor());
        System.out.println(Virginia.getSenator());
        System.out.println(Virginia.getPopulation());
        System.out.println(Virginia);

        // do like this with each state
    }
}
