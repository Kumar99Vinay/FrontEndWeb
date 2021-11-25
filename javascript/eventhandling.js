function showAlert(){
    let stat=confirm("do u realy wnat to finish the exam");
    if(stat){
        alert("ur exam submitted succesfuly");
    }
}

function makeaddition(num1,num2){
    console.log("Addition"+(num1+num2));
}

let testfun=function(){
    console.log("mouseover");
}
let testfun1=function(){
    console.log("mousleave");
}
function test1(num1,num2){
    let sub=num1+num2;
    return sub;
}
test1(12,12);
let anntest1=function(num1,num2){
    let sub=num1+num2;
    return sub;
}
anntest1(12,12);

let arrowtest1=(num1,num2)=>{
    let sub=num1+num2;
    return sub;
}
arrowtest1(12,12);
let arrowtest2=num=>{
    let cub=num*num*num;
    return cub;
}
arrowtest2(2);


let focusFun=()=>console.log("this is function is callrd on focus");

let blurFun=()=>console.log("this is function is callrd on blure efect");

function changeEvent(){
    console.log("change event occured");
}

function selectEvent(){
    console.log("select event occured");
}