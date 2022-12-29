package data;

import java.util.Iterator;
import java.util.List;

public class GroupStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroupSList;

    public GroupStream(List<StudentGroup> studentGroup) {
        this.studentGroupSList = studentGroupSList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupSList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }
}
