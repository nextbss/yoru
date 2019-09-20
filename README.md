# Yoru (夜)
A simple Java library for converting json to any object type and vice-versa.

[![](https://img.shields.io/badge/next-opensource-blue.svg)](https://www.nextbss.co.ao)

Usage
---------------

### Convert to Json
Use the ```toJson(T)``` method to convert any object of type ```T``` to JSON.
```java
 Coordinates coordinates = new Coordinates(10, 20, 30);
 Yoru<Coordinates> converter = new Yoru<>();
 converter.toJson(coordinates);
```

Result:
```json
{
  "x" : 10.0,
  "y" : 20.0,
  "z" : 30.0
}
```

### Convert from Json
Use the ```fromJson(String content)``` method to convert json to any type ```T```.
```java
 Yoru<Coordinates> converter = new Yoru<>();
 Coordinates coordinates = converter.fromJson(toJsonExpectation);
```


Download
---------------

This library can be used with both maven and gradle build environments. See instructions below
for more details on how to add this to your project.

**Step 1.** Add the JitPack repository to your build file

maven
```xml
<repositories>
    <repository>
        <id>jitpack.io</id>
        <url>https://jitpack.io</url>
    </repository>
</repositories>
```

gradle
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2.** Add the dependency

maven 
```xml
<dependency>
        <groupId>com.github.nextbss</groupId>
        <artifactId>yoru</artifactId>
        <version>1.0.2</version>
</dependency>
```

gradle
```
dependencies {
    implementation 'com.github.nextbss:yoru:1.0.2'
}
```

License
----------------


The library is available as open source under the terms of the [MIT License](http://opensource.org/licenses/MIT).