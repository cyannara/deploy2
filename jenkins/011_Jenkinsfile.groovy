pipeline {
    agent any
    
    environment {
        TODAY = ''
    }
    stages {
        stage('Tag Name 확인') {
            steps{
                script {
                    TODAY = sh(returnStdout: true, script: 'date +%Y%m%d%H%M%S').trim()
                }
                echo "cyannara/cicd_guestbook:${TODAY}_${BUILD_ID}"
            }
        }
    }
}
