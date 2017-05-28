pipeline {
  agent any
  stages {
    stage('commit') {
      steps {
        echo 'Huhu - commit'
        git(poll: true, url: 'https://github.com/ollin/playground.git', branch: 'master', changelog: true)
      }
    }
    stage('it') {
      steps {
        echo 'haha - it'
      }
    }
  }
}