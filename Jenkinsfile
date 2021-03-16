node {
   stage('Preparation') {
      git 'https://github.com/edwardpoduthas/SimpleWebApp.git'
   }
   stage('Build') {
      bat "./gradlew clean test"
   }
}