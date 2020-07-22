node{
    stage('Pull from Github'){
        git credentialsId: 'GitHub_Creds', url: 'https://github.com/pandey04/DemoProject.git'
    }
    
    stage('SonarQube Code Analysis'){
        def scannerhome = tool  'SonarQube'
        withSonarQubeEnv ('SonarQube') {
            //bat 'mvn clean package sonar:sonar'
           bat "${scannerhome}/bin/sonar-scanner.bat"
   
   
}
    }
     
    stage('Build WAR File'){
        def mvn_home = tool name: 'MAVEN_HOME', type: 'maven'
        def mvn_cmd = "${mvn_home}/bin/mvn"
        bat "${mvn_cmd} clean verify package"
    }

    
    stage('Build Docker Image'){
        bat 'docker build -t shivangip/docker-jenkins-pipeline:webapp_jenkins1 .'
    }
    stage('Push Docker Image to DockerHub'){
       withCredentials([string(credentialsId: 'docker_pwd', variable: 'docker_pwd')]) {
   
        bat "docker login -u shivangip -p ${docker_pwd}"
    }
        bat 'docker push  shivangip/docker-jenkins-pipeline:webapp_jenkins1'
        
    }
    stage('Start Docker Container'){
        bat'docker run -p 8081:8080 -d shivangip/docker-jenkins-pipeline:webapp_jenkins1'
    }
}
