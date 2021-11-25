class Person {
    constructor(adharNum, name, age) {
        this.adharNum = adharNum;
        this.name = name;
        this.age = age;
    }
    showDetail() {
        return `Adhar number: ${this.adharNum} name: ${this.name} age ${this.age}`;
    }
}
class Student extends Person {
    constructor(adharNum, name, age, rollno, standard) {
        super(adharNum, name, age);
        this.rollno = rollno;
        this.standard = standard;
    }
    showDetail() {
        return `${super.showDetail()} Roll no ${this.rollno} standard ${this.standard}`;
    }
    calcPercentage(m1, m2, m3) {
        return Math.round((m1 + m2 + m3) / 3);
    }
}
class Employ extends Person {
    constructor(adharNum, name, age, rollno, standard, empid, salary) {
        super(adharNum, name, age);
        this.empid = empid;
        this.salary = salary;
    }
    showDetail() {
        return 'Employyeid ${this.empid} salary ${this.salary}';
    }
    calcGrossSalary(ta, da, hra) {
        return this.salary + ta + da + hra;
    }
}
let obj;
obj = new Person(8888, "savita", 45);
console.log("Person detail" + obj.showDetail);
obj = new Student(5666474, "karuna", 12, 1111, '4th satndard');
console.log("student detail" + obj.showDetail);
obj = new Employ(5666474, "krishna", 34, 12, "4th Standard", 5450, 8000);
console.log("Employee detail" + obj.showDetail);
let obj1;
obj1 = new Student(12333, "addsjs", 56, 34, "sdsg");
let obj2;
obj1 = new Student(12333, "addsjs", 56, 34, "sdsg");
