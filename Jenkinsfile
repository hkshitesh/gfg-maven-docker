pipeline {
  agent any
  tools {
    maven 'MAVEN_HOME' 
  }
  stages {
    stage ('MyClean') {
      steps {
       bat 'mvn clean'       
      }
    }
    stage ('MyTest') {
      steps {
        bat 'mvn test'
      }
    }    
    stage ('MyPackage') {
      steps {
        bat 'mvn package'
      }
    }   
    stage ('Deploy') {
      steps {
       echo 'Deployed'
      }
    }
  }
}
