package service;

import data.GroupStream;
import data.comparator.GroupStreamComparator;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/** ДЗ - 3
 * Создать класс GroupStreamServiceImpl, добавив в него метод
 * сортировки списка потоков, используя созданный GroupStreamComparator
 */
public class GroupStreamServiceImpl {
    public void  sortGroupStream(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }
}
