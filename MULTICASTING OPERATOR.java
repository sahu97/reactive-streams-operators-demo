console.log(" MULTICASTING OPERATOR:");
const { shareReplay } = require('rxjs/operators');
const source = of(1, 2, 3).pipe(shareReplay(1));
source.subscribe(x => console.log("Subscriber 1 ->", x));
source.subscribe(x => console.log("Subscriber 2 ->", x));
console.log("----");
