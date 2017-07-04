import groovy.json.JsonSlurper
import org.me.Options

def call(value) {
    def x = new Options()
    def x.file = value
    sh "echo ${opts.file} >> test.file"
    sh "cat test.file"
}
