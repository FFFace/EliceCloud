### Application context 애플리케이션 컨텍스트
- 애플리케이션 컨텍스트는 스프링의 핵심이다. 애플리케이션 컨텍스트는 스프링 컨테이너를 생성하고 관리하는 책임을 가진다. 또한, 애플리케이션 컨텍스트는 스프링의 다양한 기능을 담당하며, DI, AOP, 메시지 등을 처리한다.
- 스프링 프레임워크에서 애플리케이션 컨텍스트(Application Context)는 스프링 IoC(Inversion of Control) 컨테이너의 핵심 인터페이스 중 하나임. 애플리케이션의 설정 정보를 관리하고, 스프링이 제공하는 다양한 기능을 애플리케이션 전반에 걸쳐 제공하는 중앙 집중식 인스턴스임.

애플리케이션 컨텍스트는 다음과 같은 역할을 수행함:
1. **빈(Bean)의 생명주기 관리**: 애플리케이션 컨텍스트는 스프링 빈의 생성, 초기화, 파괴 과정을 관리함. 개발자는 빈의 정의를 XML, 애노테이션, 자바 설정 파일 등으로 선언하고, 스프링 컨테이너는 이러한 정의에 따라 객체를 생성하고 의존성을 주입함(DI).
2. **의존성 주입(Dependency Injection)**: 애플리케이션 컨텍스트는 빈 간의 의존성을 관리하고, 필요한 곳에 자동으로 주입함. 이를 통해 결합도를 낮추고, 코드의 재사용성 및 유지보수성을 향상시킴.
3. **애플리케이션의 설정 정보 제공**: 애플리케이션의 구성 요소 및 환경 설정 정보를 로드하고 관리함. 이 정보는 프로퍼티 파일, XML 설정 파일, 애노테이션 등 다양한 방식으로 정의될 수 있음.
4. **다양한 기능의 제공**: 이벤트 발행, 국제화 지원, 데이터 접근 지원 등 스프링 프레임워크가 제공하는 다양한 기능을 애플리케이션 컴포넌트에서 쉽게 사용할 수 있도록 함.
5. **AOP(Aspect-Oriented Programming) 지원**: 애플리케이션 컨텍스트는 AOP를 이용한 관점 지향 프로그래밍을 지원하여, 공통적인 관심사(예: 보안, 트랜잭션 관리)를 애플리케이션의 다른 부분에 영향을 주지 않고 분리하여 관리할 수 있게 함.
- 애플리케이션 컨텍스트는 `ApplicationContext` 인터페이스를 통해 사용되며, 스프링 부트와 같은 프레임워크는 이를 자동으로 구성해줌. 개발자는 스프링의 애노테이션 및 설정을 통해 필요한 빈과 설정 정보를 선언하기만 하면, 스프링이 실행 시 애플리케이션 컨텍스트를 생성하고 관리함.