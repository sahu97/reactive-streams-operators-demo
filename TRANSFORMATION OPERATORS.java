console.log("TRANSFORMATION OPERATORS:");
of(1, 2, 3).pipe(map(x => x * 2)).subscribe(x => console.log("map():", x));
of('A', 'B').pipe(flatMap(x => of(x, x + x))).subscribe(x => console.log("flatMap():", x));
of(1, 2, 3, 4, 5)
  .pipe(reduce((acc, val) => acc + val, 0))
  .subscribe(sum => console.log("reduce(): Sum =", sum));

console.log("----");


