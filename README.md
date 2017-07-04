pcml2java-validator
======================
Repo related to https://github.com/fabtesta/pcml2java-maven-plugin.

Validators for IBM® .PCML-Files (Program Call Markup Language) pcml2java plugin generated classes.

Supports ArrayList of String each elements size validation.

Plugin is available in jitpack repository.  
Latest build [![](https://jitpack.io/v/fabtesta/pcml2java-validator.svg)](https://jitpack.io/#fabtesta/pcml2java-validator)  
Travis status [![Build Status](https://travis-ci.org/fabtesta/pcml2java-validator.svg?branch=master)](https://travis-ci.org/fabtesta/pcml2java-validator)

## Basic Usage
You could use this library indipendently from parent project pcml2java-maven-plugin.  
1) Add jitpack repository.  
2) Add it as a dependency in your pom.
```
<repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
</repository>

....

<dependency>
    <groupId>com.github.fabtesta</groupId>
    <artifactId>validator</artifactId>
    <version>1.0.0</version>
</dependency>
```
Annotated an ArrayList of String to validate the length of every single element.

```
@Size(max = 10) //THE ARRAY CAN CONTAIN MAX 10 ELEMENTS
@ArrayOfStringsElementSize(singleElementSize =  2) //EVERY STRING IN THE ARRAY MUST BE LTE OF 2
private ArrayList<String> listOfStrings;
```
