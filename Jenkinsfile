pipeline {
    agent any
    tools {
        maven 'Maven'
    }
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/yakantika/maven-project.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install'  // Compiles the code and packages it
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'  // Runs JUnit tests
            }
        }
    }
    post {
        always {
            junit '**/target/surefire-reports/*.xml'  // Publish test results
        }
    }
}
