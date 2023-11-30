let age = 100;

if (age <= 17) {
    console.log("Underage");
   } else if (age > 18 && age < 65) {
    console.log("Insurable");
   } else {
    console.log("out of range");
   }

 console.log((age > 18 && age < 65) ? "Insurable" : "out of range") ;