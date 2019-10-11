# Simple Python Interpreter
===========================================================================
## Springboot Pyrthon Inerpreter
### multi-users simple notebook server that can execute pieces of code in an a Jython interpreter using Spring Boot technology
Technologies : 
SpringBoot
Jython 
Junit
thymeleaf
fasterxml

## Project structure :
Maven project 

#download the sources :
```
git clone https://github.com/nejeoui/interpreter.git
cd interpreter
```

## Run the Junit test
ensure maven is installed and run : 
```
mvn test
```

## Run the RESTful API
```
mvn -X exec:java -Dstart-class=com.nejeoui.interpreter.InterpreterApplication

open the [Interpreter console ](http://localhost:8088/)
```
# Future enhancement 
- add spring-session jdbc to persist interpreter commands 
- stress tests with Jmeter

# Logs
1. [Test Log](mvn_test_console.MD)
2. [Exec Log](mvn_exec_console.MD)