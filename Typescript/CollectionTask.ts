let map = new Map<string,number>();
map.set("A", 1);
map.set("B", 2);
map.set("C", 3);


for (let [key, value] of map) {
  console.log(key, value);
}

console.log(map.get("A"));
console.log(map.has("A"));
console.log(map.size);

map.delete("A");
console.log(map.size);

map.clear();
console.log(map.size);


// Set
let set = new Set<string>();
set.add('APPLE');
set.add('ORANGE');
set.add('MANGO');


let set2 = new Set<string>()
  .add('APPLE')
  .add('ORANGE')
  .add('MANGO');

let set3 = new Set(['APPLE', 'ORANGE', 'MANGO']);

console.log(set.has('APPLE'));

set.delete('APPLE');

console.log(set.size);

set.clear();
console.log(set.size);
