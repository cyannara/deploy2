import java.text.SimpleDateFormat

def TODAY = (new SimpleDateFormat("yyMMddHHmm")).format(new Date())

pipeline {
    agent any
    
    stages {
        stage('Tag Name 확인') {
            steps{
                echo "cyannara/cicd_guestbook:${TODAY}_${BUILD_ID}"
            }
        }
    }
}
