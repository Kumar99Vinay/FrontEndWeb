class Employee{
    empId:number;
    empName:string;
    empSalary:number
    married:boolean
    

    showDetail():string{
        return" id"+this.empId+" name:"+this.empName+" salary:"+this.empSalary+" married?"+this.married;

    }

    showDetail2():string{
        return `id: ${this.empId} name: ${this.empName} salary: ${this.empSalary} married: ${this.married}`
    }


}

let num:number;
let s1:string;
let emp1:Employee;//user defined data type
emp1=new Employee();//default constructor
emp1.empId=123;
emp1.empName="Vinay"
emp1.empSalary=12000;
emp1.married=true
let detail1=emp1.showDetail()
console.log(detail1)

let emp2:Employee;//user defined data type
emp2=new Employee();//default constructor
emp2.empId=123;
emp2.empName="Sumit"
emp2.empSalary=12000;
emp2.married=false
let detail2=emp1.showDetail2()
console.log(detail2)

