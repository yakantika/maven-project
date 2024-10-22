pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Check out the code from Git
                git branch: 'master', url: 'https://github.com/yakantika/maven-project.git'

                // Build the project with Maven
                bat 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // Run tests with Maven
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                // Simulate deployment step
                echo 'Deploying the application...'
            }
        }
    }

    post {
        always {
            // Archive the test results after every run
            junit '**/target/surefire-reports/*.xml'
        }
    }
}
