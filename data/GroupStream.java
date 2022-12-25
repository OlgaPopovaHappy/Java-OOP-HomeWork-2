package data;

import org.jetbrains.annotations.NotNull;

import java.util.Iterator;
import java.util.List;

/** ДЗ - 3
 * Создать класс GroupStream, содержащий в себе список StudentGroup
 * и реализующий интерфейс Iterable<StudentGroup>
 */
public class GroupStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroupList;

    public GroupStream(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    public List<StudentGroup> getStudentGroupList() {
        return studentGroupList;
    }

    public void setStudentGroupList(List<StudentGroup> studentGroupList) {
        this.studentGroupList = studentGroupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }
}
