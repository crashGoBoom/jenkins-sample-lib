import groovy.json.JsonSlurper

class jsonTest implements Serializable {
    def test(value) {
	def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText(value)
	echo "hi from json test: ${object.name}"
    }
}
