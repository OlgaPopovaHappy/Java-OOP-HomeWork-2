package data;

import java.util.Iterator;
import java.util.List;

/** ДЗ - 3
 * Создать класс GroupStream, содержащий в себе список StudentGroup
 * и реализующий интерфейс Iterable<StudentGroup>
 */
public class GroupStream implements Iterable<StudentGroup> {
    private List<StudentGroup> studentGroup;

    public GroupStream(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<StudentGroup> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }
}
