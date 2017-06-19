// vars/testStage.groovy
def call(name = 'default', args = '') {
    // now build/test/whatever based on the info provided
    echo "Building ${name} with these args: ${args}"
    git url: "https://github.com/spring-guides/gs-maven.git"
    sh "mvn install"
}

