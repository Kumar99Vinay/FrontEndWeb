

let arr=[2,1,6,4,8];
let sum=arr.reduce((acc,ele)=>acc+ele);
console.log(sum);
/*acc:!st element of that arrrya
ele 2nd element of that array  
2,1,2+1=3 acc=3 3+6=9 acc=9 9+4=13 acc=13 13+8=21 acc=21 return acc*/



let sum1=arr.reduce((acc,ele)=>acc+ele,5);
console.log(sum1);

/*acc:!st init value=5
ele 1st element of that array 

5+2=7 acc=7 7+1=8*/