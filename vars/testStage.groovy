// vars/testStage.groovy
def call(body) {
    // evaluate the body block, and collect configuration into the object
    def config = [:]
    body.resolveStrategy = Closure.DELEGATE_FIRST
    body.delegate = config
    body()

    // now build/test/whatever, based on the configuration provided
    stage('hidden stage') {
	steps{
		echo "building with this args: ${config.name}"
		git url: "https://github.com/spring-guides/gs-maven.git"
		sh "mvn install"
	}
    }
}

