import groovy.json.JsonSlurper

def call(value) {

    sh "echo ${value.file} >> test.file"
    sh "cat test.file"
    def jsonString = '{"person":{"name":"Mundus","age":33,"pets":["dog","cat"]}}'
    def newMap = parseJson(jsonString)
    sh "echo ${newMap.person.name} >> testSlurper.file"
    sh "cat testSlurper.file"
}

@NonCPS
def parseJson(jsonString) {
    // Would like to use readJSON step, but it requires a context, even for parsing just text.
    def lazyMap = new JsonSlurper().parseText(jsonString)
    // JsonSlurper returns a non-serializable LazyMap, so copy it into a regular map before returning
    def m = [:]
    m.putAll(lazyMap)
    lazyMap = null
    return m
}
