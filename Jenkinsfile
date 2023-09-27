pipeline {
    agent any

    tools {
        jdk "1.8"
        maven "3.8.4"
    }

    parameters {
        booleanParam(defaultValue: true, description: "run UI tests", name: "go")
        booleanParam(defaultValue: false, description: "run BE tests", name: "no")
    }

    stages {
        stage("UI tests") {
            when {
                expression { return params.go }
            }
            steps {

                sh "mvn -Dtest="
            }
        }
    }

    post {
        always {
            allure([
                reportBuildPolicy: "ALWAYS",
                result: [[path: 'allure-results']]
            ])
        }
    }

}