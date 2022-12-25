package data.comparator;

import data.GroupStream;

import java.util.Comparator;

/** ДЗ - 3
 * Создать класс GroupStreamComparator<GroupStream>,
 * реализующий сравнение количества групп входящих в GroupStream
 */

public class GroupStreamComparator implements Comparator<GroupStream> {
    @Override
    public int compare(GroupStream groups1, GroupStream groups2) {
        return Integer.compare(
                groups1.getStudentGroup().size(), groups2.getStudentGroup().size());
    }
}
