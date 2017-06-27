class jsonTest implements Serializable {
    private String jsonInput
    def setJson(value) {
        jsonInput = value
    }
    def getJson() {
	def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText(jsonInput)
        return object
    }
}
