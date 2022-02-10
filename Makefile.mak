MarkdownParse.class: MarkdownParse.java
	javac MarkdownParse.java

test: MarkdownParse.class MarkdownParse.java MarkdownParseTest.java
	javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar MarkdownParse.java
	java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore MarkdownParse