#웹플럭스가 뭘까?

## Spring Webflux
Spring Framework5에서 새롭게 추가된 모듈로 reactive한 어플리케이션 개발을 도와주는 모듈이다.


### 리액티브란?
```
In computing, reactive programming is a declarative 
programming paradigm concerned with data streams and the propagation of change.

- Wikipedia(https://en.wikipedia.org/wiki/Reactive_programming)
```
- '정확히 리액티브가 xx다' 라고 정의하기는 어려울 것 같다. 그 느낌을 알아두자
- 리액티브한 프로그램을 개발 하려면? => Non Blocking, Rx, etc..

### Spring Webflux가 선택한 Reactor Api
- 개인적으로 리액터에 대 가장 잘 정리된것 같은 블로그 
- https://javacan.tistory.com/entry/Reactor-Start-1-RS-Flux-Mono-Subscriber?category=699082

### Spring Webflux는 Spring Mvc와 완전히 다른 것인가?

### Non blocking을 지원하는 WebFlux의 WebClient

### Functional 프로그래밍의 경험을 제공하는 Webflux
- Router롤 이용해서 개발이 가능!