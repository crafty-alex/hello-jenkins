pipeline {
    agent any

       environment {
        SONAR_URL = "http://localhost:9000"
        SONAR_TOKEN = "23c3e38e6ab4ef6386e6622b940199b93ec6ff8b"
    }
    
    tools {
        maven "M3"
    }

    stages {
        stage('Package') {
            steps {
                git 'https://github.com/psilochan/simple-java-maven-app-original.git'

                // Run Maven on a Unix agent.
                // sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                 bat "mvn -DskipTests=true clean package"
            }
        }
        
        stage('Test') {
                 steps {              
                       bat 'mvn verify surefire-report:report-only'                                 
                    }
                }
        
           stage('Sonar') {
                steps { 
                        withSonarQubeEnv('sonar') {
                                    bat "mvn sonar:sonar -Dsonar.host.url=${SONAR_URL} -Dsonar.login=${SONAR_TOKEN}"
                        }
                    
                }
            }
        
          stage('Deployment') {
                steps {    
               bat "mvn deploy"
                }
            }
    
    }
}
