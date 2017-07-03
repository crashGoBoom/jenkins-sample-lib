import groovy.json.JsonSlurper

def call(value) {
    sh "echo \"DNS.1 = tcp blah\" >> test.file"
    sh "cat test.file"
    sh "ls"
}
