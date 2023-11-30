quote =["I", "am", "your", "friend"];

for (let el in quote) {
    console.log(quote);
}

console.log(quote[2]);

quote.pop("friend");

for (let el in quote) {
    console.log(quote[el]);
}

quote.push("father");

for (let el in quote) {
    console.log(quote[el]);
}
quote.unshift("luke");

for (let el of quote) {
    console.log(el);
}

console.log(quote);

var erroneousWord = "luke";
var lukeIsHere = quote.find(n => {return n === erroneousWord});
var lukeIsAt;

if (lukeIsHere) {
    lukeIsAt = quote.findIndex(n => {return n === erroneousWord});
    quote[lukeIsAt] = "no";
}

for (let el of quote) {
    console.log(el);
}

var output = "";

for (let i = 0; i < quote.length; i++) {

    if (i === quote.length - 1) {
        output += quote[i] + "!";
   } else if (quote[i] === "no") {
        output += quote[i] + ", ";
    } else {
        output += quote[i] + " "; 
    }
}

console.log(output);