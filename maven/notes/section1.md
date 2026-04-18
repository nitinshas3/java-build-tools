mvn archetype:generate -DgroupId=com.NitinMVN -DartifactId=NtnMVN_app -DarchetypeArtifactId=maven-archetype-quickstart -Dinteractivemode=false

create a project folder and then go to cmd and paste the above to create a project

instead of all this create an empty folder go to project stucture -> + -> add module then maven setup 

archetype is a template that defines the structure of a maven project

maven-archetype-quickstart ->java stand alone application 
webapp instead of quickstart then-> web application 

groupid - name of the organization 

artifactId -name of the app or project 

version - it still underdevelopment we use snapshot0.0.1 if ready to deploy then 1.0release 

packaging type - jar or war , default jar 
 
maven dependencies - spring hibernate etc

maven repo - from where we get dependency jar file

maven goals - used to perform various stages of the project build cycle


 -----



by default wehn we create a java project it will be in version 5 so change that in pom.xml

editing of this file can be done here but this files need to be run in cmd 

after changing the things in pom file compile it in cmd with -- mvn compile -- command

after this target folder gets created which has the jar files of our current project 

mvn clean -- command to delete the target folder 

mvn test -- command compiles the project and also unit tests it and generates report about it 

mvn package -- command the final process of bulding compiles tests and generates war or jar file based on the specification 

mvn clean -- package command like remove all the previous target files and create new one all together 

/*<dependencies>
    <dependency>
        <groupId>junit</groupId><artifactId>junit</artifactId><version>4.13.2</version>
    </dependency>
</dependencies> */
 dependency comes inside the tag of dependencies in pom xml file 

when first done it downloads dependencies in local repo and saves it in .m2 then if needed checks there if not found goes to global repo

the dependency code above you will get it in maven dependency website , choose what you want and get code 

remote repo - created by companies to maintain their private jar files 

in pom file initially about the project like artifacid group id version and all , then dependencies , mention all here which you need then plugins like which java version to use for this to compile and all needs to be mentioned , basically how the projects needs to be built

actually there is another parent pom file called effective pom which has many other plughings essential , but its hidden and needs no changes to be done 

maven build cycle ----

validate -> compile -> test -> package -> verify -> install ->deploy 

as of now we know compile test package , verify comes after jar or war file creation to test things like intergration testing etc 

mvn install --- will do all the work before it and also add the jar or war file to local repo teh .m2 file 

Bro here’s a one‑para note you can copy straight into your notes:

**In Maven, you don’t literally create a project inside another; instead you use a *multi‑module project* setup where a parent project (`pom.xml` with `<packaging>pom</packaging>`) manages multiple child modules (each with its own `pom.xml`). The parent lists modules under `<modules>`, and children inherit dependencies, plugins, and versions from the parent. This structure is used to split large apps into smaller services or libraries while keeping centralized dependency management.** 


 ---- ideal way to create a project ----


Create a parent folder → e.g. MavenProjects/.

Inside it, make separate sub‑folders for each project/module (e.g. AuthService, PaymentService, LibraryApp).

In IntelliJ, go into each empty sub‑folder and generate a Maven module/project (so IntelliJ scaffolds src/main/java, src/main/resources, src/test/java, src/test/resources, plus pom.xml).

At the very top (parent folder), you can keep a parent POM (packaging = pom) if you want to manage versions/dependencies centrally.

--------end----



**In a Maven project like mine (`src/main/java/com/NitinMVN/App.java`), the `src/main/java` folder holds all source code, and inside it IntelliJ already created a package `com.NitinMVN` where the starter `App.java` class lives. This package is just a folder structure, and I can add as many new classes as I want inside it (e.g., `User.java`, `Service.java`), or even create new packages under `com.NitinMVN` (like `com.NitinMVN.controller`, `com.NitinMVN.service`) to organize code. For configs or property files I should create `src/main/resources`, and for tests I use `src/test/java` with the same package structure (`com.NitinMVN`) so test classes line up with main code. This keeps my project clean, modular, and Maven‑standard.**

-- one more way to create a spring project is to go to spring initialilzer website and mention all the things there and add extra dependenceis if you need then click generate , it generates a zip file which can be later moved into your project folder 

--- running the project ---
uses embeded tomcat server , just right click and press run ass java application , just like uvicorn 

---- creating a maven project from ide
Click **File → New → Project** from the top-left menu. In the project creation window, first choose the **location** where you want the project (for example inside `java_build_tools/junit/examples`). The **Name** you enter will become your **artifactId**, and IntelliJ will automatically derive the base **package (groupId)** from it (you can adjust it if needed). Select **Maven Archetype** and choose the default **maven-archetype-quickstart**. Do **not** click the **Add Archetype** button — that popup is not required for normal use. Make sure Maven is selected on the left side, then click **Create**. After this, IntelliJ will show a popup asking whether to open in **This Window** or **New Window** — click **Cancel** here to avoid replacing your current workspace. Finally, go back to your main project view, locate the newly created folder, right-click the `pom.xml`, and select **Add as Maven Project** so it gets added properly as a module inside your existing project.
