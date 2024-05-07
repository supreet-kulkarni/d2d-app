pipeline {
    agent any
     tools{
         maven 'maven3.9.6'
     }
    stages {
        stage('Maven build') {
            steps {
                sh 'mvn package'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker --version'
            }
        }
    }
}
