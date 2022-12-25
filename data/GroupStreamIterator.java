package data;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private GroupStream groupStream;
    private List<StudentGroup> studentGroupList;
    private int cursor;

    public GroupStreamIterator(GroupStream groupStream, List<StudentGroup> studentGroupList, int cursor) {
        this.groupStream = groupStream;
        this.studentGroupList = studentGroupList;
        this.cursor = cursor;
    }

    public GroupStreamIterator(GroupStream groupStream) {
        this.groupStream = groupStream;
        this.studentGroupList = studentGroupList;
        this.cursor = cursor;
    }

    public GroupStream getGroupStream() {
        return groupStream;
    }

    public void setGroupStream(GroupStream groupStream) {
        this.groupStream = groupStream;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public int getCursor() {
        return cursor;
    }

    public void setCursor(int cursor) {
        this.cursor = cursor;
    }

    @Override
    public boolean hasNext() {
        return  cursor < studentGroupList.size();
    }

    @Override
    public StudentGroup next() {
        return studentGroupList.get(cursor++);
    }

    @Override
    public void remove() {
        this.studentGroupList.remove(cursor);
    }
}
