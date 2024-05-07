pipeline {
    agent any
     tools{
         maven 'maven3.9.6'
     }
    stages {
        stage('Maven build') {
            steps {
                sh 'mvn install'
            }
        }
        stage('Build Docker Image') {
            steps {
                sh 'docker --version'
            }
        }
    }
}
