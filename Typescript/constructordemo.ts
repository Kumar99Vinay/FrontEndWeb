class Emp{
     empId:number;
    empName:string;
    empSalary:number
    married:boolean

    constructor(id:number,name:string,salary:number,status ?:boolean){
        this.empId=id;
        this.empName=name
        this.empSalary=salary
        this.married=status

    }

 
    

    showDetail():string{
        return" id"+this.empId+" name:"+this.empName+" salary:"+this.empSalary+" married?"+this.married;

    }

    showDetail2():string{
        return `id: ${this.empId} name: ${this.empName} salary: ${this.empSalary} married: ${this.married}`
    }

}

let emp2=new Emp(666,"Poonam",10000,true)
console.log(emp2.showDetail())
emp2.empName="Mnan";
console.log(emp2.showDetail2())


let emp3=new Emp(666,"Poonam",10000)
console.log(emp3.showDetail())
emp3.empName="rohan";
console.log(emp3.showDetail2())

