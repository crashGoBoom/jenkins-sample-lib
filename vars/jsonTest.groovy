import groovy.json.JsonSlurper

def call(value) {
//    def x = new Options()
//    x.file = value
    sh "echo ${value.file} >> test.file"
    sh "cat test.file"
}
