// vars/testStage.groovy
def call(Closure body) {
    // now build/test/whatever, based on the configuration provided
    node('hidden stage') {
	echo "building with this args: ${body.name}"
	git url: "https://github.com/spring-guides/gs-maven.git"
	sh "mvn install"
    }
}

