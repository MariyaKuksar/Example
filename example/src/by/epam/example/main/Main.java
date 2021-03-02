package by.epam.example.main;

import java.util.ArrayList;
import java.util.List;

import by.epam.example.comporator.PersonIdComporator;
import by.epam.example.entity.Student;

public class Main {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(5, "Ivanov"));
		students.add(new Student(3, "Petrov"));
		students.add(new Student(1, "Sidorov"));
		students.add(new Student(4, "Smirnov"));
		students.add(new Student(2, "Istomin"));
		System.out.println(students.toString());
		students.sort(new PersonIdComporator());
		System.out.println(students.toString());
	}
}
