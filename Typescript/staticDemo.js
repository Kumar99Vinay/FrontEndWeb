var _a;
class Emp3 {
    constructor(id, name, salary, status) {
        this.empId = id;
        this.empName = name;
        this.empSalary = salary;
        this.married = status;
    }
    get emsal() {
        return this.empSalary;
    }
    set emsal(sal) {
        this.empSalary = sal;
    }
    get emid() {
        return this.emid;
    }
    set emid(id) {
        this.empId = id;
    }
    get emname() {
        return this.emname;
    }
    set emname(name) {
        this.empName = name;
    }
    showDetail() {
        return " id" + this.empId + " name:" + this.empName + " salary:" + this.empSalary + " married?" + this.married;
    }
    showDetail2() {
        return `id: ${this.empId} name: ${this.empName} salary: ${this.empSalary} married: ${this.married}`;
    }
    test() {
        console.log("Private method called");
    }
    calltest() {
        return this.test();
    }
}
_a = Emp3;
(() => {
    _a.companyName = "Neosoft Technologies";
})();
let emp2 = new Emp3(666, "Poonam", 10000, true);
console.log(Emp3.companyName);
console.log(emp2.showDetail());
console.log(emp2.emsal);
emp2.emsal = 120000;
console.log(emp2.emsal);
console.log(emp2.emid);
emp2.emid = 462;
console.log(emp2.emid);
console.log(emp2.emname);
emp2.emname = "Vinay";
console.log(emp2.emname);
//emp2.empName="Mnan";
console.log(emp2.showDetail2());
emp2.calltest();
let emp3 = new Emp3(666, "Poonam", 10000);
console.log(Emp3.companyName);
console.log(emp3.showDetail());
console.log(emp3.emsal);
emp3.emsal = 140000;
console.log(emp3.emsal);
console.log(emp3.emid);
emp3.emid = 103;
console.log(emp3.emid);
console.log(emp3.emname);
emp3.emname = "kapil";
console.log(emp3.emname);
//emp3.empName="rohan";
console.log(emp3.showDetail2());
