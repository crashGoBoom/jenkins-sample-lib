class jsonTest implements Serializable {
    private String jsonInput
    def call(value) {
        jsonInput = value
	def jsonSlurper = new JsonSlurper()
        def object = jsonSlurper.parseText(jsonInput)
        return object
    }
}
