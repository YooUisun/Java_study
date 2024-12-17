package study.quiz;

public class SalaryMan {

		
		int salary;
		
		SalaryMan() {
			salary = 1000000;
		}
		
		SalaryMan(int salary) {
			this.salary = salary;
		}
		
		int getAnnualGross() {
			return (salary * 12) + (salary * 5);
		}
		
	}


