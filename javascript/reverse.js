var number = prompt("Please enter the number  :", " ");
var n= number;
var rev = 0, remaining;
while (n>0)
{
remaining = n % 10;
rev = rev * 10 + remaining ;
n = Math.floor(n/10);
}
document.write("The original input number is : " +number+ " <br/> The reverse of input number is : " +rev+ "\n");