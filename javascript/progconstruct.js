var age=parseInt(window.prompt("Enter your age for voting"));

if(age>=18){
    document.write("<b> You are allowed for voting");
    document.write("<i> click on blow link to aplly voting</i>");
}else{
    document.write("You are not allowed");
}
document.write("your age is"+age );
document.write("<br>");

var n=parseInt(window.prompt("Enter any integer number"));
var i=1;
while(i<=n){
    document.write(i+"  ");
    i++;
}
document.write("loop completed");
document.write("<br>");

for(var i=1;i<=n;i++){
    document.write(i+" ");
}

var percentage=78.4;
switch(true){
    case percentage >= 70:
         document.write("Yiu are passed with distinction");
           break;
    case percentage<=70 && percentage>=60:
          document.write("U are passed with first class");
          break;
    case percentage<60 && percentage>=40:
        document.write("U are passed");
    case percentage<40:
          document.write("U are fail");

}