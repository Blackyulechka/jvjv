package L7_5;

public class Candidate {
    private String name;
    private String gender;
    private String age;
    private int relevance;
    private int rating;

    public Candidate(String name, String gender, String age, int rel, int rate) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.relevance = rel;
        this.rating = rate;
    }

    @Override
    public String toString() {
        return name + " (" + age + ") ," + relevance + ", " + rating;
    }

    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }
}
