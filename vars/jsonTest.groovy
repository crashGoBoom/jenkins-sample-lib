import groovy.json.JsonSlurper

class TestClass implements Serializable {

    def fields = [:]
    def copyProperties(source) {
        source.properties.each { key, value ->
	    this.fields.put(key, value)
        }
    }
}

def call(value) {

    sh "echo ${value.file} >> test.file"
    sh "cat test.file"

    def jsonString = '{"person":{"name":"Mundus","age":33,"pets":["dog","cat"]}}'
    def lazyMap = new JsonSlurper().parseText(jsonString)
    def newMap = new TestClass()
    newMap.copyProperties(lazyMap)
    lazyMap = null
    sh "echo ${newMap.fields.person} >> testSlurper.file"
    sh "cat testSlurper.file"
}
