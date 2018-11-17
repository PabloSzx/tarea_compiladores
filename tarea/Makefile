all:
	javac -cp java-cup-11b-runtime.jar:. -d . *.java
	cp *.java /home/pablosz/eclipse-workspace/ETT/src/ett
	java -cp java-cup-11b-runtime.jar:. ett.ETT
pre:
	java -cp java-cup-11b.jar:. java_cup.Main as.cup  
	jflex al.flex
