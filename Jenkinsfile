node {

    // Set tools
    def mvnHome = tool name: 'maven3', type: 'maven'
    def jdkHome = tool name: 'jdk17', type: 'hudson.model.JDK'

    env.PATH = "${jdkHome}/bin:${mvnHome}/bin:${env.PATH}"

    stage('Checkout') {
        checkout scm
    }

    stage('Build') {
        sh 'mvn clean package'
    }

    stage('Test') {
        sh 'mvn test'
    }

    stage('Post') {
        junit '**/target/surefire-reports/*.xml'
    }
}
