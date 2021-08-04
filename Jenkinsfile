      pipeline {
        agent none
        stages {
          stage("build") {
            agent any
            steps {
                sh 'mvn clean package sonar:sonar'
            }
          }