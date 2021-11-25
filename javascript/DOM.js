let artnode=document.getElementById("ganeshart");
console.log(artnode);

let nodes=document.getElementsByClassName("cl");
console.log(nodes);
let node2=document.getElementsByName("gender");
console.log(node2);
let node3=document.getElementsByTagName("p");
console.log(node3);

function showchilds(){
    console.log(artnode.children);
}
/*
let headnode=document.createElement("h2");
headnode.innerHTML="Lord Ganesha";*/

let headnode=document.createElement("h2");
let txt=document.createTextNode("Lord Ganesha");
headnode.appendChild(txt);

let fignode=document.getElementById("ganeshimg");
artnode.insertBefore(headnode,fignode)

let imgnode=document.getElementById("image");
console.log(imgnode.src);
let h=imgnode.height;
let w=imgnode.width;
console.log(h+"  "+w);
console.log(typeof h);

function zoomup(){
    h=h+50;
    w=w+50;
    imgnode.height=h;
    imgnode.width=w;
}
function zoomin(){
    h=h-50;
    w=w-50;
    imgnode.height=h;
    imgnode.width=w;
}

function showPass(){
    let checknode=document.getElementById("check");
    let passnode=document.getElementById("pass");
    if(checknode.checked==true){
        passnode.type="text";
    }else{
        passnode.type="password";
    }
}
 
let paranode=document.getElementById("para1");
paranode.addEventListener("mouseover",function(){
    changeStyle();
});

function changeStyle(){
    paranode.style.backgroundColor="yellow";
    paranode.style.color="red";
    paranode.style.fontSize="20px";
    paranode.style.border="3px solid blue";
}




let paranode2=document.getElementById("para2");
paranode2.addEventListener("mouseover",function(){
    changeStyle();
});

function changeStyle2(){
    paranode2.style.backgroundColor="yellow";
    paranode2.style.color="red";
    paranode2.style.fontSize="20px";
    paranode2.style.border="3px solid blue";
}