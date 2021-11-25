var Emp = /** @class */ (function () {
    function Emp(id, name, salary, status) {
        this.empId = id;
        this.empName = name;
        this.empSalary = salary;
        this.married = status;
    }
    Emp.prototype.showDetail = function () {
        return " id" + this.empId + " name:" + this.empName + " salary:" + this.empSalary + " married?" + this.married;
    };
    Emp.prototype.showDetail2 = function () {
        return "id: " + this.empId + " name: " + this.empName + " salary: " + this.empSalary + " married: " + this.married;
    };
    return Emp;
}());
var emp2 = new Emp(666, "Poonam", 10000, true);
console.log(emp2.showDetail());
emp2.empName = "Mnan";
console.log(emp2.showDetail2());
var emp3 = new Emp(666, "Poonam", 10000);
console.log(emp3.showDetail());
emp3.empName = "rohan";
console.log(emp3.showDetail2());
