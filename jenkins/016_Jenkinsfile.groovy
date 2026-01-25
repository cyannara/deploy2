pipeline {
    agent any
    stages {
        stage("Slack Notification") {
            steps {
                slackSend(tokenCredentialId: 'slack-token'
                        , channel: '#교육'
                        , color: 'good'
                        , message: '김유미 교육 채널 메세지')

                slackSend(tokenCredentialId: 'slack-token'
                        , channel: '#랜덤'
                        , color: 'warning'
                        , message: '감사합니다. 랜덤 채널 메세지')

                slackSend(tokenCredentialId: 'slack-token'
                        , channel: '#일반'
                        , color: 'danger'
                        , message: '일반 채널 메세지')
            }
        }
    }
}