node('master') {
    stage('checkout') {
        echo '********************************\n* Cheking out project from GIT *\n********************************'
        git 'https://github.com/riteshtalks/com.git'
    }
    stage('mvnstep') {
        echo '*********************\n* Doing maven clean *\n*********************'
        bat 'mvn clean'
        echo '**********************\n* Doing maven deploy *\n**********************'
        bat 'mvn deploy'
    }  
    stage('email') {
        echo '*****************\n* Sending Email *\n*****************'
       mail bcc: '', body: '''Build run completed. Page updated
        Regards,
        Ritesh A.''', cc: '', from: '', replyTo: '', subject: 'Auto: Build run completed', to: 'riteshq@live.com,ranand@tibco.com'
    }   
}
