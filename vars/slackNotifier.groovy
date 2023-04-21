#!/usr/bin/env groovy

def call(String buildResult) {
  if ( buildResult == "SUCCESS" ) {
    slackSend color: "good", message: "CONGRATULATION Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was successful !"
  }
  else if( buildResult == "FAILURE" ) { 
    slackSend color: "danger", message: "BAD NEWS Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was failed !"
  }
  else if( buildResult == "UNSTABLE" ) { 
    slackSend color: "warning", message: "BAD NEWS Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} was unstable !"
  }
  else {
    slackSend color: "danger", message: "BAD NEWS Job: ${env.JOB_NAME} with buildnumber ${env.BUILD_NUMBER} its resulat was unclear !"	
  }
}
