class Person{
    adharNum:number
    name:string
    age:number

    constructor(adharNum:number,name:string,age:number){
        this.adharNum=adharNum;
        this.name=name;
        this.age=age;
    }

    showDetail():string{
        return `Adhar number: ${this.adharNum} name: ${this.name} age ${this.age}` 
    }
}

class Student extends Person{
    rollno:number
    standard:string

    constructor(adharNum:number,name:string,age:number,rollno:number,standard:string){
        super(adharNum,name,age)
        this.rollno=rollno;
        this.standard=standard;

    }

    showDetail():string{
        return `${super.showDetail()} Roll no ${this.rollno} standard ${this.standard}`
    }

    calcPercentage(m1:number,m2:number,m3:number):number{
        return Math.round((m1+m2+m3)/3);
    }
}
class Employ extends Person{
    empid:number
    salary:number

    constructor(adharNum:number,name:string,age:number,rollno:number,standard:string,empid:number,salary:number){
        super(adharNum,name,age)
        this.empid=empid;
        this.salary=salary;
    }

    showDetail():string{
        return 'Employyeid ${this.empid} salary ${this.salary}';
    }
    calcGrossSalary(ta:number,da:number,hra:number){
        return this.salary+ta+da+hra;
    }
}

let obj:Person;

obj=new Person(8888,"savita",45);
console.log("Person detail"+obj.showDetail);

obj=new Student(5666474,"karuna",12,1111,'4th satndard');
console.log("student detail"+obj.showDetail);

obj=new Employ(5666474,"krishna",34,12,"4th Standard",5450,8000);
console.log("Employee detail"+obj.showDetail);

let obj1:Student;
obj1=new Student(12333,"addsjs",56,34,"sdsg")

let obj2:Person;
obj1=new Student(12333,"addsjs",56,34,"sdsg")


