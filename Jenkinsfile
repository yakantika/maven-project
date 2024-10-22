pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                // Check out the code from Git
                git 'https://github.com/your-username/prime-number-project.git'
                // Build the project with Maven
                sh 'mvn clean compile'
            }
        }
        stage('Test') {
            steps {
                // Run tests with Maven
                sh 'mvn test'
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
