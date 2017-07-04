import groovy.json.JsonSlurper
import org.me.Options

def call(value) {
    def x = new Options()
    x.file = value
    sh "echo ${x.file} >> test.file"
    sh "cat test.file"
}
