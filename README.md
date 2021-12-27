接入步骤：
Step 1. Add the JitPack repository to your build file
Add it in your root build.gradle at the end of repositories:
```java
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Step 2. Add the dependency
```java
    dependencies {
	        implementation 'com.github.linpeixu:BaseConverterFactory:1.0.2'
            //或者implementation 'com.gitlab.linpeixu:BaseConverterFactory:1.0.2'
	}
```