var salary = [45000, 89000, 78000, 45000, 90000, 75000];
var sum = 0;
salary.forEach(function (ele, index, arr) {
    console.log(ele + "  " + index + "  " + arr);
    sum = sum + ele;
});
console.log(sum);
salary.forEach(function (ele) { return console.log(ele); });
console.log("----------");
var filterSalary = salary.filter(function (ele) { return ele < 80000; });
filterSalary.forEach(function (ele) { return console.log(ele); });
console.log("----");
salary.filter(function (ele) { return ele < 80000; }).forEach(function (ele) { return console.log(ele); });
console.log("----");
var incrsalary = salary.map(function (el) { return el + 5000; });
incrsalary.forEach(function (el) { return console.log(el); });
console.log("----");
salary.filter(function (ele) { return ele < 50000; }).map(function (el) { return el + 4000; }).forEach(function (el) { return console.log(el); });
console.log("----");
var summ = salary.reduce(function (acc, ele) { return acc + ele; });
console.log(summ);
var summ2 = salary.reduce(function (acc, ele) { return acc + ele; });
console.log(summ2);
