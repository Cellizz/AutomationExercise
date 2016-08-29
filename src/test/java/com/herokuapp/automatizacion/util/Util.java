package com.herokuapp.automatizacion.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Util {
	private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
	private static String today = formatter.format(LocalDate.now());
	private static String dayBefore = formatter.format(LocalDate.now().minusDays(new Random().nextInt(29) + 1));
	private static String dayAfter = formatter
			.format(LocalDate.now().plus(new Random().nextInt(29) + 1, ChronoUnit.DAYS));

	public static String getToday() {
		return today;
	}

	public static void setToday(String today) {
		Util.today = today;
	}

	public static String getDayBefore() {
		return dayBefore;
	}

	public static void setDayBefore(String dayBefore) {
		Util.dayBefore = dayBefore;
	}

	public static String getDayAfter() {
		return dayAfter;
	}

	public static void setDayAfter(String dayAfter) {
		Util.dayAfter = dayAfter;
	}

}
