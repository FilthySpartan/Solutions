const movies = [
    { title: "Jaws", director: "Steven Spielberg", year: "1975" },
    { title: "Star Wars", director: "George Lucas", year: "1977" },
    {
      title: "Avengers: Infinity War",
      director: "Anthony and Joe Russo",
      year: "2018"
    },
    { title: "Top Gun", director: "Tony Scott", year: "1986" },
    { title: "Justice League", director: "Zack Snyder", year: "2017" }
  ];
  
  // Part 1 - Create a function to find a movie and output it's detail
  function findMovie (movieTitle) {
    for (var m of movies) {
        if (m.title == movieTitle) {
            console.log("Title: " + m.title + " directed by " + m.director + ", in " + m.year);
        } 
        console.log(m);
    }
    console.log(m);
  }


  findMovie("Star Wars");
  // Part 2 = Create a function to return a movie object
  