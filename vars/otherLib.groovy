import groovy.json.JsonSlurper

def call(value) {
    def object = jsonSlurper.parseText('{ "resp": "Oh hi json from otherLib" }')
    echo "hi from other lib!"
    return object
}
