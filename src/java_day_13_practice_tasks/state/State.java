package java_day_13_practice_tasks.state;

public class State {

    private String name, abbreviation, politicalParty, Governor, senator;
    private int population;

    public State(String name, String abbreviation, String politicalParty, String Governor, String senator, int population) {

        setName(name);
        setAbbreviation(abbreviation);
        setPoliticalParty(politicalParty);
        setGovernor(Governor);
        setSenator(senator);
        setPopulation(population);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank()) {
            System.err.println("The name must not be null, empty, or blank.");
            System.exit(1);
        }
        this.name = name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        if (abbreviation == null || abbreviation.isEmpty() || abbreviation.isBlank()) {
            System.err.println("The abbreviation must not be null, empty, or blank.");
            System.exit(2);
        }
        this.abbreviation = abbreviation;
    }

    public String getPoliticalParty() {

        return politicalParty;
    }

    public void setPoliticalParty(String politicalParty) {
        if (politicalParty == null || politicalParty.isEmpty() || politicalParty.isBlank()) {
            System.err.println("The political party must not be null, empty, or blank.");
            System.exit(3);
        }

        this.politicalParty = politicalParty;
    }

    public String getGovernor() {
        return Governor;
    }

    public void setGovernor(String Governor) {
        if (Governor == null || Governor.isEmpty() || Governor.isBlank()) {
            System.err.println("The Governor must not be null, empty, or blank.");
            System.exit(4);
        }
        this.Governor = Governor;
    }

    public String getSenator() {
        return senator;
    }

    public void setSenator(String senator) {

        if (senator == null || senator.isEmpty() || senator.isBlank()) {
            System.err.println("The senator must not be null, empty, or blank.");
            System.exit(5);
        }
        this.senator = senator;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        if (population < 0) {
            System.err.println("The population must be greater than zero.");
            System.exit(6);
        }
        this.population = population;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", abbreviation='" + abbreviation + '\'' +
                ", politicalParty='" + politicalParty + '\'' +
                ", Governor='" + Governor + '\'' +
                ", senator='" + senator + '\'' +
                ", population=" + population +
                '}';
    }
}
