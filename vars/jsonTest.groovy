import groovy.json.JsonSlurper

def call(value) {
    def jsonSlurper = new JsonSlurper()
    def object = jsonSlurper.parseText(value)
    otherLib('test')
    echo "hi from json test: ${object.name}"
}
