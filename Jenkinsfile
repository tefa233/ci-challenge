

def network='myNetwork'
def seleniumHub='selenium-hub-${BUILD_NUMBER}'
def chrome='chrome-${BUILD_NUMBER}'
def firefox='firefox-${BUILD_NUMBER}'


pipeline {
    agent { none }
    stages {
        stage('Setting Up Selenium Grid') {
            steps{
                sh "docker network create ${network}"
                sh "docker run -d -p 4444:4444 --name ${seleniumHub} --network ${network} selenium/hub"
                sh "docker run -d -e HUB_PORT_4444_TCP_ADDR=${seleniumHub} -e HUB_PORT_4444_TCP_PORT=4444 --network ${network} --name ${chrome} selenium/node-chrome"
            }
        }
        stage('build') {
            steps {
                sh 'mvn --version'
            }
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
