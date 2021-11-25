//--------------------------------------First Name----------------------------
let fnameNode = document.getElementById("fname");
let spanNode1 = document.getElementById("error1");
function validate1(){
    let fname = fnameNode.value;

    if(fname == ''){
        spanNode1.innerHTML = "Required!";
        fnameNode.style.border = "2px solid red";
        return false;
    }
    else if(fname.includes(" ")){
        spanNode1.innerHTML = "Space not allowed!";
        fnameNode.style.border = "2px solid red";
        return false;
    }
    else{
        
        fnameNode.style.border = "2px solid green";
        return true;
   
    }
}


//--------------------------------------Last Name----------------------------
let lnameNode = document.getElementById("lname");
let spanNode2 = document.getElementById("error2");
function validate2(){
    let lname = lnameNode.value;
    spanNode2.innerHTML = "";
    
    if(lname == ""){
        spanNode2.innerHTML = "Required!";
        lnameNode.style.border = "2px solid red";
        return false;
    }
    else if(lname.includes(" ")){
        spanNode2.innerHTML = "Space not allowed!";
        lnameNode.style.border = "2px solid red";
        return false;
    }
    else{
        
        lnameNode.style.border = "2px solid green";
        return true;
    }
}


//--------------------------------------Password----------------------------
// let passNode = document.getElementById("pas");
// let spanNode3 = document.getElementById("error3");
// function validate2(){
//     let password = passNode.value;
//     spanNode3.innerHTML = "";
//     let regExp = new RegExp("^(((?=.*[a-z])(?=.*[A-Z]))|((?=.*[a-z])(?=.*[0-9]))|((?=.*[A-Z])(?=.*[0-9])))(?=.{6,})");
//     console.log(password);
//     console.log(regExp.test(password));

//     if(password == ""){
//         spanNode3.innerHTML = "Required!";
//         passNode.style.border = "2px solid red";
//     }
//     else if(password<4 || password >8){
//         spanNode2.innerHTML = "Password should be of 4 to 8 characters!";
//         passNode.style.border = "2px solid red";
//     }
//     else{
        
//         passNode.style.border = "2px solid green";
//     }
// }


let passnode=document.getElementById("pass");
let spanNode3=document.getElementById("error3");
function validate3(){
    spanNode3.innerHTML="";
    let password=passnode.value;
    let regExp = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])");
    console.log(password);
    console.log(regExp.test(password))

    if(password==''){
        spanNode3.innerHTML="this field is required";
        passnode.style.border="3px solid red";
        return false;

    }else if(password.length<4 || password.length>8){
        spanNode3.innerHTML="password should be 4 to 8 character long";
        passNode.style.border="3px solid red";
        return false;
    }else if(regExp.test(password)==false){
        spanNode3.innerHTML="password shoud be alphanumeric with special symbol";
        passnode.style.border="3px solid red";
        return false;
    }else{
        passnode.style.border="3px solid green";
        return true;
    }
}

let c_passNode=document.getElementById("c_pass");
let spanNode4=document.getElementById("error4");
function validate4(){
    spanNode4.innerHTML="";
    let password=passnode.value;
    let c_password=c_passNode.value;
    if(passnode==''){
        spanNode4.innerHTML="This field is required";
        c_passNode.style.border="3px solid red";
        return false;
    }else if(c_password != password){
        spanNode4.innerHTML="Password should match";
        c_passNode.style.border="3px solid red";
        return false;
    }else{
        c_passNode.style.border="3px solid green";
        return true;
    }
}


let c_age=document.getElementById("age");
let spanNode5=document.getElementById("error5");
function validate5(){
    
    let age=c_age.value;
    
    if(age==''){
        spanNode5.innerHTML="This field is required";
        c_age.style.border="3px solid red";
        return false;
    }else if(age<0){
        spanNode5.innerHTML="negative age is not allowed";
        c_age.style.border="3px solid red";
        return false;
    }else if(age==0){
        spanNode5.innerHTML="0 age is not allowed";
        c_age.style.border="3px solid red";
        return false;
    }else{
        c_age.style.border="3px solid green";
        return true;
    }
}

let mobNode = document.getElementById("mobileno");
let spanNode7 = document.getElementById("error6");
function validate6(){
    spanNode7.innerHTML = "";
    let mobileno = mobNode.value;

    var regmm='^([0|+[0-9]{1,5})?([7-9][0-9]{9})$';
    var regmob = new RegExp(regmm);
    let valid = regmob.test(mobileno);
   
    
   if (valid != true ){
    spanNode7.innerHTML = "Invalid Number!";
    mobNode.style.border = "2px solid red";
    return false;
   }

   else{
    mobNode .style.border = "3px solid green";
    return true;
   }
}

function validateForm(){
    let v1=validate1();
    let v2=validate2();
    let v3=validate3();
    let v4=validate4();
    let v5=validate5();
    let v6=validate6();

         return(v1 && v2 && v3 && v4 && v5 && v6 == true)

    
}