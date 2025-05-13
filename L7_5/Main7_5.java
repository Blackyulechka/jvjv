package L7_5;

import java.util.TreeSet;

public class Main7_5 {
    public static void main(String[] args) {
        TreeSet<Candidate> candidatesRating = new TreeSet<>(new CandidateComparator());
        candidatesRating.add(new Candidate("Иванов Иван Иванович", "муж", "30", 4, 5));
        candidatesRating.add(new Candidate("Петров Иван Александрович", "муж", "25", 4, 3));
        candidatesRating.add(new Candidate("Максимов Иван Александрович", "муж", "35", 3, 5));
        candidatesRating.add(new Candidate("Сидоров Петр Николаевич", "муж", "28", 5, 5));
        candidatesRating.add(new Candidate("Ковалева Анна Сергеевна", "жен", "29", 5, 4));
        candidatesRating.add(new Candidate("Смирнова Ольга Игоревна", "жен", "31", 3, 4));
        candidatesRating.add(new Candidate("Новиков Дмитрий Викторович", "муж", "27", 4, 4));
        candidatesRating.add(new Candidate("Васильева Екатерина Дмитриевна", "жен", "26", 4, 5));
        candidatesRating.add(new Candidate("Попов Алексей Андреевич", "муж", "32", 3, 3));
        candidatesRating.add(new Candidate("Федорова Мария Ивановна", "жен", "33", 2, 5));
        candidatesRating.add(new Candidate("Лебедев Игорь Сергеевич", "муж", "34", 2, 4));
        candidatesRating.add(new Candidate("Козлов Павел Олегович", "муж", "24", 5, 3));

        System.out.println("Рэйтинг кандидатов топ 10");
        for (Candidate can : candidatesRating) {
            System.out.println(can);
        }

    }
}
