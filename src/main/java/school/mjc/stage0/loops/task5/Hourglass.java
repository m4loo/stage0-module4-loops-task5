package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        int spaces = 0;
        int matters = height;
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= spaces / 2; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= matters; j++) {
                System.out.print(8);
            }
            for (int j = 1; j <= spaces / 2; j++) {
                System.out.print(" ");
            }
            System.out.println();
            if (height % 2 == 0 && i == height / 2) {}
            else if (i <= height / 2) {
                spaces += 2;
                matters -= 2;
            } else {
                spaces -= 2;
                matters += 2;
            }

        }
    }
}
