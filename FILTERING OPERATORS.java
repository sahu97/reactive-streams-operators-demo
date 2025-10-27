Flux<Integer> numbers = Flux.just(1,2,3,4,5);
Flux<Integer> evens = numbers.filter(n -> n%2==0);
evens.subscribe(System.out::println); // 2,4
