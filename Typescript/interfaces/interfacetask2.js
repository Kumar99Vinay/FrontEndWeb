var __extends = (this && this.__extends) || (function () {
    var extendStatics = function (d, b) {
        extendStatics = Object.setPrototypeOf ||
            ({ __proto__: [] } instanceof Array && function (d, b) { d.__proto__ = b; }) ||
            function (d, b) { for (var p in b) if (Object.prototype.hasOwnProperty.call(b, p)) d[p] = b[p]; };
        return extendStatics(d, b);
    };
    return function (d, b) {
        if (typeof b !== "function" && b !== null)
            throw new TypeError("Class extends value " + String(b) + " is not a constructor or null");
        extendStatics(d, b);
        function __() { this.constructor = d; }
        d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
    };
})();
var Employee = /** @class */ (function () {
    function Employee(id, name, salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Employee.prototype.showDetail1 = function () {
        return "Employye id: " + this.id + " Employee name: " + this.name + " Salary " + this.salary;
    };
    return Employee;
}());
var Manager = /** @class */ (function (_super) {
    __extends(Manager, _super);
    function Manager(id, name, salary, member, department) {
        var _this = _super.call(this, id, name, salary) || this;
        _this.member = member;
        _this.department = department;
        return _this;
    }
    Manager.prototype.showDetail2 = function () {
        return "Member: " + this.member + " Department " + this.department;
    };
    Manager.prototype.calcGrossSalary = function (ta, da, hra) {
        return this.salary + ta + da + hra;
    };
    Manager.prototype.printId = function (managerId) {
        return this.id;
    };
    return Manager;
}(Employee));
var emp = new Employee(101, "Vinay", 20000);
console.log(emp.showDetail1());
var emp1 = new Manager(105, "Abhi", 12000, 15, "Sales");
console.log(emp1.showDetail2());
console.log("Manager salary: " + emp1.calcGrossSalary(1000, 2000, 3000));
console.log("Manager Id: " + emp1.printId(106));
