package Campus;

import java.util.ArrayList;
import java.util.List;

public class StudyRoom {
    public String roomID;
    public ArrayList<Table> tables;

    public StudyRoom(String roomID, ArrayList<Table> tables) {
        this.roomID = roomID;
        this.tables = new ArrayList<Table>(List.of(new Table(tables.get(0).color, tables.get(0).length, tables.get(0).breadth, tables.get(0).height)));
//        this.tables = tables;
    }

    public void setRoomID(String roomID) {
        this.roomID = roomID;
    }

    public int getNumberOfTables(){
        return tables.size();
    }
}
