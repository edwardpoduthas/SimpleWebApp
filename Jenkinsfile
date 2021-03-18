node {
 stage('Preparation') {
  git 'https://github.com/edwardpoduthas/SimpleWebApp.git'
 }
 stage('Build') {
  bat "./gradlew.bat clean test"
 }
 stage('Deploy') {
  bat "git push https://git.heroku.com/pacific-meadow-33975.git master"
 }
}