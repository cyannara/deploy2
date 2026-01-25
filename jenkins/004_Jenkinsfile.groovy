pipeline {
    agent any 
    stages {
        stage('sh 플러그인 실습') { 
            steps {
                sh '''
                    id
                    echo $$
                    pwd
                    cat /proc/$(echo $$)/cmdline
                    env | sort
                    sleep 300
                '''
            }
        }
    }
}