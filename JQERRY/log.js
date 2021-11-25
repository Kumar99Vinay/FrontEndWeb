console.log("Success");




function validation1(){
    let userNode = document.getElementById("username");
    
    let username = userNode.value;
    

    if(username == ""){
        userNode.style.border = ("3px solid red");
        return true;
    }
    else{
        userNode.style.border = ("3px solid green");
        return false;
    }
    
}

function validation2(){
    let passNode = document.getElementById("password");
    
    let password = passNode.value;
    

    if(password == ""){
        passNode.style.border = ("3px solid red");
        return true;
    }
    else{
        passNode.style.border = ("3px solid green");
        return false;
    }
    
}

function validate() {
    let v1 = validation1();
    let v2 = validation2();

    return(v1&&v2);
}