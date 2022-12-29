package data;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    private GroupStream groupStream;
    private List<StudentGroup> studentGroupList;
    private int cursor;

    public GroupStreamIterator(GroupStream groupStream) {
        this.groupStream = groupStream;
        this.studentGroupList = groupStream.getStudentGroupList();
    }

    @Override
    public boolean hasNext() {
        return cursor < studentGroupList.size();
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
