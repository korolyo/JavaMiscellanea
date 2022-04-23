# Delete the target directory:
rm -rf target

# Create target directory:
mkdir target

# Copy resources folder:
cd src; cp -R resources ../target

# Generate class files in target directory:
javac -d target src/java/edu/school21/printer/*/*.java

# Create jar file:
jar cfm ./target/images-to-chars-printer.jar src/manifest.txt -C target .
chmod u+x target/images-to-chars-printer.jar

# Run jar file:
java -jar target/images-to-chars-printer.jar . 1