let company="Neosoft Technologies";
console.log(company.length);
company.indexOf("t");
let upper =company.toUpperCase();
console.log(upper);
console.log(company);
console.log(company.toLowerCase());
let company1="     Neosoft     Technolgies  ";
console.log(company1.trim());
console.log(company1);

company="Neosoft technologies";
console.log(company.substring(3,15));
console.log(company.substring(3));
console.log(company.substring(15,3));
console.log(company.substring(-3));
console.log(company.substring(-3,5));
console.log(company.substring(-3,-5));

console.log(company.slice(3,15));
console.log(company.slice(3));
console.log(company.slice(15,3));
console.log(company.slice(-3));
console.log(company.slice(-3,5));
console.log(company.slice(-3,-5));
console.log(company.slice(-12,-5));



let charArray=['h','e','l','l','o'];

let mixArray=["123","gari",3434.12,"puran",23,"sdbg"];
let ageArray=new Array(32,345,54,32,45);
let arr5=new Array(3);
document.write(charArray);
document.write(ageArray);
document.write(`empty array: ${arr5}`);
document.write(ageArray.length+" ");
document.write("<br>");
ageArray.push(56);
document.write(ageArray);
document.write("<br>");
document.write(ageArray.length+"  ");
let ele=ageArray.pop();
document.write("<br>  popped element"+ele);
document.write("<br>"+ageArray+"<br>");


let salaryArray=[123,234,3435,545,4554];
for(let i=0;i<salaryArray.length-1;i++){
    document.write("<b>   "+salaryArray[i]+"   <b>");
}
document.write("<br> Normal for loop backward<br>");
for(let i=salaryArray.length-1;i>=0;i--){
    document.write("<b>   "+salaryArray[i]+"   <b>");
}
document.write("<br> Enhanced fot loop <br>");
for(let salary of salaryArray)
         document.write("<b>   "+salary+"   <b>");

 document.write("<br> Using for each loop <br>");
 salaryArray.forEach(function(ele, ind, arr){
     document.write(ele+"   "+ind+" ----  "+arr);
     document.write("<br>");
 });
 salaryArray.forEach(function(ele){
     console.log(ele);
 });
 salaryArray.forEach(ele=>console.log(ele));


 salaryArray=[123,234,3435,545,4554];
 console.log("filter array");
 let filtArray=salaryArray.filter(e=>e<3400);
 console.log(filtArray);
 filtArray.forEach(el=>console.log(el));
