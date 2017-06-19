// vars/defaultStep.groovy
def call(name = 'default', args = 'install') {
    // now build/test/whatever based on the info provided
    echo "Building ${name} with these args: ${args}"
    git url: "https://github.com/spring-guides/gs-maven.git"
    // Lets run this with the global tool "maven".
    withEnv(["PATH+MAVEN=${tool 'maven'}/bin"]) {
       sh "mvn ${args}"
    }
}
