node('master') {
    
    stage('checkout') {
     git 'https://github.com/riteshtalks/com.git'
}
    stage('mvnstep') {
    bat 'mvn clean'
    bat 'mvn deploy'
}  
    stage('email') {
       mail bcc: '', body: '''Build run completed. Page updated

Regards,
Ritesh A.''', cc: '', from: '', replyTo: '', subject: 'Auto: Build run completed', to: 'riteshq@live.com,ranand@tibco.com'

    }
   
}
