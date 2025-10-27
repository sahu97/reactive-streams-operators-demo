console.log("JOIN CREATION OPERATORS:");
merge(of(1, 3, 5), of(2, 4, 6)).subscribe(x => console.log("merge():", x));
concat(of('A', 'B'), of('C', 'D')).subscribe(x => console.log("concat():", x));
console.log("----");
