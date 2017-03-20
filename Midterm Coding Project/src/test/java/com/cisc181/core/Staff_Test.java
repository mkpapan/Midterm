package com.cisc181.core;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {
	
	static ArrayList<Staff> stafflst = new ArrayList<Staff>();

	public static Date newDate(int yr, int mon, int day) {
		Calendar cal = Calendar.getInstance();
		cal.set(yr, mon, day);
		return cal.getTime();
	}

	@BeforeClass
	public static void setup() throws PersonException {


		stafflst.add(new Staff("Mays", "Bill", "idkman", newDate(1982, 8, 7), "Oxyclean Drive", "(800)-666-666",
				"hgjh@jg.com", "4-5", 1, 54000, newDate(2011, 1, 1), eTitle.CZAR));

		stafflst.add(new Staff("Papandrea", "Mary", "Kathrine", newDate(1998, 4, 28), "39 stoner Drive", "(860)-807-5395",
				"mkpapan@udel.com", "2-9", 2, 700000, newDate(2012, 2, 2), eTitle.ADMIRAL));

		stafflst.add(new Staff("Name", "Name", "Name", newDate(1945, 7, 17), " name Street", "(300)-300-3000",
				"jjhdlksjag@jhk.com", "5-6", 3, 23000, newDate(2013, 3, 3), eTitle.MS));

		stafflst.add(new Staff("Lecter", "Hannibal", "the Cannibal", newDate(1987, 2, 13), "Cannibal street", "(302)-666-6666",
				"notamurderer@flesh.com", "never", 4, 2000000, newDate(2014, 4, 4), eTitle.SAINT));

		stafflst.add(new Staff("Burbank", "Truman", "idkman", newDate(1972, 5, 29), "i cant remeber Street", "(302)-645-4432",
				"notemail@email.com", "1-5", 5, 73000, newDate(2015, 5, 5), eTitle.MR));
	}

	@Test
	public void testSalary() throws PersonException {
		double sum = 0;
		for (Staff avgStaff : stafflst) {
			sum += avgStaff.getSalary();
		}
		double average = sum / stafflst.size();
		assertEquals(average, 44400, .01);
	}

	@Test(expected = PersonException.class)
	public void testDOBException() throws PersonException {

		new Staff("Burbank", "Truman", "idkman", newDate(1900, 5, 29), "i cant remeber Street", "(302)-645-4432",
				"notemail@email.com", "1-5", 5, 73000, newDate(2015, 5, 5), eTitle.MR);
	}

	@Test(expected = PersonException.class)
	public void testPhoneNumException() throws PersonException {
		new Staff("Burbank", "Truman", "idkman", newDate(1972, 5, 29), "i cant remeber Street", "(302)-645-44432",
				"notemail@email.com", "1-5", 5, 73000, newDate(2015, 5, 5), eTitle.MR);
	}
}
