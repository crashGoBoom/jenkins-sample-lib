import groovy.json.JsonSlurper
import groovy.json.JsonOutput

def call(value) {
    def jsonSlurper = new JsonSlurper()
    def object = jsonSlurper.parseText(value)
    def otherInfo = otherLib('test')
    def testObject = {name:"tito", age:43}
    echo "resp from other lib: ${otherInfo.resp}"
    echo "hi from json test: ${object.name}"
    echo JsonOutput.toJson(testObject)
}
