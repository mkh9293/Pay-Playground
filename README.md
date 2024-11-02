# Pay-Playground

Hexagonal Architecture 로 Pay 시스템 구축 학습

---

애플리케이션 실행 후 /swagger-ui 접속 및 동작 확인.
```
http://localhost:8008/swagger-ui
```

도커 실행 방법

1. docker descktop 실행.  
2. docker 이미지 빌드.  
아래 명령어로 실행하거나 오른쪽 gradle 창에서 docker 탭에서 docker 더블클릭
```
./gradlew :membership:docker
```

3. docker 실행.   
docker desktop 에서 images 탭에서 run 버튼 실행하거나 아래 명령어로 실행
```
docker run -d -p 8080:8080 com.playground.membership/membership:1.0.0
```

