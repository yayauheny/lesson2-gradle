# lesson2-gradle

- Created utils project, that contains StringUtils class.
- After running through 'gradle build' build.gradle creates utils-1.5.3.jar file
- utils root project contains two subprojects: api and core

Problems:
- Exceptions when try to build program, like 'Could not find org.apache.commons:commons-lang3:3.10 Required by: project :core > ru.clevertec:utils:1.5.3'
- Even if program runs correct, exception during running jar file of api project
