# Delete the target directory:
rm -rf target

# Create target directory:
mkdir target

# Generate class files in target directory:
javac -d target src/java/edu/school21/printer/*/*.java

# Run the program:
java -classpath ./target edu.school21.printer.app.Program % . /Users/acollin/Desktop/JavaMiscellanea/Java_day04/it.bmp
