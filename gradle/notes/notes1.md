Gradle Project Structure:

my-project/
├── build.gradle              -> Main Gradle build script
├── settings.gradle           -> Multi-project settings (optional)
├── gradlew                   -> Gradle wrapper script (Linux/Mac)
├── gradlew.bat               -> Gradle wrapper script (Windows)
├── gradle/                   -> Wrapper files (Gradle version info)
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/             -> Application source code
│   │   └── resources/        -> Configs, properties, static files
│   └── test/
│       ├── java/             -> Unit test code
│       └── resources/        -> Test configs/resources
└── build/                    -> Auto-generated build output (classes, jars)

install gradle , cmd gradle init , it asks some questions answer it , gradle is not only for java , it is build tool for many such as kotlin cpp etc ,

build.graddle is the main file like pom.xml in maven ,

it is faster then maven

if a project is built using maven and needs to be run on other system then on that system maven needs to be there unlike graddle which has small wrapper files in it , so gradle need not be there in a system if it needs to run a project built using gradle

gradle wrapper is set of scripts + small jar files which help us to run this application without manually installing gradle in a particular system

example

plugins {
    id 'java'
    id 'org.springframework.boot' version '3.2.5'
    id 'io.spring.dependency-management' version '1.1.4'
}

group = 'com.example'
version = '0.0.1-SNAPSHOT'
sourceCompatibility = '17'

repositories {
    mavenCentral()
}

dependencies {
    // Spring Boot starter for web apps (REST APIs)
    implementation 'org.springframework.boot:spring-boot-starter-web'

    // Database + JPA
    implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
    runtimeOnly 'com.mysql:mysql-connector-j:8.0.33'

    // Lombok for boilerplate reduction
    compileOnly 'org.projectlombok:lombok'
    annotationProcessor 'org.projectlombok:lombok'

    // Testing
    testImplementation 'org.springframework.boot:spring-boot-starter-test'
}

different ways of setup of springboot project 1) cmd
2) ide
3) spring initializer

same for both maven and gradle all 3

gradle build -- is the command which will do all compile test package just like mvn package command
