import groovy.json.JsonSlurper

class Options implements Serializable {

    String file
    String password

}

def call(value) {
    def opts = new Options()
    def opts.file = value
    sh "echo ${opts.file} >> test.file"
    sh "cat test.file"
}
