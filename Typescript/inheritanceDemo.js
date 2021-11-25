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
var Person = /** @class */ (function () {
    function Person(adharNum, name, age) {
        this.adharNum = adharNum;
        this.name = name;
        this.age = age;
    }
    Person.prototype.showPersonDetail = function () {
        return "Adhar number: " + this.adharNum + " name: " + this.name + " age " + this.age;
    };
    return Person;
}());
var Student = /** @class */ (function (_super) {
    __extends(Student, _super);
    function Student(adharNum, name, age, rollno, standard) {
        var _this = _super.call(this, adharNum, name, age) || this;
        _this.rollno = rollno;
        _this.standard = standard;
        return _this;
    }
    Student.prototype.showStudentDetail = function () {
        return this.showPersonDetail + " Roll no " + this.rollno + " standard " + this.standard;
    };
    Student.prototype.calcPercentage = function (m1, m2, m3) {
        return Math.round((m1 + m2 + m3) / 3);
    };
    return Student;
}(Person));
var Employ = /** @class */ (function (_super) {
    __extends(Employ, _super);
    function Employ(adharNum, name, age, rollno, standard, empid, salary) {
        var _this = _super.call(this, adharNum, name, age) || this;
        _this.empid = empid;
        _this.salary = salary;
        return _this;
    }
    Employ.prototype.showEmployeeDetail = function () {
        return this.showPersonDetail + " Employyeid " + this.empid + " salary " + this.salary;
    };
    Employ.prototype.calcGrossSalary = function (ta, da, hra) {
        return this.salary + ta + da + hra;
    };
    return Employ;
}(Person));
var stud = new Student(88888, "kar", 12, 111, '4th standard');
var studdetail = stud.showStudentDetail();
console.log(studdetail);
var perct = stud.calcPercentage(78, 90, 90);
console.log(perct);
var emp1 = new Employ(66666, 'sunil', 24, 101, "3th satnd", 10, 67000);
