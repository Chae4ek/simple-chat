all: clean build package run

clean:
	rm -rf bin/

build:
	mkdir -p bin/ && \
	find src/main/java/chae4ek/simplechat/ -name "*.java" > bin/sources.txt && \
	javac -bootclasspath /usr/lib/jvm/jre1.8.0_281/lib/rt.jar -d bin/classes/ -source 1.8 -target 1.8 @bin/sources.txt

package:
	jar -cmf manifest.mf bin/simplechat.jar -C bin/classes/ .

run:
	java -jar bin/simplechat.jar --server
