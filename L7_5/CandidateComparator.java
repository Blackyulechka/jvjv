package L7_5;

import java.util.Comparator;

public class CandidateComparator implements Comparator<Candidate> {

    @Override
    public int compare(Candidate can1, Candidate can2) {
        int lastRelevance = Integer.compare(can2.getRelevance(), can1.getRelevance());
        if (lastRelevance != 0) return lastRelevance;

        int lastRating = Integer.compare(can2.getRating(), can1.getRating());
        if (lastRating != 0) return lastRating;
        return can1.getFIO().compareTo(can2.getFIO());
    }
}
