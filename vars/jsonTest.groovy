import groovy.json.JsonSlurperClassic
import groovy.json.JsonOutput

def call(value) {
    sh "echo ${value.file} >> test.file"
    sh "cat test.file"
    def jsonString = '{"person":{"name":"NotUs","age":33,"pets":["dog","cat"]}}'
    def newMap = parseJson(jsonString)
    sh "echo ${newMap.person.name} >> testSlurper.file"
    sh "cat testSlurper.file"
    def jsonText = new JsonOutput().toJson(newMap)
    sh "echo ${jsonText}"
}

def parseJson(jsonString) {
    def lazyMap = new JsonSlurperClassic().parseText(jsonString)
    return lazyMap
}
