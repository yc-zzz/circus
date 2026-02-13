#!/usr/bin/env bash

# create bin directory if it doesn't exist
if [ ! -d "../bin" ]
then
    mkdir ../bin
fi

# delete output from previous run
if [ -e "./ACTUAL.TXT" ]
then
    rm ACTUAL.TXT
fi

# compile the code into the bin folder, terminates if error occurred
<<<<<<< HEAD
if ! javac -cp ../src -Xlint:none -d ../bin ../src/main/java/circus/*.java ../bin ../src/main/java/circus/*.java
=======
if ! javac -cp ../src -Xlint:none -d ../bin ../src/main/java/circus/*.java ../src/main/java/circus/animal/*.java ../src/main/java/circus/stuff/*.java
>>>>>>> upstream/generics_cage
then
    echo "********** BUILD FAILURE **********"
    exit 1
fi

# run the program, feed commands from input.txt file and redirect the output to the ACTUAL.TXT
<<<<<<< HEAD
java -classpath ../bin circus > ACTUAL.TXT
=======
java -classpath ../bin circus.Circus > ACTUAL.TXT
>>>>>>> upstream/generics_cage

# compare the output to the expected output
diff ACTUAL.TXT EXPECTED.TXT
if [ $? -eq 0 ]
then
    echo "Test result: PASSED"
    exit 0
else
    echo "Test result: FAILED"
    exit 1
fi
