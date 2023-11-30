var hanSolo = new Map ([["vehicle", "Millenium Falcon"], ["bff", "Chewbacca"], ["sweetheart", "Leia"]]);

console.log(hanSolo.size);

console.log(hanSolo.get("vehicle"));

console.log(hanSolo.has("sweetheart"));

console.log(hanSolo.has("Jedi"));

hanSolo.set("son", "Ben");

for (let i of hanSolo) {
    console.log(i);
}

hanSolo.set("bff", "Luke");

console.log(hanSolo);

hanSolo.delete("son");

console.log(hanSolo);

hanSolo.clear();

console.log(hanSolo);