
public class Retirement {

	public static void main(String[] args) {	
		double initialSalary = 10000;
		double averageLocalSalary = 5000;
		double anualSalaryIncrement = 0.05;
		double personalPensionRate = 0.08;
		double companyPensionRate = 0.2;
		double totalPersonalPension = 0;
		double totalCompanyPension = 0;
		double totalPension = 0;
		double basicMonthlyPayout = 0;
		double personalMonthlyPayout = 0;
		double totalMonthlyPayout = 0;
		double pensionSum = 0;
		double investRate = 0.09;
		double totalInvestSum = 0;
		int totalPayoutMonth = 139;
		int initialAge = 22;
		int retirementAge = 60;
		int lifespan = 74;
		int initialYear = 2022;
		
				
		for (int i=initialAge;i<retirementAge;i++) {
			totalPersonalPension += initialSalary * 12 * personalPensionRate;
			totalCompanyPension += initialSalary * 12 * companyPensionRate;
			totalPension = totalPersonalPension + totalCompanyPension;
			totalInvestSum += initialSalary * 12 * (personalPensionRate + companyPensionRate);
			totalInvestSum = totalInvestSum * (1+investRate);
			initialSalary = initialSalary * (1+anualSalaryIncrement);
			averageLocalSalary = averageLocalSalary * (1 + anualSalaryIncrement);
			initialYear++;
		}
		
		basicMonthlyPayout =  averageLocalSalary * (1 + 2)/2 * (retirementAge - initialAge) * 0.01;
		personalMonthlyPayout = totalPersonalPension/totalPayoutMonth;
		totalMonthlyPayout = basicMonthlyPayout + personalMonthlyPayout;
		
		System.out.println("养老金缴纳总额: " + (int)totalPension + ", 个人部分: " + (int)totalPersonalPension + ", 公司部分: " + (int)totalCompanyPension);
		System.out.println(initialYear + "年退休时, 你的工资 : " + (int)initialSalary + ", 社平工资: " + (int)averageLocalSalary);
		System.out.println("如果投资标普500," + initialYear + "年，基金余额: " + (int)totalInvestSum);
		System.out.println("养老金第一年月收入: " + (int)totalMonthlyPayout + ",其中基础养老金: " + (int)basicMonthlyPayout + ", 个人养老金: " + (int)personalMonthlyPayout);
		
		for(int i=retirementAge;i<lifespan;i++) {
			pensionSum += basicMonthlyPayout * 12 + personalMonthlyPayout * 12;
			basicMonthlyPayout = basicMonthlyPayout * (1+anualSalaryIncrement);
		}
		System.out.println("男性平均死亡年龄的领取总额: " + (int)pensionSum);
	}
	
}