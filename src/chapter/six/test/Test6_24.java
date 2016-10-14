package chapter.six.test;

public class Test6_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printTime();

	}

	public static void printTime() {
		long timeDay = System.currentTimeMillis() / 1000 / 60 / 60 / 24;
		int year = 1970;
		int sumDay = 0;
		while (true) {
			if (sumDay > timeDay) {
				year--;
				sumDay = sumDay - (isLeapYear(year) == true ? 366 : 365);
				break;
			}
			if (isLeapYear(year))
				sumDay += 366;
			else
				sumDay += 365;
			year++;
		}
		int day = (int) (timeDay - sumDay);
		int month = getMonth(year, day);
		day = getFirstDay(year, month, day);
		day=getSecondDay(year, month, day);
		System.out.print(year + " " + month + " " + day);
	}

	public static boolean isLeapYear(int year) {
		return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ? true : false;
	}

	public static int getFirstDay(int year, int month, int day) {
		if (isLeapYear(year)) {
			switch (month) {
			case 1:
				return day - 31;
			case 2:
				return day - (31 + 28);
			case 3:
				return day - (31 + 28 + 31);
			case 4:
				return day - (31 + 28 + 31 + 30);
			case 5:
				return day - (31 + 28 + 31 + 30 + 31);
			case 6:
				return day - (31 + 28 + 31 + 30 + 31 + 30);
			case 7:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31);
			case 8:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31);
			case 9:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30);
			case 10:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31);
			case 11:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30);
			case 12:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31);
			}

		} else {
			switch (month) {
			case 1:
				return day - 31;
			case 2:
				return day - (31 + 28);
			case 3:
				return day - (31 + 28 + 31);
			case 4:
				return day - (31 + 28 + 31 + 30);
			case 5:
				return day - (31 + 28 + 31 + 30 + 31);
			case 6:
				return day - (31 + 28 + 31 + 30 + 31 + 30);
			case 7:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31);
			case 8:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31);
			case 9:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30);
			case 10:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31);
			case 11:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30);
			case 12:
				return day - (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + 31);

			}
		}
		return -1;
	}

	public static int getSecondDay(int year, int month, int day) {
		if (isLeapYear(year)) {
			switch (month) {
			case 1:
				return 31 + day;
			case 2:
				return 28 + day;
			case 3:
				return 31 + day;
			case 4:
				return 30 + day;
			case 5:
				return 31 + day;
			case 6:
				return 30 + day;
			case 7:
				return 31 + day;
			case 8:
				return 31 + day;
			case 9:
				return 30 + day;
			case 10:
				return 31 + day;
			case 11:
				return 30 + day;
			case 12:
				return 31 + day;

			}

		} else {
			switch (month) {
			case 1:
				return 31 + day;
			case 2:
				return 28 + day;
			case 3:
				return 31 + day;
			case 4:
				return 30 + day;
			case 5:
				return 31 + day;
			case 6:
				return 30 + day;
			case 7:
				return 31 + day;
			case 8:
				return 31 + day;
			case 9:
				return 30 + day;
			case 10:
				return 31 + day;
			case 11:
				return 30 + day;
			case 12:
				return 31 + day;
			}
		}
		return -1;
	}

	public static int getMonth(int year, int day) {
		if (day - 31 > 0) {
			day = day - 31;
			if (isLeapYear(year)) {
				if (day - 29 > 0) {
					day = day - 29;
					if (day - 31 > 0) {
						day = day - 31;
						if (day - 30 > 0) {
							day = day - 30;
							if (day - 31 > 0) {
								day = day - 31;
								if (day - 30 > 0) {
									day = day - 30;
									if (day - 31 > 0) {
										day = day - 31;
										if (day - 31 > 0) {
											day = day - 31;
											if (day - 30 > 0) {
												day = day - 30;
												if (day - 31 > 0) {
													day = day - 31;
													if (day - 30 > 0) {
														day = day - 30;
														if (day - 31 > 0) {
															return 12;
														} else
															return -1;
													} else
														return 11;
												} else
													return 10;
											} else
												return 9;
										} else
											return 8;
									} else
										return 7;
								} else
									return 6;
							} else
								return 5;
						} else
							return 4;
					} else
						return 3;
				} else
					return 2;
			} else {
				if (day - 28 > 0) {
					day = day - 28;
					if (day - 31 > 0) {
						day = day - 31;
						if (day - 30 > 0) {
							day = day - 30;
							if (day - 31 > 0) {
								day = day - 31;
								if (day - 30 > 0) {
									day = day - 30;
									if (day - 31 > 0) {
										day = day - 31;
										if (day - 31 > 0) {
											day = day - 31;
											if (day - 30 > 0) {
												day = day - 30;
												if (day - 31 > 0) {
													day = day - 31;
													if (day - 30 > 0) {
														day = day - 30;
														if (day - 31 > 0) {
															return 12;
														} else
															return -1;
													} else
														return 11;
												} else
													return 10;
											} else
												return 9;
										} else
											return 8;
									} else
										return 7;
								} else
									return 6;
							} else
								return 5;
						} else
							return 4;
					} else
						return 3;

				} else
					return 2;
			}
		} else
			return 1;
	}
}
