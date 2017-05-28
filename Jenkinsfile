pipeline {
  agent any
  stages {
    stage('commit') {
      steps {
        git(poll: true, url: 'https://github.com/ollin/playground.git', branch: 'master', changelog: true)
        sh './gradlew -b ./build.gradle build --info'
        step([$class: 'JUnitResultArchiver', testResults: '**/build/test-results/test/TEST-*.xml'])
      }
    }
    stage('it') {
      steps {
        echo 'haha - it'
      }
    }
  }
}