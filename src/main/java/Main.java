import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        class Department {
            private int x1;
            private int x2;
            private int y1;
            private int y2;

            public Department(String inputString) {
                String[] coordinates = inputString.split(" ");
                this.x1 = Integer.parseInt(String.valueOf(coordinates[0]));
                this.y1 = Integer.parseInt(String.valueOf(coordinates[1]));
                this.x2 = Integer.parseInt(String.valueOf(coordinates[2]));
                this.y2 = Integer.parseInt(String.valueOf(coordinates[3]));
            }
        }
        Scanner scanner = new Scanner(System.in);
        Department department1 = new Department(scanner.nextLine());
        Department department2 = new Department(scanner.nextLine());

        int[] sizesOfRectangle = new int[12];
        sizesOfRectangle[0] = Math.abs(department1.x1-department1.x2);
        sizesOfRectangle[1] = Math.abs(department2.x1-department2.x2);
        sizesOfRectangle[2] = Math.abs(department1.x1-department2.x1);
        sizesOfRectangle[3] = Math.abs(department1.x1-department2.x2);
        sizesOfRectangle[4] = Math.abs(department1.x2-department2.x1);
        sizesOfRectangle[5] = Math.abs(department1.x2-department2.x2);
        sizesOfRectangle[6] = Math.abs(department1.y1-department1.y2);
        sizesOfRectangle[7] = Math.abs(department2.y1-department2.y2);
        sizesOfRectangle[8] = Math.abs(department1.y1-department2.y1);
        sizesOfRectangle[9] = Math.abs(department1.y1-department2.y2);
        sizesOfRectangle[10] = Math.abs(department1.y2-department2.y1);
        sizesOfRectangle[11] = Math.abs(department1.y2-department2.y2);

        Arrays.sort(sizesOfRectangle);
        System.out.println(sizesOfRectangle[11]*sizesOfRectangle[11]);

    }
}
