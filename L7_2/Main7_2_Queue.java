package L7_2;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Main7_2_Queue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> elevatorFloors = new LinkedList<>();
        while (true) {
            try {
                System.out.println("Введите этаж (0 для завершения)");
                int floor = scanner.nextInt();
                if (floor == 0) {
                    elevatorFloors.add(floor);
                    break;
                }
                if (floor < 0 || floor > 25) {
                    System.out.println("Такого этажа нет");
                    continue;
                }

                elevatorFloors.add(floor);

            } catch (Exception e) {
                System.out.println("Ошибка ввода!");
                scanner.next();
            }

        }
        System.out.println("Полученная очередь этажей: " + elevatorFloors);
        StringBuffer path = new StringBuffer();

        while (!elevatorFloors.isEmpty()) {
            int floor = elevatorFloors.poll();
            path.append("этаж ").append(floor);

            if (!elevatorFloors.isEmpty()) {
                path.append(" -> ");
            }
        }

        System.out.println(path.toString());
    }

}
