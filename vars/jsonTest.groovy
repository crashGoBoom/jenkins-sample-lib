import groovy.json.JsonSlurper

class TestClass implements Serializable {

    def copyProperties(source) {
        source.properties.each { key, value ->
              this.setProperty(key, value)
            }
        }
    }
}

def call(value) {

    sh "echo ${value.file} >> test.file"
    sh "cat test.file"

    def jsonString = '{"person":{"name":"Guillaume","age":33,"pets":["dog","cat"]}}'
    def lazyMap = new JsonSlurper().parseText(jsonString)
    def newMap = new TestClass()
    newMap.copyProperties(lazyMap)
    lazyMap = null
    sh "echo ${newMap} >> testSlurper.file"
    sh "cat testSlurper.file"
}
