#!/bin/bash

# Simple build script for Java Practice repository

# Initialize variables
SOURCE_DIR="src"
ACTION=$1
FILE_PATH=$2

# Function to compile a specific file
compile_file() {
    local file_path=$1
    echo "Compiling $file_path..."
    javac "$file_path"
}

# Function to run a class
run_class() {
    local class_name=$1
    echo "Running $class_name..."
    java -cp "$SOURCE_DIR" "$class_name"
}

# Function to compile all Java files in the repository
compile_all() {
    echo "Compiling all Java files..."
    find "$SOURCE_DIR" -name "*.java" -type f -exec javac {} \;
}

# Display help
show_help() {
    echo "Usage: ./build.sh [action] [file_or_class]"
    echo ""
    echo "Actions:"
    echo "  compile <file_path>    - Compile a specific Java file"
    echo "  run <class_name>       - Run a compiled Java class (fully qualified name)"
    echo "  compile-all            - Compile all Java files in the repository"
    echo "  clean                  - Remove all compiled .class files"
    echo "  help                   - Display this help message"
    echo ""
    echo "Examples:"
    echo "  ./build.sh compile src/general/HelloWorld.java"
    echo "  ./build.sh run general.HelloWorld"
    echo "  ./build.sh compile-all"
    echo "  ./build.sh clean"
}

# Clean compiled files
clean() {
    echo "Cleaning compiled files..."
    find "$SOURCE_DIR" -name "*.class" -type f -delete
    echo "Cleaned all .class files."
}

# Main execution
case "$ACTION" in
    compile)
        if [ -z "$FILE_PATH" ]; then
            echo "Error: No file path specified."
            show_help
            exit 1
        fi
        compile_file "$FILE_PATH"
        ;;
    run)
        if [ -z "$FILE_PATH" ]; then
            echo "Error: No class name specified."
            show_help
            exit 1
        fi
        run_class "$FILE_PATH"
        ;;
    compile-all)
        compile_all
        ;;
    clean)
        clean
        ;;
    help|*)
        show_help
        ;;
esac
