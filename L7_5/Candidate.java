package L7_5;

public class Candidate {
    private String FIO;
    private String gender;
    private String age;
    private int relevance;
    private int rating;

    public Candidate(String FIO, String gender, String age, int rel, int rate) {
        this.FIO = FIO;
        this.gender = gender;
        this.age = age;
        this.relevance = rel;
        this.rating = rate;
    }

    @Override
    public String toString() {
        return FIO + " (" + age + ") ," + relevance + ", " + rating;
    }

    public int getRelevance() {
        return relevance;
    }

    public int getRating() {
        return rating;
    }

    public String getFIO() {
        return FIO;
    }
}
