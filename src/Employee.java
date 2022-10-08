public class Employee {
public String name;
public double salary;
public int workHours;
public int hireYear;

public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        }
public double tax(){
        if(this.salary<=0){
        throw new ArithmeticException("You have entered an invalid salary.");
        }
        else if(this.salary<1000){
        return 0;
        }else{
        double tax = (this.salary*0.03);
        return tax;
        }
}

public double bonus(){

        if ((this.workHours<=0) || (this.workHours>168)){
        throw new ArithmeticException("You have entered invalid work hours.");
        }
        else if(this.workHours <=40){
        return 0;
        }else {
        double bonus = (this.workHours-40)* 30;
        return bonus;
        }
}

public double raiseSalary(){
        double newSalary = (this.salary+bonus())-tax();

        if ((this.hireYear<1900) || (this.hireYear>2021)){
        throw new ArithmeticException("You have entered an invalid hire year.");
        }else if (2021-this.hireYear <=9){
        double raiseSalary = newSalary * 0.05;
         return raiseSalary;
        }else if ((2021-this.hireYear >9) && (2021-this.hireYear < 20)){
        double raiseSalary = newSalary * 0.1;
         return raiseSalary;
        }else if (2021-this.hireYear>=20) {
        double raiseSalary = newSalary *0.15;
         return raiseSalary;
        } else{
                return newSalary;
        }
}

@Override
public String toString() {
        return "Employee Name : " + this.name+"\n" +
        "Employee's Normal Salary : " + this.salary+ " TL\n" +
        "Weekly Working Hours : " + this.workHours+ "\n" +
        "Hiring Year : " + this.hireYear+ "\n" +
        "Tax Amount : " + tax()+ " TL \n" +
        "Total Bonus : " +bonus()+ " TL \n" +
        "Salary With Bonus and Tax : " + ((this.salary+bonus())-tax())+ " TL \n" +
        "Salary Raise : " + this.raiseSalary()+ " TL \n" +
        "Final Salary : " +((this.salary +raiseSalary() + bonus()) - tax()) + " TL";
        }
}

