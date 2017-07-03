import groovy.json.JsonSlurper

def call(value) {
    def jsonSlurper = new JsonSlurper()
    def object = jsonSlurper.parseText(value)
    def otherInfo = otherLib('test')
    echo "resp from other lib: ${otherInfo.resp}"
    echo "hi from json test: ${object.name}"
}
