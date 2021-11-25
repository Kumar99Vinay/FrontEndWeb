class Person{
    adharNum:number
    name:string
    age:number

    constructor(adharNum:number,name:string,age:number){
        this.adharNum=adharNum;
        this.name=name;
        this.age=age;
    }

    showPersonDetail():string{
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

    showStudentDetail():string{
        return `${this.showPersonDetail} Roll no ${this.rollno} standard ${this.standard}`
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

    showEmployeeDetail():string{
        return `${this.showPersonDetail} Employyeid ${this.empid} salary ${this.salary}`
    }
    calcGrossSalary(ta:number,da:number,hra:number){
        return this.salary+ta+da+hra;
    }
}

let stud=new Student(88888,"kar",12,111,'4th standard',);
let studdetail=stud.showStudentDetail();
console.log(studdetail);
let perct=stud.calcPercentage(78,90,90);
console.log(perct)

let emp1=new Employ(66666,'sunil',24,101,"3th satnd",10,67000)