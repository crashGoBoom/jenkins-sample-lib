import groovy.json.JsonSlurper

def call(value) {

    sh "echo ${value.file} >> test.file"
    sh "cat test.file"

    def jsonString = '{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}'
    def lazyMap = new JsonSlurper().parseText(jsonString)
    def name = lazyMap.person.name
    lazyMap = null
    sh "echo ${name} >> testSlurper.file"
    sh "cat testSlurper.file"
}
