import groovy.json.JsonSlurper

def call(value) {

    sh "echo ${value.file} >> test.file"
    sh "cat test.file"

    def someJsonString = '{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}'
    def json = parseJson(someJsonString)
    sh "echo ${json.person.name} >> testSlurper.file"
    sh "cat testSlurper.file"
}

def parseJson(jsonString) {
    def lazyMap = new JsonSlurper().parseText(jsonString)
    def m = [:]
    m.putAll(lazyMap)
    lazyMap = null
    return m
}
