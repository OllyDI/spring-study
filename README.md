# spring-study
<div>
  <h3>스프링이란</h3>
  <div>
    <p>Java 기반 애플리케이션 개발을 지원하는 오픈소스 애플리케이션 프레임워크로 간단히 스프링(Spring)이라고도 불림</p>
    <p>순수 자바 객체(POJO)만을 사용하여 복잡성을 제거하고, 단순하고 가벼운 코드로 기업용 애플리케이션을 개발하기 위한 목적으로 개발된 프레임워크(Framework)</p>
  </div>
  <br>
  
  <h3>스프링 특징 4가지</h3>
  <div>
    <ol>
      <li>
        <h4>제어 역전</h4>
          스프링은 객체의 생명 주기 및 의존성 관리를 담당하는 IoC 컨테이너를 제공. 개발자는 객체의 생성과 관계 설정을 스프링에 위임할 수 있으며, 스프링 컨테이너가 객체의 생명 주기를 관리하고 필요한 의존성을 주입.
      </li>
      <li>
        <h4>의존성 주입</h4>
          스프링은 의존성 주입을 통해 객체 간의 관계를 설정. 의존성 주입은 애플리케이션의 결합도를 낮추고 유연성과 테스트 용이성을 향상시킴.
      </li>
      <li>
        <h4>AOP지원(관점 지향 프로그래밍)</h4>
           스프링은 AOP를 지원하여 애플리케이션의 핵심 비즈니스 로직과 부가적인 기능(로깅, 트랜잭션 관리 등)을 분리하여 모듈화.
      </li>
      <li>
        <h4>웹 개발 지원</h4>
          스프링은 웹 애플리케이션 개발을 위한 다양한 기능과 웹 프레젠테이션 계층을 제공. 스프링 MVC는 유연하고 확장 가능한 웹 애플리케이션을 개발할 수 있는 MVC(Model-View-Controller) 아키텍처를 지원.
      </li>
    </ol>
  </div>
  <br>
  
  <h3>스프링 문제점 4가지</h3>
  <div>
    <ol>
      <li>
        <h4>설정의 복잡성</h4>
           스프링은 강력한 기능을 제공하기 위해 많은 설정과 구성이 필요. 이는 초기 설정의 복잡성을 증가시킬 수 있고, 초보자에게는 어렵게 느껴질 수 있음. 개발자들이 애플리케이션 컨텍스트 설정, 빈 정의, 다양한 컴포넌트 구성 등을 위해 많은 설정 코드를 작성해야 함.
      </li>
      <li>
        <h4>높은 초기 학습 난이도</h4>
          스프링은 다른 프레임워크에 비해 학습이 필요한 부분이 많음. 다양한 개념과 기능을 이해하고 사용하기 위해 시간과 노력이 필요할 수 있음.
      </li>
      <li>
        <h4>의존성 관리 문제</h4>
           전통적인 스프링 프레임워크에서는 여러 의존성과 그들의 버전을 관리하는 것이 복잡할 수 있음. 스프링 레거시에서는 의존성 주입(Dependency Injection)을 구현하기 위해 XML 설정 파일에 많은 수의 빈(Bean)을 등록해야 함. 이는 코드의 가독성을 떨어뜨리고, 의존성 관리가 어려워질 수 있음.
      </li>
      <li>
        <h4>별도 WAS 서버 구성의 번거로움</h4>
          스프링을 웹상에서 사용하기 위해서는 별도의 Web Application Server(WAS)를 설치하고, 설정해야 함. 또한, 애플리케이션을 서비스하기 위해서 별도의 서버에 수동으로 배포해야 하는 번거로움이 있음.
      </li>
    </ol>
    <h4>이와 같은 스프링의 문제점을 해결해 주기 위해 스프링의 프레임워크들이 개발되었는데 스프링 프레임워크 중 대표적인 Spring Boot가 있음. </h4>
  </div>
  <br>
  
  <h3>스프링 환경구축 순서 (vscode, Spring Ver 3.2.3)</h3>
  <div>
    <ol>
      <li>
        vscode에서 Spring Boot Extension Pack, Extension Pask for Java 설치
        <br></br>
        <img src="https://github.com/OllyDI/spring-study/assets/71002104/6c4ea2c7-e3ab-4641-a04e-5f3a3f48adb6">
        <img src="https://github.com/OllyDI/spring-study/assets/71002104/cecf28b4-eb64-4254-8a13-e6e35b7a5a1c">
      </li>
      <br></br>
      <li>
        vscode에서 명령 팔레트를 열어 "Spring Initialzr: Create a Gradle Project"를 클릭하여 스프링 프로젝트 생성
        <br></br>
        <img src="https://github.com/OllyDI/spring-study/assets/71002104/1477adf3-29ee-4add-b7cd-6b25d7227029">
      </li>
      <br></br>
      <li>
        '프로젝트명/src/main/java' 경로에 존재하는 메인 실행파일을 실행하여 서버 실행
        <br></br>
        <img src="https://github.com/OllyDI/spring-study/assets/71002104/81276574-6627-4e2e-bf30-cb6ab99109e1">
      </li>
      <br></br>
      <li>
        http://localhost:8080 으로 접속하여 실행 확인
        <br></br>
        <img src="https://github.com/OllyDI/spring-study/assets/71002104/1b40b2c7-49b2-4ff7-a38c-bd202040148e">
      </li>
    </ol>
  </div>
</div>
