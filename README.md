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
<img width="815" alt="스크린샷 2021-01-29 오후 4 14 52" src="https://user-images.githubusercontent.com/41745717/106243692-22284380-624d-11eb-896b-4396db628605.png">

### Non blocking을 지원하는 WebFlux의 WebClient
- blocking
<img width="812" alt="스크린샷 2021-01-29 오후 4 10 57" src="https://user-images.githubusercontent.com/41745717/106243543-edb48780-624c-11eb-8a7b-a88b12cf1179.png">

- non blocking
<img width="815" alt="스크린샷 2021-01-29 오후 4 11 10" src="https://user-images.githubusercontent.com/41745717/106243596-058c0b80-624d-11eb-8b0a-d0d80433d852.png">

(사진 출처 : https://forward.nhn.com/session/26)



### Functional 프로그래밍의 경험을 제공하는 Webflux
- Router롤 이용해서 개발이 가능!
