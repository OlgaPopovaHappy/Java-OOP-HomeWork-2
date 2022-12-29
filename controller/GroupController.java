package controller;

import data.StudentGroup;
import service.StudentGroupServiceImpl;

public class GroupController implements Controller<StudentGroup, Integer> {
    private final StudentGroupServiceImpl studentGroupService;

    public GroupController(StudentGroupServiceImpl studentGroupService) {
        this.studentGroupService = studentGroupService;
    }


    public StudentGroup save(StudentGroup group) {
        return null;
    }

    public StudentGroup findById(Integer id) {
        return null;
    }
}
