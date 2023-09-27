pipeline {
    agent any

    tools {
        jdk "jenkin_jdk"
        maven "maven_jenkins"
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

                sh "mvn -Dtest=ui.** verify"
            }
        }
    }

    post {
        always {
            allure([
                reportBuildPolicy: "ALWAYS",
                results: [[path: 'allure-results']]
            ])
        }
    }

}