

def network='myNetwork'
def seleniumHub='selenium-hub-${BUILD_NUMBER}'
def chrome='chrome-${BUILD_NUMBER}'
def firefox='firefox-${BUILD_NUMBER}'


pipeline {
    agent { none }
    stages {
        stage('build') {
            steps {
                sh "echo 'building SUT....'"
                sh "sleep 10000"
                sh "echo 'deploying SUT....'"
                sh "sleep 10000"
            }
        }

        stage(){
            sh 'chmod ugo+x chromedriver'
        }
    }
}

/*
pipeline {
    agent { any }
    stages {
        stage('build and deploy SUT') {
            steps {
                sh "echo 'building SUT....'"
                sh 'sleep 10000'
                sh "echo 'deploying SUT....'"
                sh 'sleep 10000'
            }
        }
        stage("Execute Automation Testing") {
            steps {
                sh 'echo testing'
                sh './gradlew test aggregate'
            }
        }
    }
}*/
