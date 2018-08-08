pipeline {
    agent any
    stages {
        stage('Deploy app (mock)') {
            steps {
                sh "echo 'building SUT....'"
                sh "sleep 10"
                sh "echo 'deploying SUT....'"
                sh "sleep 10"
            }
        }

        stage('Execute Automation Testing'){
            steps{
            // give permissions to our driver
               sh 'chmod ugo+x chromedriver'

            // starts automation execution
               sh 'mvn clean verify'

            // config reports for testing results
               publishHTML (target: [
                     allowMissing: false,
                     alwaysLinkToLastBuild: false,
                     keepAll: true,
                     reportDir: 'target/site/serenity',
                     reportFiles: 'index.html',
                     reportName: "RCov Report"
                 ])
            }
        }
    }
}
