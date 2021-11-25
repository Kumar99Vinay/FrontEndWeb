let salary=[45000,89000,78000,45000,90000,75000]
let sum=0;
salary.forEach(function(ele,index,arr){
    console.log(ele+"  "+index+"  "+arr);
    sum=sum+ele;
});
console.log(sum);
salary.forEach(ele=>console.log(ele))
console.log("----------")
let filterSalary=salary.filter(ele=>ele<80000);
filterSalary.forEach(ele=>console.log(ele));
console.log("----");
salary.filter(ele=>ele<80000).forEach(ele=>console.log(ele));
console.log("----");

let incrsalary=salary.map(el=>el+5000);
incrsalary.forEach(el=>console.log(el))
console.log("----");
salary.filter(ele=>ele<50000).map(el=>el+4000).forEach(el=>console.log(el))
console.log("----");
let summ=salary.reduce((acc,ele)=>acc+ele);
console.log(summ);

let summ2=salary.reduce((acc,ele)=>acc+ele);
console.log(summ2)
