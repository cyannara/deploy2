pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'master', url:'https://github.com/cyannara/guestbook.git'
            }
        }
        stage('Build') {
            steps {
                sh './mvnw clean compile'
            }
        }
        stage('Unit Test') {
            steps {
                sh './mvnw test'
            }
            
            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }
        }
    }
}
