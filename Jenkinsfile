pipeline {
  agent any
  stages {
    stage('commit') {
      steps {
        echo 'Huhu - commit'
        git(poll: true, url: 'https://github.com/ollin/playground.git', branch: 'master', changelog: true)
        sh './gradlew -b ./build.gradle build --info'
      }
    }
    stage('it') {
      steps {
        echo 'haha - it'
      }
    }
  }
}