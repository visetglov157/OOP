package homework_5;

import homework_5.service.init.Initializer;
import homework_5.service.randomizer.StudentClassGroupRandomizer;
import homework_5.view.SortType;
import homework_5.view.StudentClassView;
import homework_5.view.StudentView;
import homework_5.view.TeacherView;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Initializer init = new Initializer();
        StudentClassGroupRandomizer studentClassGroupRandomizer = init.getStudentClassGroupRandomizer();
        StudentView studentView = init.studentView;
        TeacherView teacherView = init.teacherView;
        StudentClassView classView = init.studentClassView;

        // Сформируем студентов и преподавателей из данных в /repository/data
        studentView.createRandom(12);
        studentView.sendOnConsole(SortType.ID);
        teacherView.createRandom(3);
        teacherView.sendOnConsole(SortType.ID);

        // Создадим учебную группу и сразу привлечем свободных преподавателей и студентов
        classView.createAndPopulate("Когтепрыг");
        classView.sendOnConsole(SortType.TEAM_ID);

        // Увеличим лимит преподавателей у созданной группы (id, новый лимит)
        classView.setStudentClassTeacherLimitById(1L, 2);
        classView.sendOnConsole(SortType.TEAM_ID);

        // Загрузим наименования учебных групп из /repository/data
        classView.load();
        classView.sendOnConsole(SortType.TEAM_ID);

        // Примем в наше заведение больше студентов и преподавателей
        studentView.create("Гарри Поттер", 16, "452-4077");
        studentView.createRandom(280);
        teacherView.createRandom(12);

        // Рандомно заполним свободные учебные группы
        studentClassGroupRandomizer.populateAllStudentClasses();
        classView.sendOnConsole(SortType.TEAM_ID);

        // Куда же попал Поттер на этот раз?
        classView.sendOnConsole(SortType.NONE, "Гарри Поттер");
    }

}