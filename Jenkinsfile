pipeline {    
    agent any 
    tools {
        terraform 'Terraform_1.10.3' // Ensure this matches the tool name configured in Jenkins
    }
    stages {
        stage('build') {
            steps {
                // Ensure Terraform is installed and check the version
                echo 'building' //if terraform is chosen as linux..sh,in windows…bat
            }
        }
        stage('Test') {
            when{
                expression{
                    BRANCH_NAME == 'jenkin1'
                }
            }
            steps {
                // Initialize Terraform
                echo 'testing in jenkin1'
            }
        }
        stage('Deploy') {
            steps {
                // Initialize Terraform
                echo 'deploying'
            }
        }
        
        
    }
}
