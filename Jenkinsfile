#!groovy
import groovy.json.JsonBuilder
import groovy.json.JsonOutput

pipeline {
  agent any

  stages {
    stage('Checkout'){
      steps {
        step([$class: 'WsCleanup'])
        checkout scm
      }
    }
    stage('Testing') {
      steps {
        script {
          def inputFile = file("test.json")
          def outputFile = new File("final.json")
          def builder = new JsonBuilder()
          def jsonNew = builder {
                  version '2.0'
              }
          json = json << jsonNew
          println JsonOutput.prettyPrint(JsonOutput.toJson(json))
        }
      }
    }
  }
  post {
    cleanup {
      step([$class: 'WsCleanup'])
    }
  }
}
