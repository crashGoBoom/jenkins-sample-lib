import groovy.json.JsonSlurper

class OptionsStuff implements Serializable {

    String file
    String password

}

def call(value) {
    def x = new OptionsStuff()
    def x.file = value
    sh "echo ${opts.file} >> test.file"
    sh "cat test.file"
}
