# Pay-Playground

Hexagonal Architecture 로 Pay 시스템 구축 학습

---

### 도커로 실행
1. 도커 이미지 빌드
```
./gradlew docker
```

2. 도커 컴포즈 실행
```
docker-compose up -d
```

3. 정상동작 확인
```
docker ps
docker logs -f pay-playground-membership-service-1
docker logs -f pay-playground-mysql-1

스웨거 접속
http://localhost:8081/swagger-ui.html
```

