pcml2java-validator
======================
Repo related to https://github.com/fabtesta/pcml2java-maven-plugin.

Validators for IBM® .PCML-Files (Program Call Markup Language) pcml2java plugin generated classes.

Supports ArrayList of String each elements size validation.

Plugin is available in jitpack repository.
Latest build
[![](https://jitpack.io/v/fabtesta/pcml2java-validator.svg)](https://jitpack.io/#fabtesta/pcml2java-maven-plugin)

## Basic Usage

Include following plugin-block in the pom.xml of your project. 
Define a sourceFolder where your PCML-Files are located and a packageName for the generated classes.

From version 2.1.0 supports struct arrays
From version 2.3.0 supports same struct names for different programs

```
<repositories>
	<repository>
	    <id>jitpack.io</id>
	    <url>https://jitpack.io</url>
	</repository>
</repositories>

<build>
	<plugins>
		<plugin>
			<groupId>com.github.fabtesta</groupId>
	    	<artifactId>pcml2java-maven-plugin</artifactId>
	    	<version>2.1.0</version>
			<configuration>
				<sourceFolder>src/main/resources</sourceFolder>
				<packageName>com.github.fabtesta.test</packageName>
				<generateConstants>true</generateConstants>
				<beanValidation>true</beanValidation>
				<requestSuperClass>com.github.fabtesta.test.ServiceRequest</requestSuperClass>
				<responseSuperClass>com.github.fabtesta.test.ServiceResponse</responseSuperClass>
			</configuration>
			<executions>
				<execution>
					<goals>
						<goal>gensrc</goal>
					</goals>
				</execution>
			</executions>
		</plugin>
	</plugins>
</build>
```
