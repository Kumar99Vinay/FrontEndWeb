interface EmployeeIntf{
    empId:number;
    empName:string
    empSalary:number;
    getGrossSalary():number
}

class NeoTrainer implements EmployeeIntf{
    empId:number;
    empSalary:number
    empName:string
    emptechnology:string;

    getGrossSalary():number{
        return this.empSalary+4000+3000+5000+2000;
    }
}

class NeoDeveloper implements EmployeeIntf{
    empId:number;
    empName:string;
    empSalary:number;
    getGrossSalary():number{
        return this.empSalary+4000+3000+5000+1000;
    }
}

let trainer=new NeoTrainer();
trainer.empId=5577;
trainer.getGrossSalary();
let developer=new NeoDeveloper();
developer.getGrossSalary();
let obj:EmployeeIntf;
obj=new NeoTrainer();
obj.getGrossSalary();
obj=new NeoDeveloper();
obj.getGrossSalary();

