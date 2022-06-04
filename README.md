1. BasicApp
   - spring 도움 없이 코드가 어떻게 되는지

2. XmlSpringApp.java
   - applicationContext.xml 위치가 바뀌었음
   - src/resources 가 맞음 src/java/resources 가 아님.

3. JavaConfigSpringApp.java
   - @Configuration Bean 을 이용한 경우
  
4. ConfigImportSpringApp.java
   - @Configuration Bean 을 이용한 경우
   - 결과적으로 3번이랑 똑같음 @Import 가 추가된 예제
# Trouble Shooting

1. https://github.com/gretty-gradle-plugin/gretty/issues?q=javax 를 따른다.
2. implementation 'javax.servlet:jstl:1.2' 를 넣는다.

이후 빌드를 $ gradle war 하고 $ gradle appRun 으로 실행하자.
