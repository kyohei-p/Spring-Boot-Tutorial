# Spring-Boot-Tutorial
## Spring Bootアプリケーションの起動
Mavenプラグインを使用して実行（Mavenが自動的にコンパイルと実行する）
```
mvn spring-boot:run
```

JARファイルを直接実行する場合（本番環境、デプロイ環境で使用される）
```
java -jar target/demo-0.0.1-SNAPSHOT.jar
```

## jarファイルの中身を見る
```
jar tvf target/demo-0.0.1-SNAPSHOT.jar.original
```

## バージョン確認
name|version
--|--
spring boot | 3.4.3
Spring CLI | 3.4.3
OpenJDK | 21.0.6
Maven(Apache Maven) | 3.9.9
