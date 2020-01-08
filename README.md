# CYX

CYX is a tiny dynamic type script language, design for learning and fun, Its syntax is similar to C family languages, It written in JAVA using [ANTLR4](https://github.com/antlr/antlr4).

# Reference

See [reference](reference_CN.md) (Chinese only) for more details.

# Test

All of the test files are in the `test` folder. You can quickly learn the syntax of CYX by checking the code.

# Build

```
mkdir out
javac -d out src/cyx/**/*.java -cp lib/antlr-4.7.2-complete.jar
```

# Run

```
java -cp ./lib/antlr-4.7.2-complete.jar:./out cyx.CYXRunner YourFilePath
```
Enjoy it.

# License

MIT License.