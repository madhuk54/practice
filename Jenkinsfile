pipeline {
    agent any
     environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-21'
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/madhuk54/practice.git'
            }
        }

        stage('Compile') {
            steps {
                bat 'javac User.java'
            }
        }

        stage('Run') {
            steps {
                bat 'java User.java'
            }
        }
    }
}


