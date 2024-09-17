_The examination management system is a part of the self-study examination management system of the Provincial Examination Institute, which includes two parts: registration and examination management. The construction of this project not only facilitates the registration process for self-study candidates, but also strengthens the series of management operations of the provincial examination institute for self-study examination affairs._

# **Main Framework of Project**  
![image](https://github.com/user-attachments/assets/7219b63a-202c-4421-8c5f-0e9e2184dadb)  
## (1) Managing Beans  
  The program mainly accesses Beans in the container through the Spring Container, and the ApplicationContext is the most commonly used interface of the Spring Container, which has the following two implementation classes:
    _ClassPathXmlApplicationContext_: Search for a configuration file from the class loading path and create a Spring container based on the configuration file.  
    _FileSystemXmlApplicationContext_: Search for configuration files from the relative or absolute path of the file system and create Spring containers based on the configuration files.  
## (2) Dependency Injection  
  As a super factory, the Spring Container is responsible for creating and managing all Java objects, which are called Beans. The Spring Container manages the dependency relationships between Beans in the container, and Spring uses a method called "dependency injection" to manage the dependency relationships between Beans. By using dependency injection, not only can ordinary property values be injected into Beans, but also references to other Beans can be injected. Dependency injection is an excellent decoupling method that allows Beans to be organized together in configuration files rather than being hard coded together.
