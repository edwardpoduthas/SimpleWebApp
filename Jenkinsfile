node {
   stage('Preparation') {
      git 'https://github.com/edwardpoduthas/SimpleWebApp.git'
   }
   stage('Build') {
      sh "./gradlew clean test"
   }
}