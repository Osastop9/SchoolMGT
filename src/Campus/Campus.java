package Campus;

import java.util.ArrayList;

public class Campus {
    String campusName;
    String campusLocation;
    ArrayList<StudyRoom> studyRoom;

    public Campus(String campusName, String campusLocation, ArrayList<StudyRoom> studyRoom) {
        this.campusName = campusName;
        this.campusLocation = campusLocation;
        this.studyRoom = studyRoom;
    }
}
