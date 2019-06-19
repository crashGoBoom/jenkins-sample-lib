#!groovy
def updateJsonValue(String val, String outputFileName) {
  def data = readJSON file:'json/test.json'
    for(item in data)
    {
      if (item.ParameterKey == "SomeOtherParam4") {
          item.ParameterValue = val
      }
    }
  writeJSON file: outputFileName, json: data, pretty: 4
}

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
          updateJsonValue ('newvalue', 'env-testing.json')
        }
        sh 'cat env-testing.json'
      }
    }
  }
  post {
    cleanup {
      step([$class: 'WsCleanup'])
    }
  }
}
