package Assessment_3;

public class ClassRoom {


    public int getClassId() {
        return classId;
    }

    public char[] getClassNames() {
        return classNames;
    }

    private int classId;
    private char[] classNames;

    ClassRoom(int x, char cl[]){
        this.classId=x;
        this.classNames=cl;
    }
}
