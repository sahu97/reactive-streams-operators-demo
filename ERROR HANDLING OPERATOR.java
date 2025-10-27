console.log("⿧ ERROR HANDLING OPERATOR:");
const { catchError } = require('rxjs/operators');
from([10, 5, 0, 2])
  .pipe(
    map(x => 10 / x),
    catchError(err => {
      console.log("Error handled:", err.message);
      return of(-1);
    })
  )
  .subscribe(x => console.log("Output:", x));