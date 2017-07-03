import groovy.json.JsonSlurper

class jsonTest implements Serializable {
    private String jsonInput
    def test(value) {
        jsonInput = value
	def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText(jsonInput)
	echo "hi from json test: ${object.name}"
    }
}
