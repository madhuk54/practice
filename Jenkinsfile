pipeline {
    agent any

    environment {
        JAVA_HOME = ''  // ✅ Update if your Java 17 path is different
        PATH = "${env.JAVA_HOME}/bin:${env.PATH}"
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
                sh 'java User'
            }
        }
    }
}
