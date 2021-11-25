const arr=[1,2,3,4,5,6];
let inc=arr.includes(4);
console.log(inc);

const arrrfilter=arr.filter(num=>num>3);
console.log(arrrfilter);
console.log(arr);

const added=arr.map(num => num+1);
console.log(added);
console.log(arr);

const sum=arr.reduce((total,value) => total+value,0);
console.log(sum);
