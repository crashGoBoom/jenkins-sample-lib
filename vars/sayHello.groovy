// vars/sayHello.groovy
class sayHello implements Serializable {
   def jsonSlurper = new JsonSlurper()
   def object
   def create(some_json) {
      echo "Oh hi...this came from pipeline: ${some_json}."
      object = jsonSlurper.parseText(some_json)
   }
   def get(){
      return object
	//def properties = new Result(success: true, reason: "Because it worked.")
   }

}
