pipeline {    
    agent any 
    tools {
        terraform 'Terraform_1.10.3' // Ensure this matches the tool name configured in Jenkins
    }
    stages {
        stage('Git Checkout') {
            steps {
                // Clone the Git repository using credentials
                git credentialsId: 'f8ad127b-c352-4736-86d0-08486ab028fd', url: 'https://github.com/yami7/automationAzureWithTerraform.git'
            }
        }
        stage('build') {
            steps {
                // Ensure Terraform is installed and check the version
                echo 'building' //if terraform is chosen as linux..sh,in windows…bat
            }
        }
        stage('Test') {
            steps {
                // Initialize Terraform
                dir('ResourceGroup'){
                echo 'testing'
                }
            }
        }
        stage('Deploy') {
            steps {
                // Initialize Terraform
                dir('ResourceGroup'){
                echo 'deploying'
                }
            }
        }
        
        
    }
}
