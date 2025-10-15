@Library("jenkinsSharedLibraries") _
pipeline{
    
    agent any
    
    stages{
        
        stage('hello')
        {
            steps{
                    script{
                         sharedLibraryOne()
                        }
                }
        }
        
        stage('code'){
             steps{
                   script{
                       sharedLibraryTwo("https://github.com/dubeyabhishek9719/jenkinsPractise.git","master")
                   }
             }
        }
        
           stage('build'){
             steps{
                 script{
                     sharedLibraryThree("springbootapp:latest")
                 }
            }
        }
          stage('push to docker hub'){
             steps{
                 echo "Push to docker section started"
                 withCredentials([usernamePassword(credentialsId:"dockerHubCredentials",
                 passwordVariable:"dockerHubPass",
                 usernameVariable:"dockerHubUser")]){
                 sh "docker login -u ${env.dockerHubUser}  -p ${env.dockerHubPass}"
                 sh "docker image tag springbootapp:latest ${env.dockerHubUser}/springbootapp:latest"
                 sh "docker push ${env.dockerHubUser}/springbootapp:latest"
                 echo "Push to docker section ended"
                }
                 
             }
        }
            
          stage('deploy'){
            steps{
                script{
                    sharedLibraryFour()
                }
            }
        }
    }
}
