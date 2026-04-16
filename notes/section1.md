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

after changing the things in pom file compile it in cmd with mvn compile command

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

mvn install will do all the work before it and also add the jar or war file to local repo teh .m2 file 
