pipeline {
    environment{
        imageName = ""
    }
    agent any

    stages {
        stage('Git Pull') {
            steps {
                git 'https://github.com/swapniljain96/calc-devops_minipro'
            }
        }
        stage('Maven Build') {
            steps {
                script{
                    sh 'mvn clean install'
                }
            }
        }
        stage('Docker Build to Image') {
            steps {
                script{
                    imageName = docker.build "swapniljain96/calc-devops_minipro:latest"
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry('','Docker Hub Credentials'){
                    imageName.push()
                    }
                }
            }
        }
        stage('Ansbile Pull Docker Image') {
            steps {
                ansiblePlaybook becomeUser: null, installation: 'Ansible', inventory: 'deploy-docker/inventory', playbook: 'deploy-docker/calc-deploy.yml', sudoUser: null
            }
        }
    }
}
