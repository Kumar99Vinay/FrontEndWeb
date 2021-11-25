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



let paranode1=document.getElementById("para2");
paranode1.addEventListener("mouseover",function(){
    changeStyle1();

});

function changeStyle1(){
    paranode1.style.backgroundColor="yellow";
    paranode1.style.color="red";
    paranode1.style.fontSize="20px";
    paranode1.style.border="3px solid blue";
}
