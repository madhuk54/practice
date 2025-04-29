pipeline {
    agent any

    environment {
        JAVA_HOME = 'C:\\Program Files\\Java\\jdk-21'
        PATH = "${JAVA_HOME}\\bin;${env.PATH}"
    }

    stages {
        stage('Clone Repository') {
            steps {
                git branch: 'main' , url: 'https://github.com/madhuk54/practice.git'
            }
        }

        stage('Compile') {
            steps {
                sh 'javac User.java'
            }
        }

        stage('Run') {
            steps {
                sh 'java Add user@example.com'
            }
        }
    }
}
