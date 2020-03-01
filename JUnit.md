### JUnit5
Modules = Platform + Jupiter + Vintage
- Platform - Execution Engine
- Vintage - Runs legacy tests , junit4 , for backward compatibility
- Jupiter - New JUnit5 programming model
- Junit provides two APIs
	-	TestEngine API
	-	Launcher API

#### Junit4 Vs JUnit5 differences
@Before			@BeforeEach
@After			@AfterEach
@BeforeClass	@BeforeAll
@AfterClass		@AfterAll
@Ignore			@Disabled


-	@DisplyName = Custome Name for a test case, can be seen while running tests and in reports	
-	@assertAll = allows to group different assertions at the same time(putting assertions in a sequence like parameters in method)
- 	@asserTimout = verify the timeout of the given operation
-	@assertThrows =	if a given exception is throw in a piece of code
-	@Tag = group the junit tests and can be filter by tag; can be used at class or method level
	-	can be used in pom to inclusion/exclusiong using the tags
	-	regex can be used to filter using tags, packages and class names
-	@DisabledonOs = to run test based on the OS type ( = @ExtentWith(OsCondition.class))
- 	Assumptions = only run tests only if certain conditions are method
	-	assumeTrue and assumeFalse are the methods for this usage
-	@Nested = just like Java nested classes
-	@RepeatedTest - ability to repeat specific number of times
	-	{displayName} ,	{currentRepetion}, 	{totalRepetition}
-	@TestFactory = a factory of test cases; must return stream, collections,iterable or iterator of dynamic tests