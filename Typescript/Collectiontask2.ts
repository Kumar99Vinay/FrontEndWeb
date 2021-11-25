let set = new Set<string>();


set.add("Java");
set.add("Cpp");
set.add("Python");
set.add("MySQL");
set.add("Angular");

let map = new Map<number,string>();  
  
map.set(1, 'Drake');     
map.set(2, 'Jonas');       
map.set(3, 'Eric');   
map.set(4, 'Lana');  

console.log(set);
console.log( "Key is Present= " +set.has("Jonas") );   
console.log( "Size= " +set.size );   
//console.log( "Delete value= " +set.delete("Python") );   
console.log( "New Size= " +set.size );  

console.log("-----------------------------------")
  console.log(map);
console.log( "Value1= " +map.get(1)   );   
console.log("Value2= " + map.get(2) );   
console.log( "Key is Present= " +map.has(3) );   
console.log( "Size= " +map.size );   
console.log( "Delete value= " +map.delete(1) );   
console.log( "New Size= " +map.size );
console.log(map);