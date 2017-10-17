package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {

	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Section> sections = new ArrayList<Section>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Student> students = new ArrayList<Student>();

	@BeforeClass
	public static void setup() {
		//COURSES TAKEN DEPENDING ON COURSE -3

		Course c1 = new Course("COMPUTER SCIENCE", 1, eMajor.COMPSI);
		courses.add(c1);

		Course c2 = new Course("CHEMISTRY", 2, eMajor.NURSING);
		courses.add(c2);

		Course c3 = new Course("CALCULUS", 3, eMajor.PHYSICS);
		courses.add(c3);

		// CREATE SEMESTER FOR FALL
		Calendar FallStart = Calendar.getInstance();
		FallStart.set(2017, 8, 30);

		Calendar FallEnd = Calendar.getInstance();
		FallEnd.set(2017, 12, 15);
		
		//CREATE SEMESTER FOR SPRING

		Calendar SpringStart = Calendar.getInstance();
		SpringStart.set(2018, 2, 7);

		Calendar SpringEnd = Calendar.getInstance();
		SpringEnd.set(2018, 5, 15);

		Semester Fall = new Semester(UUID.randomUUID(), FallStart.getTime(), FallEnd.getTime());
		semesters.add(Fall);

		Semester Spring = new Semester(UUID.randomUUID(), SpringStart.getTime(), SpringEnd.getTime());
		semesters.add(Spring);
		
		//CREATE SECTIONS FOR FALL - 3

		Section s1 = new Section(c2.getCourseID(), Fall.getSemesterID(), 1);
		semesters.add(s1);

		Section s2 = new Section(c1.getCourseID(), Fall.getSemesterID(), 2);
		semesters.add(s2);

		Section s3 = new Section(c1.getCourseID(), Fall.getSemesterID(), 3);
		semesters.add(s3);
		
		//CREATE SECTIONS FOR SPRING - 3

		Section s4 = new Section(c1.getCourseID(), Spring.getSemesterID(), 4);
		semesters.add(s4);

		Section s5 = new Section(c1.getCourseID(), Spring.getSemesterID(), 5);
		semesters.add(s5);

		Section s6 = new Section(c1.getCourseID(), Spring.getSemesterID(), 6);
		semesters.add(s6);

		//STUDENT AGE
		
		Calendar StudentBirth = Calendar.getInstance();
		StudentBirth.set(1997, 5, 9);
		
		//STUDENT CONTACT INFORMATION

		Student st0 = new Student("Billy", "Joseph", "Smith", StudentBirth.getTime(), eMajor.COMPSI,
				"1 One Road", "732 732 7327", "billy@aol.com");
		students.add(st0);
		Student st1 = new Student("Christine", "Elizabeth", "Georgio", StudentBirth.getTime(), eMajor.CHEM,
				"2 Two Road", "732 732 7321", "christine@ymail.com");
		students.add(st1);
		Student st2 = new Student("Bryan", "Ryan", "Andrew", StudentBirth.getTime(), eMajor.PHYSICS,
				"3 Three Road", "732 732 7322", "bryan@udel.edu");
		students.add(st2);
		Student st3 = new Student("Peter", "James", "Myer", StudentBirth.getTime(), eMajor.COMPSI,
				"4 Four Road", "121 232 4343", "lol@udel.edu");
		students.add(st3);
		Student st4 = new Student("Brianne", "Michaela", "Canner", StudentBirth.getTime(), eMajor.CHEM,
				"5 Five Road", "123 456 7890", "bmc@udel.edu");
		students.add(st4);
		Student st5 = new Student("Allison", "Jean", "Shovel", StudentBirth.getTime(), eMajor.COMPSI,
				"6 Six Road", "222 222 2222", "ajs@udel.edu");
		students.add(st5);
		Student st6 = new Student("Amanda", "Brooke", "Cirincione", StudentBirth.getTime(), eMajor.PHYSICS,
				"7 Seven Road", "111 111 6111", "abc@udel.edu");
		students.add(st6);
		Student st7 = new Student("Alana", "Fae", "Weisman", StudentBirth.getTime(), eMajor.CHEM,
				"8 Eight Road", "732 732 6736", "wisewoman@udel.edu");
		students.add(st7);
		Student st8 = new Student("Hailey", "Nicole", "Cecaila", StudentBirth.getTime(), eMajor.NURSING,
				"9 Nine Road", "732 732 7326", "haileyc@udel.edu");
		students.add(st8);
		Student st9 = new Student("Kim", "George", "Liu", StudentBirth.getTime(), eMajor.BUSINESS,
				"10 Ten Road", "732 732 7324", "liu@udel.edu");
		students.add(st9);

	}

	@Test
	public void testOne() {


		Enrollment e5 = new Enrollment(students.get(5).getStudentID(), students.get(5).getSectionID());
		e5.setGrade(94.00);

		Enrollment e6 = new Enrollment(students.get(6).getStudentID(), students.get(0).getSectionID());
		e6.setGrade(69.00);

		Enrollment e7 = new Enrollment(students.get(7).getStudentID(), students.get(1).getSectionID());
		e7.setGrade(75.00);

		Enrollment e8 = new Enrollment(students.get(8).getStudentID(), students.get(2).getSectionID());
		e8.setGrade(45.00);

		Enrollment e9 = new Enrollment(students.get(9).getStudentID(), students.get(3).getSectionID());
		e9.setGrade(79.00);
		
		Enrollment e0 = new Enrollment(students.get(0).getStudentID(), students.get(0).getSectionID());
		e0.setGrade(49.00);

		Enrollment e1 = new Enrollment(students.get(1).getStudentID(), students.get(1).getSectionID());
		e1.setGrade(94.00);

		Enrollment e2 = new Enrollment(students.get(2).getStudentID(), students.get(2).getSectionID());
		e2.setGrade(67.00);

		Enrollment e3 = new Enrollment(students.get(3).getStudentID(), students.get(3).getSectionID());
		e3.setGrade(82.00);

		Enrollment e4 = new Enrollment(students.get(4).getStudentID(), students.get(4).getSectionID());
		e4.setGrade(63.00);

		
		double GPA0 = ((e0.getGrade() / 100) * (courses.get(0).getGradePoints() * 4)) / courses.get(0).getGradePoints();
		double GPA1 = ((e1.getGrade() / 100) * (courses.get(1).getGradePoints() * 4)) / courses.get(1).getGradePoints();
		double GPA2 = ((e2.getGrade() / 100) * (courses.get(2).getGradePoints() * 4)) / courses.get(2).getGradePoints();
		double GPA3 = ((e3.getGrade() / 100) * (courses.get(0).getGradePoints() * 4)) / courses.get(0).getGradePoints();
		double GPA4 = ((e4.getGrade() / 100) * (courses.get(1).getGradePoints() * 4)) / courses.get(1).getGradePoints();
		double GPA5 = ((e5.getGrade() / 100) * (courses.get(2).getGradePoints() * 4)) / courses.get(2).getGradePoints();
		double GPA6 = ((e6.getGrade() / 100) * (courses.get(0).getGradePoints() * 4)) / courses.get(0).getGradePoints();
		double GPA7 = ((e7.getGrade() / 100) * (courses.get(1).getGradePoints() * 4)) / courses.get(1).getGradePoints();
		double GPA8 = ((e8.getGrade() / 100) * (courses.get(2).getGradePoints() * 4)) / courses.get(2).getGradePoints();
		double GPA9 = ((e9.getGrade() / 100) * (courses.get(0).getGradePoints() * 4)) / courses.get(0).getGradePoints();

		assertEquals(3.50, GPA0, 0);
		assertEquals(3.00, GPA1, 0);
		assertEquals(3.25, GPA2, 0);
		assertEquals(3.10, GPA3, 0);
		assertEquals(1.90, GPA4, 0);
		assertEquals(4.00, GPA5, 0);
		assertEquals(1.50, GPA6, 0);
		assertEquals(1.00, GPA7, 0);
		assertEquals(2.50, GPA8, 0);
		assertEquals(3.20, GPA9, 0);

		
		double CourseOneAvg = (e0.getGrade() + e3.getGrade() + e6.getGrade() + e9.getGrade()) / 4;
		CourseOneAvg = Math.round(CourseOneAvg * 100.00) / 100.00;

		double CourseTwoAvg = (e1.getGrade() + e4.getGrade() + e7.getGrade()) / 3;
		CourseTwoAvg = Math.round(CourseTwoAvg * 100.00) / 100.00;

		double CourseThreeAvg = (e2.getGrade() + e5.getGrade() + e8.getGrade()) / 3;
		CourseThreeAvg = Math.round(CourseThreeAvg * 100.00) / 100.00;

		assertEquals(69.75, CourseOneAvg, 0);
		assertEquals(77.33, CourseTwoAvg, 0);
		assertEquals(68.67, CourseThreeAvg, 0);

	}

	@Test
	public void  changeMajor() {

		
		students.get(2).setMajor(eMajor.CHEM);
		assertTrue(students.get(0).getMajor() == "CHEMISTRY");

	}

}