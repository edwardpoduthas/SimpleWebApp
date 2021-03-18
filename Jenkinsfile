node {
 stage('Preparation') {
  git 'https://github.com/edwardpoduthas/SimpleWebApp.git'
 }
 stage('Build') {
  sh "./gradlew clean test"
 }
 stage('Deploy') {
  sh "git push https://git.heroku.com/pacific-meadow-33975.git master"
 }
}