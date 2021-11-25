//-------------------------First Name-------------------
let firstNode = document.getElementById("first_name");
function validation1(){
    let firstName = firstNode.value;

    if(firstName == ""){
        firstNode.style.border = "3px solid red";
    }
    else{
        firstNode.style.border = "3px solid green"
    }
}
//---------------------Last Name----------------------
let lastNode = document.getElementById("last_name");
function validation2(){
    let lastName = lastNode.value;

    if(lastName == ""){
        lastNode.style.border = "3px solid red";
    }
    else{
        lastNode.style.border = "3px solid green"
    }
}
//----------------Birth Day--------------------------
let dayNode = document.getElementById("Birthday_Day");
function validation3(){
    let day = dayNode.value;

    if(day == 0){
        dayNode.style.border = "3px solid red";
    }
    else{
        dayNode.style.border = "3px solid green"
    }
}
//---------------Birth Month--------------------------
let monthNode = document.getElementById("Birthday_Month");
function validation4(){
    let month = monthNode.value;

    if(month == 0){
        monthNode.style.border = "3px solid red";
    }
    else{
        monthNode.style.border = "3px solid green"
    }
}
//----------------Birth Year--------------------------
let yearNode = document.getElementById("Birthday_Year");
function validation5(){
    let year = yearNode.value;

    if(year == 0){
        yearNode.style.border = "3px solid red";
    }
    else{
        yearNode.style.border = "3px solid green"
    }
}
//--------------------Email ID-----------------------
let emailNode = document.getElementById("emailID");
function validation6(){
    let email = emailNode.value;
    var re = /\S+@\S+\.\S+/;
    let emailStat = re.test(email);

    if(email == ""){
        emailNode.style.border = "3px solid red";
    }
    else if(emailStat !=true){
        emailNode.style.border = "3px solid red";
    }
    else{
        emailNode.style.border = "3px solid green"
    }
}

//--------------------Phone Number-------------------
let numberNode = document.getElementById("number");
function validation7(){
    let number = numberNode.value;
    var regmm='^([0|+[0-9]{1,5})?([7-9][0-9]{9})$';
    var regmob = new RegExp(regmm);
    let valid = regmob.test(number);

    if(number == ""){
        numberNode.style.border = "3px solid red";
    }
    else if(valid !=true){
        numberNode.style.border = "3px solid red";
    }
    else{
        numberNode.style.border = "3px solid green"
    }
}

//------------------Address-----------------------------
let addressNode = document.getElementById("address");
function validation8(){
    let address = addressNode.value;

    if(address == ""){
        addressNode.style.border = "3px solid red";
    }
    
    else{
        addressNode.style.border = "3px solid green"
    }
}

//------------------City----------------------------
let cityNode = document.getElementById("city");
function validation9(){
    let city = cityNode.value;

    if(city == ""){
        cityNode.style.border = "3px solid red";
    }
    
    else{
        cityNode.style.border = "3px solid green"
    }
}

//-------------------PinCode-----------------------
let pincodeNode = document.getElementById("pincode");
function validation10(){
    let pincode = pincodeNode.value;

    if(pincode == ""){
        pincodeNode.style.border = "3px solid red";
    }
    
    else{
        pincodeNode.style.border = "3px solid green"
    }
}
//------------------State---------------------------
let stateNode = document.getElementById("state");
function validation11(){
    let state = stateNode.value;

    if(state == 0){
        stateNode.style.border = "3px solid red";
    }
    
    else{
        stateNode.style.border = "3px solid green"
    }
}