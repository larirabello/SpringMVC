# SpringMVC
A web application using Spring  with MVC.

How to import the project using Eclipse?
1 - Right click in the project explorer and select "Import".
2 - In the filter shown, type "git" and select "Projects from Git", click in "Next" button.
3 - On the other screen, select "Clone URI" and click "Next".
4 - In the next screen fill the field "URI" with the url of project - https://github.com/arllenlira/SpringMVC and click in "Next"
5 - In Branch Selection, select the "master branch" (uncheck all ohters) and click "Next".
6 - In Local Destination, the eclipse filled automatically the path of local repositoy, change if you want. Click in "Next".
7 - The next screen shows the "Wizard" to help import the project, select the option "Import as general project" click in "Next".
8 - In the next screen, fill the name of the project with "SpringMVC_GIT" and click OK.
The "Project Explorer" shows the project "SpringMVC_GIT" but not as a Java project!
9 - To Import it a Java Project: right click in the Project Explorer and click in "New".
10 - In the "Create a Java Project" screen, fill the "Project name:" with SpringMVC.
11 - Unmark the option "Use dfault location" in the "Location:" field, insert the path of the project downloaded by the git (ex: C:\Users\ARLLEN\git\SpringMVC)
(To know this path: wight click in the project "SPringMVC_GIT and copy the location folder path")
12 - After fill the "Location:" click in "Browse" and select the root folder of the web project (ex:C:\Users\ARLLEN\git\SpringMVC\SpringMVC) click "OK" and after click in "Next".
13 - The eclipse will detect automatically this project as a Web Project, just click in "Finish".

Database configurations.
You can set your database configs in the file:
/SpringMVC/src/net/codejava/spring/config/MvcConfiguration.java

the DUMP of initial valid state of database is the file:
/SpringMVC/DUMP_SQL.sql

Configuring the project to your local development:
1 - Right click in the "SpringMVC" project, and select "Properties"
2 - Select in the left menu the option "Java build path" and select in the right menu the tab "Libraries".
3 - Go to the bottom ogf the list and chek if your java is configured properly, if it's marked with "unbound" double click it and select your JRE7.
4 - After the Java configured, check if have libraries with wrong path, if the path is setted wrong, select all library with errors and delete them.
5 - To add again the library with your configurations select "External JARs" and insert all content of "WebContent/lib" folder. (Ex: C:\Users\ARLLEN\git\SpringMVC\SpringMVC\WebContent\WEB-INF\lib)
6 - Click OK and rebuild the project.
It's expected the project configured properly in your project wxplorer without any errors.

Adding the project to the server:
1 - In your eclipse select the "Server" tab (in the bottom menu), if you does no have a Server, add a Tomcat 7 server and after add in the serever the project SpringMVC.
Start the server and feel the magic in:
http://localhost:8080/SpringMVC 
(Default server configuration)
