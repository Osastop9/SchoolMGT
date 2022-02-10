package Campus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Table table1 = new Table("blue", 10, 20, 20);
        Table table2 = new Table("green", 10, 20, 20);
        Table table3 = new Table("violet", 10, 20, 20);

        ArrayList<Table> tables = new ArrayList<>(List.of(table1, table2, table3));
        StudyRoom studyRoom = new StudyRoom("#12345", tables);
        table1.setColor("pink");

        ArrayList<StudyRoom> studyRooms = new ArrayList<>();
        studyRooms.add(studyRoom);

        Campus campus = new Campus("Edo Tech Prak", "Benin", studyRooms);

        campus.studyRoom.get(0).tables.get(0).setColor("Pink");
        System.out.println(campus.studyRoom.get(0).tables.get(0).color);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Provide the number of tables you would like to have?");
        int noOfTables = scanner.nextInt();


        for (int i = 0; i < noOfTables; i++) {
            System.out.println("Table #" + (i+1) + " color: ");
            String color = scanner.next();

            System.out.println("Table #" + (i+1) + " length: ");
            int length = scanner.nextInt();

            System.out.println("Table #" + (i+1) + " breadth: ");
            int breadth = scanner.nextInt();

            System.out.println("Table #" + (i+1) + " height: ");
            int height = scanner.nextInt();


            Table table = new Table(color, length, breadth, height);
            tables.add(table);
        }

        for (int i = 0; i < tables.size(); i++) {
            System.out.println(tables.get(i).color);
        }

        String string = scanner.nextLine();
        System.out.println(string);
    }
}
