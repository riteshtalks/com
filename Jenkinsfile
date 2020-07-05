node('master') {
    stage('checkout') {
        echo '********************************'
        echo '* Cheking out project from GIT *'
        echo '********************************'
        git 'https://github.com/riteshtalks/com.git'
    }
    stage('mvnstep') {
        echo '*********************'
        echo '* Doing maven clean *'
        echo '*********************'
        bat 'mvn clean'
        echo '**********************'
        echo '* Doing maven deploy *'
        echo '**********************'
        bat 'mvn deploy'
    }  
    stage('email') {
        echo '*****************'
        echo '* Sending Email *'
        echo '*****************'
       mail bcc: '', body: '''Build run completed. Page updated
        Regards,
        Ritesh A.''', cc: '', from: '', replyTo: '', subject: 'Auto: Build run completed', to: 'riteshq@live.com,ranand@tibco.com'
    }   
}
