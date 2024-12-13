package bauyrzhan_abdaliyev.org;

import org.jusan.week2.oop1.lesson.SolutionsToLessonChallanges.task3.BankAccount;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class EmployeeApp {

    public static void main(String[] args) {

        Employee employee = new Employee();

        employee.setFirstName("Baur");
        employee.setLastName("Abdaliyev");
        employee.setPosition("QA");
        employee.setSalary(3000);

        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getPosition());
        System.out.println(employee.getSalary());


    }

}
