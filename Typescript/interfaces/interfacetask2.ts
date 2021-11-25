class Employee{
    id:number;
    name:string;
    salary:number

    constructor(id:number,name:string,salary:number){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    showDetail1():string{
        return `Employye id: ${this.id} Employee name: ${this.name} Salary ${this.salary}` 
    }

}
class Manager extends Employee{
    member:number
    department:string;

    constructor(id:number,name:string,salary:number,member:number,department:string){
        super(id,name,salary)
        this.member=member;
        this.department=department;
    }

    showDetail2():string{
        return `Member: ${this.member} Department ${this.department}`;
    }
    calcGrossSalary(ta:number,da:number,hra:number){
        return this.salary+ta+da+hra;
    }
    printId(managerId:number){
        return this.id;

    }

}

let emp=new Employee(101,"Vinay",20000);
console.log(emp.showDetail1());

let emp1=new Manager(105,"Abhi",12000,15,"Sales");
console.log(emp1.showDetail2());
console.log("Manager salary: "+emp1.calcGrossSalary(1000,2000,3000));
console.log("Manager Id: "+emp1.printId(106));