node {

```
// setup tools
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

stage('Post Test') {
    junit '**/target/surefire-reports/*.xml'
}

stage('Manual Approval') {
    input message: 'Lanjutkan ke tahap Deploy?', ok: 'Proceed'
}

stage('Deploy') {

    withCredentials([string(credentialsId: 'hf-token', variable: 'HF_TOKEN')]) {

        sh '''
        git config --global user.email "jenkins@local"
        git config --global user.name "jenkins"

        git clone https://mahfudl26:$HF_TOKEN@huggingface.co/spaces/mahfudl26/java-cicd-app hf-space

        cp Dockerfile hf-space/
        cp target/*.jar hf-space/

        cd hf-space
        git add .
        git commit -m "Auto deploy from Jenkins"
        git push
        '''
    }
}

stage('Run 1 Minute') {
    echo "Application running for 1 minute..."
    sleep(time: 60, unit: 'SECONDS')
}
```

}
