import groovy.json.JsonSlurper
import org.me.Options

def call(String value) {
    def object = new Options()
    object.file = value
    object.password = 'somepassword'
    return object
}
