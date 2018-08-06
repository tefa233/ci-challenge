pipeline {
    agent any
    stages {
        stage('build') {
            steps {
                sh "echo 'building SUT....'"
                sh "sleep 10 SECONDS"
                sh "echo 'deploying SUT....'"
                sh "sleep 10 SECONDS"
            }
        }
        stage('Execute Automation Testing'){
            steps{
               sh 'chmod ugo+x chromedriver'
               sh './gradlew test aggregate'
            }
        }
    }
}
