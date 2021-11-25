var Employee = /** @class */ (function () {
    function Employee() {
    }
    Employee.prototype.showDetail = function () {
        return " id" + this.empId + " name:" + this.empName + " salary:" + this.empSalary + " married?" + this.married;
    };
    Employee.prototype.showDetail2 = function () {
        return "id: " + this.empId + " name: " + this.empName + " salary: " + this.empSalary + " married: " + this.married;
    };
    return Employee;
}());
var num;
var s1;
var emp1; //user defined data type
emp1 = new Employee(); //default constructor
emp1.empId = 123;
emp1.empName = "Vinay";
emp1.empSalary = 12000;
emp1.married = true;
var detail1 = emp1.showDetail();
console.log(detail1);
var emp2; //user defined data type
emp2 = new Employee(); //default constructor
emp2.empId = 123;
emp2.empName = "Sumit";
emp2.empSalary = 12000;
emp2.married = false;
var detail2 = emp1.showDetail2();
console.log(detail2);
