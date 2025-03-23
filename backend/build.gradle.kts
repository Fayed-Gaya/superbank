plugins {
	kotlin("jvm") version "1.9.25"
	kotlin("plugin.spring") version "1.9.25"
	id("org.springframework.boot") version "3.4.0"
	id("io.spring.dependency-management") version "1.1.6"
	id("org.flywaydb.flyway") version "9.22.3"
	id("com.diffplug.spotless") version "6.12.0"
}

group = "com.superbank"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.flywaydb:flyway-core") // Flyway dependency
	implementation("org.postgresql:postgresql")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

flyway {
	url = "jdbc:postgresql://localhost:5432/superbank_db"
	user = "temp"
	password = "temp"
	locations = arrayOf("classpath:db/migration-ddl", "classpath:db/migration-dml")
}

kotlin {
	compilerOptions {
		freeCompilerArgs.addAll("-Xjsr305=strict")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

spotless {
	java {
		target("src/main/java/**/*.java", "src/test/java/**/*.java")
		googleJavaFormat()
	}
	kotlin {
		target("src/main/kotlin/**/*.kt", "src/test/java/**/*.kt")
		ktlint()
	}
}

tasks.named("build") {
	dependsOn ("spotlessCheck")
}
