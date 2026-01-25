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
                    sh "./mvnw -Dmaven.test.failure.ignore=true clean package"
                }
            
            post {
                success {
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
    }
}
