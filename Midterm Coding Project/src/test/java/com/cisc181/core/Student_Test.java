package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {


	static ArrayList<Student> students = new ArrayList<Student>();
	static ArrayList<Course> courses = new ArrayList<Course>();
	static ArrayList<Semester> semesters = new ArrayList<Semester>();
	static ArrayList<Section> sections = new ArrayList<Section>();

	static ArrayList<Enrollment> chem1 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> chem2 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> phyysics1 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> physics2 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> ns1 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> ns2 = new ArrayList<Enrollment>();


	public static Date newDate(int yr, int mon, int day) {
		Calendar cal2 = Calendar.getInstance();
		cal2.set(yr, mon, day);
		return cal2.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {
		Course chem = new Course(UUID.randomUUID(), "Chem", 100, eMajor.CHEM);
		Course physics = new Course(UUID.randomUUID(), "phyics", 100, eMajor.PHYSICS);
		Course ns = new Course(UUID.randomUUID(), "nursing", 100, eMajor.NURSING);

		courses.add(chem);
		courses.add(physics);
		courses.add(ns);

		Semester fall16 = new Semester(UUID.randomUUID(), newDate(2016, 8, 30), newDate(2016, 12, 9));
		Semester spring17 = new Semester(UUID.randomUUID(), newDate(2017, 2, 10), newDate(2017, 5, 26));

		semesters.add(spring17);
		semesters.add(fall16);

		Section fallchem = new Section(chem.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 101);
		Section fallphysics = new Section(physics.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 102);
		Section fallns = new Section(ns.getCourseID(), fall16.getSemesterID(), UUID.randomUUID(), 103);

		Section springchem = new Section(chem.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 104);
		Section springphysics = new Section(physics.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 105);
		Section springCns = new Section(ns.getCourseID(), spring17.getSemesterID(), UUID.randomUUID(), 106);

		sections.add(fallchem);
		sections.add(fallphysics);
		sections.add(fallns);
		sections.add(springchem);
		sections.add(springphysics);
		sections.add(springns);

		Student stud1 = new Student("qlwjegbk", "lwjf", "jhg", newDate(1995, 1, 1), eMajor.COMPSI, "poqweighfisJBD",
				"(111)-111-1111", "ubldksjbf;s", UUID.randomUUID());

		Student stud2 = new Student("jiaefbk"," ljkdsfkd","ajkbv;akj", newDate(1995, 2, 2), eMajor.COMPSI,
				"jbsdfjib", "(333)-333-3333", ";ajksdb;kjasbdv", UUID.randomUUID());

		Student stud3 = new Student("fred","fred","fred"", newDate(1994, 3, 3), eMajor.CHEM,
				"ld;kfn", "(444)-444-4444", "l;kkang", UUID.randomUUID());

		Student stud4 = new Student("ed","ed"," eddy", newDate(1994, 4, 4), eMajor.NURSING, "a;sldng",
				"(555)-555-5555", "ak;j;bg", UUID.randomUUID());

		Student stud5 = new Student("no", "please", "stop", newDate(1997, 5, 5), eMajor.PHYSICS,
				"l;zxn;", "(666)-666-6666","kjsbd", UUID.randomUUID());

		Student stud6 = new Student("too", "much", "work", newDate(1996, 6, 6), eMajor.NURSING,
				"ddl/fn", "(777)-777-7777", "oiiwentp9", UUID.randomUUID());

		Student stud7 = new Student("sdf ","lskb","lskdjn", newDate(1998, 7, 7), eMajor.PHYSICS, "powihg[o",
				"(888)-888-888", "aeprgn", UUID.randomUUID());

		Student stud8 = new Student("o;dknv","owiiht","dfbn", newDate(1995, 9, 8), eMajor.BUSINESS, "siipn",
				"(999)-999-9999", "-294inwt[b", UUID.randomUUID());

		Student stud9 = new Student(";dofj",";;sddfj","dskfj", newDate(1995, 10, 10), eMajor.COMPSI,
				"aoifn", "(000)-000-0000", "7698758", UUID.randomUUID());

		Student stud10 = new Student(";qavn","skjlfn","kdjfb;dsk", newDate(1994, 11, 11), eMajor.CHEM, ";sdlkkn soi",
				"(121)-121-1212", "jjbsdv;jksdb", UUID.randomUUID());

		students.add(stud1);
		students.add(stud2);
		students.add(stud3);
		students.add(stud4);
		students.add(stud5);
		students.add(stud6);
		students.add(stud7);
		students.add(stud8);
		students.add(stud9);
		students.add(stud10);


		ArrayList<Integer> gradeSet1 = new ArrayList<Integer>(Arrays.asList(98, 84, 36));
		ArrayList<Integer> gradeSet2 = new ArrayList<Integer>(Arrays.asList(85, 74, 90));
		ArrayList<Integer> gradeSet3 = new ArrayList<Integer>(Arrays.asList(99, 98, 97));

		for (int k = 0; k < students.size(); k++) {

			chem1.add(new Enrollment(sections.get(0).getSectionID(), students.get(k).getStudentID()));
			chem1.get(k).setGrade(gradeSet1.get(k));

			chem2.add(new Enrollment(sections.get(1).getSectionID(), students.get(k).getStudentID()));
			chem2.get(k).setGrade(gradeSet2.get(k));

			phyysics1.add(new Enrollment(sections.get(2).getSectionID(), students.get(k).getStudentID()));
			phyysics1.get(k).setGrade(gradeSet3.get(k));

			physics2.add(new Enrollment(sections.get(3).getSectionID(), students.get(k).getStudentID()));
			physics2.get(k).setGrade(gradeSet1.get(k));

			ns1.add(new Enrollment(sections.get(4).getSectionID(), students.get(k).getStudentID()));
			ns1.get(k).setGrade(gradeSet2.get(k));

			ns2.add(new Enrollment(sections.get(5).getSectionID(), students.get(k).getStudentID()));
			ns2.get(k).setGrade(gradeSet3.get(k));
		}

	}

	public double calcStudentGPA(ArrayList<Enrollment> chem1, ArrayList<Enrollment> chem2, ArrayList<Enrollment> phyysics1,
			ArrayList<Enrollment> physics2, ArrayList<Enrollment> ns1, ArrayList<Enrollment> ns2, int Student) {
		
		final int COURSENUM = 6;
		
		double GPAAVG = 0;

		if ((chem1.get(Student).getGrade() + chem2.get(Student).getGrade() + physics2.get(Student).getGrade()
				+ phyysics1.get(Student).getGrade() + ns1.get(Student).getGrade() + ns2.get(Student).getGrade())
				/ COURSENUM >= 95) {
			GPAAVG = 4.0;
		} else if ((chem1.get(Student).getGrade() + chem2.get(Student).getGrade() + physics2.get(Student).getGrade()
				+ phyysics1.get(Student).getGrade() + ns1.get(Student).getGrade() + ns2.get(Student).getGrade())
				/ COURSENUM >= 90) {
			GPAAVG = 3.75;
		} else if ((chem1.get(Student).getGrade() + chem2.get(Student).getGrade() + physics2.get(Student).getGrade()
				+ phyysics1.get(Student).getGrade() + ns1.get(Student).getGrade() + ns2.get(Student).getGrade())
				/ COURSENUM >= 85) {
			GPAAVG = 3.50;
		} else if ((chem1.get(Student).getGrade() + chem2.get(Student).getGrade() + physics2.get(Student).getGrade()
				+ phyysics1.get(Student).getGrade() + ns1.get(Student).getGrade() + ns2.get(Student).getGrade())
				/ COURSENUM >= 80) {
			GPAAVG = 3.00;
		} else if ((chem1.get(Student).getGrade() + chem2.get(Student).getGrade() + physics2.get(Student).getGrade()
				+ phyysics1.get(Student).getGrade() + ns1.get(Student).getGrade() + ns2.get(Student).getGrade())
				/ COURSENUM >= 75) {
			GPAAVG = 2.50;
		} else if ((chem1.get(Student).getGrade() + chem2.get(Student).getGrade() + physics2.get(Student).getGrade()
				+ phyysics1.get(Student).getGrade() + ns1.get(Student).getGrade() + ns2.get(Student).getGrade())
				/ COURSENUM >= 70) {
			GPAAVG = 2.00;
		} else if ((chem1.get(Student).getGrade() + chem2.get(Student).getGrade() + physics2.get(Student).getGrade()
				+ phyysics1.get(Student).getGrade() + ns1.get(Student).getGrade() + ns2.get(Student).getGrade())
				/ COURSENUM >= 65) {
			GPAAVG = 1.50;
		} else if ((chem1.get(Student).getGrade() + chem2.get(Student).getGrade() + physics2.get(Student).getGrade()
				+ phyysics1.get(Student).getGrade() + ns1.get(Student).getGrade() + ns2.get(Student).getGrade())
				/ COURSENUM >= 60) {
			GPAAVG = 1.00;
		} else {
			GPAAVG = 0.00;
		}
		return GPAAVG;
	}

	@Test
	public void StudentGPATest() {
		assertEquals(4.0, calcStudentGPA(chem1, chem2, physics2, phyysics1, ns1, ns2, 0), .001);
		assertEquals(2.0, calcStudentGPA(chem1, chem2, physics2, phyysics1, ns1, ns2, 1), .001);
		assertEquals(0.0, calcStudentGPA(chem1, chem2, physics2, phyysics1, ns1, ns2, 2), .001);
		assertEquals(3.75, calcStudentGPA(chem1, chem2, physics2, phyysics1, ns1, ns2, 3), .001);
		assertEquals(2.0, calcStudentGPA(chem1, chem2, physics2, phyysics1, ns1, ns2, 4), .001);
		assertEquals(3.5, calcStudentGPA(chem1, chem2, physics2, phyysics1, ns1, ns2, 5), .001);
		assertEquals(2.5, calcStudentGPA(chem1, chem2, physics2, phyysics1, ns1, ns2, 6), .001);
		assertEquals(1.5, calcStudentGPA(chem1, chem2, physics2, phyysics1, ns1, ns2, 7), .001);
		assertEquals(3.0, calcStudentGPA(chem1, chem2, physics2, phyysics1, ns1, ns2, 8), .001);
		assertEquals(1.0, calcStudentGPA(chem1, chem2, physics2, phyysics1, ns1, ns2, 9), .001);
	}


	public static double CourseGr(ArrayList<Enrollment> courses) {

		double avg = 0;
		double courseAvg = 0;

		for (int y = 0; y < students.size(); y++) {
			avg += courses.get(y).getGrade();
			courseAvg = (avg / students.size());
		}
		return courseAvg;
	}

	@Test
	public void testCourseGr() {
		assertEquals(75.4, CourseGr(chem1), .01);
		assertEquals(76.7, CourseGr(chem2), 01);
		assertEquals(75.2, CourseGr(physics2), .01);
		assertEquals(75.4, CourseGr(phyysics1), .01);
		assertEquals(76.7, CourseGr(ns1), 01);
		assertEquals(75.2, CourseGr(ns2), .01);
	}

	public static void ChangeOfMajor(eMajor maj, Student stu) {
		stu.setMajor(maj);
	}

	@Test
	public void testMajorChangeStudent() {
		ChangeOfMajor(eMajor.CHEM, students.get(5));
		assertEquals(eMajor.CHEM, students.get(5).getMajor());
	}

}