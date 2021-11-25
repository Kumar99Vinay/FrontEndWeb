class Emp3{
    private empId:number;
    private empName:string;
    private empSalary:number
    private married:boolean
    static companyName:string;

    static{
        this.companyName="Neosoft Technologies"

    }

    constructor(id:number,name:string,salary:number,status ?:boolean){
        this.empId=id;
        this.empName=name
        this.empSalary=salary
        this.married=status

    }


    get emsal(){
        return this.empSalary
    }

    set emsal(sal:number){
        this.empSalary=sal;
    }

    get emid(){
        return this.emid
    }

    set emid(id:number){
        this.empId=id;
    }

    get emname(){
        return this.emname
    }

    set emname(name:string){
        this.empName=name;
    }
    

    showDetail():string{
        return" id"+this.empId+" name:"+this.empName+" salary:"+this.empSalary+" married?"+this.married;

    }

    showDetail2():string{
        return `id: ${this.empId} name: ${this.empName} salary: ${this.empSalary} married: ${this.married}`
    }

    private test(){
        console.log("Private method called")
    }

    calltest(){
        return this.test();
    }

}

let emp2=new Emp3(666,"Poonam",10000,true)
console.log(Emp3.companyName)
console.log(emp2.showDetail())
console.log(emp2.emsal)
emp2.emsal=120000;
console.log(emp2.emsal);

console.log(emp2.emid)
emp2.emid=462;
console.log(emp2.emid)

console.log(emp2.emname)
emp2.emname="Vinay";
console.log(emp2.emname)
//emp2.empName="Mnan";
console.log(emp2.showDetail2())
emp2.calltest();

Emp3.companyName="Neosoft Infra"





let emp3=new Emp3(666,"Poonam",10000)
console.log(Emp3.companyName)
console.log(emp3.showDetail())
console.log(emp3.emsal)
emp3.emsal=140000;
console.log(emp3.emsal)

console.log(emp3.emid)
emp3.emid=103;
console.log(emp3.emid)

console.log(emp3.emname)
emp3.emname="kapil";
console.log(emp3.emname)
//emp3.empName="rohan";
console.log(emp3.showDetail2())