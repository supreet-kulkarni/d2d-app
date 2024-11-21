pipeline {
    agent any
     tools{
         maven 'maven3.9.9'
     }
    stages {
        stage('Maven build') {
            steps {
                sh 'mvn package'
            }
        }
       
        }
    }
