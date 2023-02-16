# Dafabet_Assignment

To run the Framework:
A. Clone the repo to your system
B. execute the command mvn clean install -U
C. then execute mvn test

PLease make sure maven and git are installed in the system. 
The framework also contains the report generated after the execution in the target/cucumber-reports folder. (Also sending it as an attachment.)

TO MAKE THE API BETTER: 

A. Make sure server side validations are there. Currently Get and post returns the same response.
B. instead of query params, path params can be used to increase efficiency.
C. Authentication can be enabled.
D. Validation messages like "invalid format" , instead of returning false.
