testing phase comes after developing but unit testing is something which is done while developing 

each small fucntions performing a particular task can be considered as a unit and can be tested , this i called unit testing  

-------------------

Purpose: Used for unit testing → checks small functions/classes with all possible inputs.

Coverage: Ensures both normal cases and edge cases (null, empty, negative, exceptions, large inputs) are tested.

Without JUnit: Manual main() + print statements → error‑prone, misses edge cases, no automation, regressions slip through.

With JUnit: Automated tests run every build, catch errors instantly, prevent regressions, and scale to hundreds of cases.

Benefits:

Detects bugs early

Covers all inputs systematically

Flags errors automatically

Professional repo standard (Maven/Gradle src/test/java)

Key Idea: JUnit acts as a safety net → verifies correctness for all inputs and catches all errors before code reaches production.

---------------

JUnit 5 Structure:

Platform → runs tests , wont be interacting with it directly but by jupiter api

Jupiter → modern API for writing tests 

Vintage → backward compatibility for old JUnit 3/4 tests

Jupiter API: Provides annotations (@Test, @BeforeEach, @AfterEach, @DisplayName, etc.) and assertions (assertEquals, assertThrows, etc.) used in test classes.

Why Jupiter:

More flexible than JUnit 4

Supports advanced features (nested tests, better lifecycle control)

Cleaner separation between writing and running tests

---------------------------------------

for generation of test file just right click on main app then press test it will show option of generate 


------------------------------------------------

assertEqual function checks if both the things are equal or not , 

right click on  the variable in assertequal then refactor and inline so that it will be in one line 

---------------

@Test annotation tells from where the junit engien or platform needs to run , similar to how mian function tells to jvm something like that , if you write this annotation then only the test engine or the platform will consider it for testing

assertequal assertarrayequal like this there are many static methods of package org.junit.jupiter.assertions class 

if jupiter comes into picture then its junit5

also older junit versions required methods to be public , this one also works fine with default 
