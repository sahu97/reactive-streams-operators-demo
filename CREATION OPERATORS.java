import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

Flux<String> f1 = Flux.just("A","B","C");
Flux<Integer> f2 = Flux.fromIterable(Arrays.asList(1,2,3));
Flux<Long> f3 = Flux.range(10, 5).map(i -> (long)i);
Mono<String> m1 = Mono.just("SingleValue");
Mono<String> m2 = Mono.fromSupplier(() -> someBlockingCall());
Flux<Object> fEmpty = Flux.empty();
Mono<Object> mError = Mono.error(new RuntimeException("oops"));
